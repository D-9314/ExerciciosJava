/*-------------------------------------------------------------------
  Ex 2.6: Ordem dos numeros
  - informar tres numeros
  - descobrir qual e o maior, o do meio e o menor

  TAREFA:
  - peça para o usuário informar três números do tipo double
  - descubra qual dos três números é o maior
  - descubra qual dos três números fica no meio
  - descubra qual dos três números é o menor
  - imprima os três valores nesta ordem: maior, do meio e menor

  DICA:
  - use decisões para comparar os três números
  - os números podem ser informados em qualquer ordem
-------------------------------------------------------------------*/
import java.util.Scanner;

public class Ex02_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe o primeiro número: ");
        double a = scanner.nextDouble();

        System.out.print("Informe o segundo número: ");
        double b = scanner.nextDouble();

        System.out.print("Informe o terceiro número: ");
        double c = scanner.nextDouble();

        double maior, meio, menor;


        if (a >= b && a >= c) {
            maior = a;
            if (b >= c) {
                meio = b;
                menor = c;
            } else {
                meio = c;
                menor = b;
            }
        } else if (b >= a && b >= c) {
            maior = b;
            if (a >= c) {
                meio = a;
                menor = c;
            } else {
                meio = c;
                menor = a;
            }
        } else {
            maior = c;
            if (a >= b) {
                meio = a;
                menor = b;
            } else {
                meio = b;
                menor = a;
            }
        }


        System.out.println("\nOrdem decrescente:");
        System.out.println("Maior: " + maior);
        System.out.println("Do meio: " + meio);
        System.out.println("Menor: " + menor);

        scanner.close();
    }
}
