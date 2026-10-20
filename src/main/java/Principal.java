
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        // Variáveis
        Scanner entrada = new Scanner(System.in);
        int n;
        int anterior = 1;
        int atual = 0;
        int proximo;

        System.out.println("Qual o termo você deseja:");
        n = entrada.nextInt();

        int i = 1;
        while (i < n) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
            i = i + 1;
        }
        //Saída
        System.out.println("O termo é :" + atual);

        entrada.close();
    }
}
