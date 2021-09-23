package aula;

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

    @Value("${spring.datasource.url}")
    private String connectionString;

    @Value("${spring.datasource.username}")
    private String user;

    @Value("${spring.datasource.password}")
    private String password;

    A1166(MCRRepository mcrRepository){
        this.mcrRepository = mcrRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        CartaoControle cartaoControle = new CartaoControle(args.getSourceArgs());
        cartaoControle.imprimir();

        //useJpa();
        useJdbc();

        // TODO Analisar os dados
        // TODO Impressão em arquivo
    }

    private void useJdbc() throws SQLException {

        try(Connection con = DriverManager.getConnection(connectionString, user, password)){

            try(Statement statement = con.createStatement()){

                try(ResultSet resultSet = statement.executeQuery(Query.QUERY)){

                    List<Period> periods = new ArrayList<>();
                    while(resultSet.next()){
                        Period period = new Period();
                        period.setCD_MCR(resultSet.getString("CD_MCR"));
                        periods.add(period);
                    }
                    System.out.println(periods.size());
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
