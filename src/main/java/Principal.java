
import java.util.Scanner;

/**
 * Calcula o n-ésimo termo da sequência de Fibonacci.
 *
 * A sequência começa em F(0) = 0 e F(1) = 1.
 */
public class Principal {

    public static void main(String[] args) {

        // Variáveis
        Scanner entrada = new Scanner(System.in);
        int n;
        long anterior = 0;
        long atual = 1;
        long proximo;

        // Entrada
        System.out.print("Informe a posicao n da sequencia de Fibonacci: ");
        n = entrada.nextInt();

        // Processamento
        if (n < 0) {
            System.out.println("Erro: informe um numero inteiro nao negativo.");
        } else {
            if (n == 0) {
                atual = 0;
                System.out.println("F(" + n + ") = " + atual);
            } else {                
                for (int i = 2; i <= n; i++) {
                    proximo = atual + anterior;
                    anterior = atual;
                    atual = proximo;
                }
                // Saída
                System.out.println("F(" + n + ") = " + atual);
            }
        }
        entrada.close();
    }
}
