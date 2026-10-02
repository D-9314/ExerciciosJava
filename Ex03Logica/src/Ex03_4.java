/* Ex 3.4: Escolha seu personagem
 *
 * Peça o nome de um personagem: guerreiro, mago ou arqueiro. Informe
 * o personagem escolhido ou que ele não foi encontrado.
 * Compare Strings usando equals().
 *
 * Desafio: aceite letras maiúsculas e minúsculas.
 */
import java.util.Scanner;
public class Ex03_4 {
    public static void main(String[] args) {
        // escreva sua solução aqui
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bom Dia Aventureiro informe Seu Nome:");
        String nome = scanner.nextLine();
        System.out.println("Bom dia"+ " "+ nome+ " "+ "Informe sua classe:");
        String classe = scanner.next();
        if(classe.equalsIgnoreCase("Guerreiro")){
            System.out.println("====Relatorio Personagem====");
            System.out.println("Seu nome è"+ " "+ nome);
            System.out.println("Sua classe è"+ " "+ classe);
        } else if (classe.equalsIgnoreCase("Mago")) {
            System.out.println("====Relatorio Personagem====");
            System.out.println("Seu nome è"+ " "+ nome);
            System.out.println("Sua classe è"+ " "+ classe);
        } else if (classe.equalsIgnoreCase("Arqueiro")) {
            System.out.println("====Relatorio Personagem====");
            System.out.println("Seu nome è"+ " "+ nome);
            System.out.println("Sua classe è"+ " "+ classe);
        }
        else {
            System.out.println("Personagem ou classe invalida");
        }
        scanner.close();
    }
}
