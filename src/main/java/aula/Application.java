package aula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class Application {

    static String minhaString = "Minha variavel na classe";

    /*
    Este programa será utilizado nas nossas aulas

            03  CC-ID                 PIC X(03).
            03  CC-TIPO-ENV           PIC X(01).
            03  CC-CD-RRAST           PIC 9(09). Código de remessa
            03  CC-DT-LIBERACAO       PIC X(08).
    */

    public static void main(String[] args) throws Exception {

        SpringApplication.run(Application.class, args);

    }

    private static void explicandoEstatico(String[] args) throws Exception {

        CartaoControle cartaoControle = new CartaoControle(args);
        CartaoControle cartaoControle2 = new CartaoControle(args);

        System.out.println(cartaoControle.getMeuInt());
        System.out.println(cartaoControle2.getMeuInt());

        cartaoControle.setCcCdRrast(890);

        System.out.println(cartaoControle.getCcCdRrast());
        System.out.println(cartaoControle2.getCcCdRrast());

        cartaoControle.setMeuInt(3);

        System.out.println(cartaoControle.getMeuInt());
        System.out.println(cartaoControle2.getMeuInt());

        CartaoControle cartaoControle3 = new CartaoControle(args);
        System.out.println(cartaoControle3.getMeuInt());
    }

    private static void explicandoEscopo() {

        if(true){
            String minhaString = "Minha nova mensagem String";
            System.out.println(minhaString);
            if(true){

            }
        }

        System.out.println(minhaString);
    }

    private static void imprimirCartaoControle(String[] cartaoControle) {

        int i = 0;

        // While -> Enquanto
        while(i < 4) {
            System.out.println(cartaoControle[i]);
            i = i + 1;
        }

        System.out.println("Sai do while");
        System.out.println("Este é o valor de i: " + i);
        System.out.println("");

        // For -> Para
        for(int index = 0; index < 4; index = index + 1) {
            System.out.println(cartaoControle[index]);
        }

        System.out.println("Sai do for");
        System.out.println("");

        // Foreach -> Para cada um
        for(String itemCartaoControle : cartaoControle){
            System.out.println(itemCartaoControle);
        }

        System.out.println("Sai do foreach");
        System.out.println("");
    }

    private static String pegueMeuValor(String[] args) {
        return args[0];
    }

    private static void imprimirNome(String nome, String outroNome) {
        System.out.println("Meu nome é: " + nome);
        System.out.println("Meu nome é: " + outroNome);
    }

    private static void explicarVariaveis() {

        // byte -> short -> int -> long
        long meuInt = 0;
        meuInt = 2147483648L;
        int meuByte = 130;

        // float -> double
        float meuFloat = 1.0F;
        double meuDouble = -10.5;
        double meuDoublePositivo = 1000.55;

        String meuStringDouble = Double.toString(meuDoublePositivo);

        System.out.println(meuStringDouble.replace('.', ','));
        System.out.println(meuDoublePositivo);

        System.out.println(String.format("%,.2f", meuDoublePositivo));

        double meuDoubleString = Double.valueOf("10,5");
        System.out.println(meuDoubleString);

        // booleano
        boolean meuBolleanTrue = true;
        boolean meuBolleanFalse = false;
        boolean meuBolleanTeste = 1 != 2;

        int[] meuArrayInt = new int[5];
        meuArrayInt[0] = 10;
        meuArrayInt[3] = 30;
        meuArrayInt[4] = 450;

        // Alfanumerico -> char = 'A' -> String = "Sua frase aqui"
        char meuChar = 'A';
        String meuString = "O q vc quiser!! \"";
        System.out.println("O q vc quiser!! \" Olá".toUpperCase(Locale.ROOT));

        //System.out.println(meuArrayInt[0]);
        //System.out.println(meuArrayInt[3]);
        //System.out.println(meuArrayInt[4]);

        System.out.println("Eu terminei de explicar as variáveis");
    }

}
