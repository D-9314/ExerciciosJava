/* Ex 3.7: Moderador do chat
 *
 * Pergunte se o usuário é administrador e se é moderador (S/N). O
 * acesso será permitido quando for administrador ou moderador.
 * Utilize duas variáveis boolean e o operador lógico ||.
 *
 * Desafio: atribua true para S e false para N.
 */
import java.util.Scanner;
public class Ex03_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String resposta;
            System.out.print("Você é um administrador ou moderador?:");
            resposta= scanner.next();
            boolean Resposta = resposta.equalsIgnoreCase("S");
  if (Resposta){
      System.out.println("Bem vindo Administrador ");
  }
  else {
      System.out.println("O usuario não tera acesso por não ser administrador");
  }
    }
}
