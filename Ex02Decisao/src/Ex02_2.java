/*-------------------------------------------------------------------
  Ex 2.2: Confirmacao de senha
  - informar uma senha
  - confirmar a senha
  - reclamar quando as senhas forem diferentes

  TAREFA:
  - peça para o usuário informar uma senha
  - peça para o usuário confirmar a senha
  - compare as duas senhas
  - se as senhas não conferirem, imprima uma mensagem reclamando
  - se as senhas conferirem, imprima uma mensagem confirmando o cadastro
  - não é necessário repetir a digitação: é só pra exercitar um IF

  ATENÇÃO:
  - para verificar se duas Strings são iguais, use o método .equals()
  - exemplo: senha.equals(confirmacao)
  - não use o operador == para comparar duas strings
  -------------------------------------------------------------------*/
import java.util.Scanner;
public class Ex02_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bom dia informe o seu nome de usuário:");
        String usuario = scanner.next();
        System.out.print("Hola"+ " "+ usuario + " " +"Por favor informe uma senha:");
        String senha = scanner.next();
        System.out.print("Por favor repetia a senha para confirmação:");
        String confirmacao = scanner.next();
        if (senha.equals(confirmacao)== true){
            System.out.print("Bem vindo"+ " "+ usuario);
            System.out.print("\nSua senta atual é:"+senha);
        }
        else {
            System.out.print("Senha confirmada está incorreta tente novamente");
        }
    }
}
