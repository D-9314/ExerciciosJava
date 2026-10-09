/* Ex 3.9: História interativa
 *
 * Crie uma história em que o usuário decide se entra na floresta e,
 * depois, se segue pela esquerda ou direita. Mostre o final conforme
 * as escolhas realizadas.
 *
 * Desafio: adicione uma terceira decisão e pelo menos quatro finais.
 */
import java.util.Scanner;
public class Ex03_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     System.out.println("Voce estava cansado de ficar em casa e decidiu ir numa aventura");
     System.out.println("Você encontrou uma floresta deseja entrar?:");
     String entrar = scanner.next();
     if (entrar.equalsIgnoreCase("s")){
         System.out.println("Qual caminho voce deseja entrar esquerda ou direita?:");
         String caminho = scanner.nextLine();
         if(caminho.equalsIgnoreCase("esquerda")){
             System.out.println("Você encontrou uma macieira e comeu uma maça");
         } else if (caminho.equalsIgnoreCase("Direita")) {
             System.out.println("Você encotrou um mercadinho e comprou algumas coisas");
         }
     }
     else {
         System.out.println("Você voltou pra casa e decediu ver TV");
     }
     scanner.close();
    }
}
