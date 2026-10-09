/* Ex 3.6: Alarme
 *
 * Pergunte se uma porta e uma janela estão abertas (S/N). O alarme
 * deve disparar quando a porta ou a janela estiver aberta. Utilize o
 * operador lógico ||.
 *
 * Desafio: aceite letras maiúsculas e minúsculas.
 */
import java.util.Scanner;
public class Ex03_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String janela;
        System.out.print("As janelas estão abertas?:");
        janela =scanner.nextLine();
        System.out.print("Você que abriu?:");
        String alarme = scanner.next();
        if (janela.equalsIgnoreCase("S") && alarme.equalsIgnoreCase("S") ) {
            System.out.println("Então esta tudo bem");
        }
        else {
            System.out.println("ALARME DISPARADO !!!!!!!");
        }
    }
}
