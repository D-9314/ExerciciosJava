/* Ex 3.3: Controle remoto
 *
 * Peça uma letra representando um botão: P para Play, S para Stop,
 * A para Avançar e V para Voltar. Para qualquer outra letra, informe
 * que o botão é desconhecido.
 *
 * Desafio: aceite letras maiúsculas e minúsculas.
 */
import java.util.Scanner;
public class Ex03_3 {
    public static void main(String[] args) {
        // escreva sua solução aqui
        Scanner scanner = new Scanner(System.in);
        String botão = "";
        while(!botão.equalsIgnoreCase("s")){
            System.out.println("Escolha um botão" + " " + "P para play"+ " "+ "S para stop"+ " "+ "A para avançar"+" "+ "V para voltar:" );
            botão = scanner.nextLine();
            if (botão.equalsIgnoreCase("P")){
                System.out.println("Você deu play:");
            } else if (botão.equalsIgnoreCase("A")) {
                System.out.println("Voçê avançou:");
            } else if (botão.equalsIgnoreCase("v")) {
                System.out.println("Voçê voltou:");
            }
            else if (botão.equalsIgnoreCase("S")) {
                System.out.print("Voçê saiu" );
            }
            else {
                System.out.println("Invalido"+ " ");
            }
        }
        scanner.close();
    }
}
