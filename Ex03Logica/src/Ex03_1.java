/* Ex 3.1: Porta secreta
 *
 * Peça para o usuário escolher uma porta, digitando A, B ou C, e
 * imprima uma mensagem de acordo com a porta escolhida. Para qualquer
 * outra letra, informe que essa porta não existe.
 *
 * Desafio: aceite letras maiúsculas e minúsculas.
 */
import java.util.Scanner;
public class Ex03_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("Escolha uma porta de A a C :");
        String porta = scanner.nextLine();
        if (porta.equalsIgnoreCase("a") ){
            System.out.print("Tipo ahn tipo ehn tipo nada ver");
        }else if (porta.equalsIgnoreCase("b")) {
            System.out.print("Se ganhou o verity");
        }
else if (porta.equalsIgnoreCase("c")){
    System.out.print("Se ganhou o orelha");
        }
else {
    System.out.print("Invalido");
        }
scanner.close();
    }
}
