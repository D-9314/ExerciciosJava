import java.util.Scanner;

/*-------------------------------------------------------------------
  Ex 1.2: Digitar e imprimir
  - só digita um nome e imprime

  TAREFA:
  - altere o programa para pedir nome e sobrenome e imprimir juntos
-------------------------------------------------------------------*/
public class Ex01_2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = teclado.next();
       System.out.println("Qual seu sobrenome:");
       String sobrenome = teclado.next();
        System.out.println("Hola meu nome é:"+ nome + "" + sobrenome);


        teclado.close();
    }
}
