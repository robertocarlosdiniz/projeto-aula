package aula;

import aula.exception.CartaoControleException;
import aula.exception.DatabaseException;
import aula.exception.OutputException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class A1166 implements ApplicationRunner {

    MCRRepository mcrRepository;

    PeriodoRepository periodoRepository;

    @Value("${spring.datasource.url}")
    private String connectionString;

    @Value("${spring.datasource.username}")
    private String user;

    @Value("${spring.datasource.password}")
    private String password;

    private String path = "C:\\Users\\2105077311\\Desktop\\Acesso rápido\\Aulas Java - Via\\meu-arquivo-4.txt";

    A1166(MCRRepository mcrRepository,
          PeriodoRepository periodoRepository){
        this.periodoRepository = periodoRepository;
        this.mcrRepository = mcrRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        try {

            CartaoControle cartaoControle = new CartaoControle(args.getSourceArgs());
            cartaoControle.imprimir();

            List<Periodo> periodos = getPeriodos();

            for(Periodo periodo : periodos) {
                System.out.println(periodo.toCsv());
            }

            CsvFile csvFile = new CsvFile(path);
            csvFile.escrever("Cabeçalho", periodos);
            csvFile.ler();

        }
        catch (CartaoControleException e) {

        }
        catch (OutputException e) {

        }
        catch (Exception e) {

        }
        finally {

        }

    }

    private List<Periodo> getPeriodos() throws DatabaseException {
        try {
           return periodoRepository.getPeriodos();
        }
        catch (Exception e){
            throw new DatabaseException("Erro na consulta a base: " + e.getMessage());
        }
    }

    private void useJdbc() throws SQLException {

        try(Connection con = DriverManager.getConnection(connectionString, user, password)) {

            try(Statement statement = con.createStatement()) {

                try(ResultSet resultSet = statement.executeQuery(Query.QUERY)) {

                    List<Periodo> periodos = new ArrayList<>();
                    while(resultSet.next()) {
                        Periodo periodo = new Periodo();
                        periodo.setCD_MCR(resultSet.getString("CD_MCR"));
                        periodos.add(periodo);
                    }
                    System.out.println(periodos.size());
                }
            }
        }
    }

    private void useJpa() {

        MCR mcr = mcrRepository.getByIdCustomQuery(10);
        System.out.println(mcr);

        mcr = mcrRepository.getByIdCustomQueryWithParam(10);
        System.out.println(mcr);

        List<MCR> mcrs = mcrRepository.getMcr();
        System.out.println(mcrs.size());

    }

}
