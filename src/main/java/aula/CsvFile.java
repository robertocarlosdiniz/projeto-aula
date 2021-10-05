package aula;

import aula.exception.OutputException;

import java.io.*;
import java.util.List;

public class CsvFile {

    private File file;

    CsvFile(String path) throws Exception {
        try {
            File _file = new File(path);
            if(! _file.exists()) {
                _file.createNewFile();
            }
            this.file = _file;
        } catch (IOException e){
            throw new OutputException("Erro na criação do arquivo: " + e.getMessage());
        }
    }

    public void escrever(String cabecalho, List<Periodo> periodos) throws Exception {
        try(FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){

            bufferedWriter.write(cabecalho);
            bufferedWriter.newLine();

            for(Periodo periodo : periodos) {
                bufferedWriter.write(periodo.toCsv());
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            throw new OutputException("Erro na escrita do arquivo");
        }
    }

    public void ler() throws Exception {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            while (bufferedReader.ready()){
                System.out.println(bufferedReader.readLine());
            }
        }
        catch (IOException e){
            throw new OutputException("Erro na leitura do arquivo: " + e.getMessage());
        }
    }
}
