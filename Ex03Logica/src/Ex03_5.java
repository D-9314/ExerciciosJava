/* Ex 3.5: Entrada na sala VIP
 *
 * Pergunte se a pessoa possui convite (S/N) e qual é a senha. A entrada
 * só será permitida quando possuir convite e a senha for "1234".
 * Utilize o operador lógico &&.
 *
 * Desafio: aceite S e s como resposta afirmativa.
 */
import java.util.Scanner;
public class Ex03_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senha = 1234;
       String convite;
        System.out.print("Você possui o convite:");
        convite= scanner.nextLine();
        System.out.println("Diga a senha:");
        senha = scanner.nextInt();
        if (senha==1234 && convite.equalsIgnoreCase("s")){
            System.out.println("Você pode entrar:");}
else{
    System.out.println("Você não pode entrar");
        }
scanner.close();
    }
}
