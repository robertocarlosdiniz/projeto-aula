package aula;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CartaoControle {

    private String ccId;
    private String ccTipoEnv;
    private int ccCdRrast;
    private String ccDtLiberacao;
    private static int meuInt;

    public CartaoControle(String[] cartaoControleArgs) throws Exception {
        cartaoControleArgs = validarCartaoControle(cartaoControleArgs);

        setCcId(cartaoControleArgs[0]);
        setCcTipoEnv(cartaoControleArgs[1]);
        setCcCdRrast(cartaoControleArgs[2]);
        setCcDtLiberacao(cartaoControleArgs[3]);
    }

    public int getMeuInt(){
        return meuInt;
    }

    public void setMeuInt(int _meuInt){
        this.meuInt = _meuInt;
    }


    public String getCcId() {
        return ccId;
    }

    public void setCcId(String ccId) throws Exception {
        if( !ccId.equals("** ") ){
            throw new Exception("ERRO NO CARTAO CONTROLE - CCID");
        }
        this.ccId = ccId;
    }

    public String getCcTipoEnv() {
        return ccTipoEnv;
    }

    public void setCcTipoEnv(String ccTipoEnv) throws Exception {
        if( !ccTipoEnv.equalsIgnoreCase("E") && !ccTipoEnv.equalsIgnoreCase("R") ){
            throw new Exception(">>> TIPO DE GERACAO INVALIDO");
        }
        this.ccTipoEnv = ccTipoEnv;
    }

    public int getCcCdRrast() {
        return ccCdRrast;
    }

    public void setCcCdRrast(int ccCdRrast) {
        this.ccCdRrast = ccCdRrast;
    }

    public void setCcCdRrast(String ccCdRrast) {
        setCcCdRrast(Integer.parseInt(ccCdRrast));
    }

    public String getCcDtLiberacao() {
        return ccDtLiberacao;
    }

    public void setCcDtLiberacao(String ccDtLiberacao) throws Exception {
        try {
            LocalDate.parse(ccDtLiberacao, DateTimeFormatter.ofPattern("ddMMyyyy"));
        } catch (DateTimeParseException e){
            throw new Exception("Data invalida");
        }
        this.ccDtLiberacao = ccDtLiberacao;
    }

    private String[] validarCartaoControle(String[] cartaoControle) throws Exception {

        if( cartaoControle.length != 4){
            throw new Exception("CARTÃO CONTROLE DEVE TER 4 PARAMETROS");
        }

        if( cartaoControle[2].isBlank() && cartaoControle[3].trim().isEmpty() ){
            throw new Exception(">>> CD REMESSA OU DATA OBRIGATORIO");
        }

        if(cartaoControle[2].isBlank()){
            cartaoControle[2] = "0";
        }

        if(cartaoControle[3].trim().isEmpty()){
            cartaoControle[3] = "01012021";
        }

        System.out.println("Validei as variaveis");

        return cartaoControle;
    }

    @Override
    public String toString() {
        return "CartaoControle{" +
                "ccId='" + ccId + '\'' +
                ", ccTipoEnv='" + ccTipoEnv + '\'' +
                ", ccCdRrast=" + ccCdRrast +
                ", ccDtLiberacao='" + ccDtLiberacao + '\'' +
                '}';
    }

    public void imprimir() {
        System.out.println(toString());
    }
}
