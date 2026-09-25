/*-------------------------------------------------------------------
  Ex 2.5: Tipos de triangulo
  - informar o comprimento de três retas (double) 
  - descobrir se eles formam um triangulo
  - descobrir o tipo do triangulo

  TAREFA:
  - peça para o usuário informar três medidas do tipo double
  - verifique se as três medidas podem representar os lados de um
    triângulo
  - se não formarem um triângulo, imprima uma mensagem informando isso
  - se formarem um triângulo, diga se ele é equilátero, isósceles ou
    escaleno

  DICA:
  - A operação lógica "E" em java é &&
  - A operação lógica "OU" em java é ||
  - A operação lógica "NÃO" em java é !

  FORMULA:
  - três lados formam um triângulo quando cada lado é menor que a soma
    dos outros dois
  - portanto, verifique as três condições:
    lado1 < lado2 + lado3
    lado2 < lado1 + lado3
    lado3 < lado1 + lado2
  - as medidas também precisam ser maiores que zero

  CLASSIFICACAO:
  - equilátero: os três lados são iguais
  - isósceles: apenas dois lados são iguais
  - escaleno: os três lados são diferentes
-------------------------------------------------------------------*/
import java.util.Scanner;

public class Ex02_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe o lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Informe o lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Informe o lado 3: ");
        double lado3 = scanner.nextDouble();


        boolean ladosPositivos = lado1 > 0 && lado2 > 0 && lado3 > 0;
        boolean eTriangulo = ladosPositivos
                && (lado1 < lado2 + lado3)
                && (lado2 < lado1 + lado3)
                && (lado3 < lado1 + lado2);

        if (eTriangulo) {

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Os lados formam um Triângulo Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Os lados formam um Triângulo Isósceles.");
            } else {
                System.out.println("Os lados formam um Triângulo Escaleno.");
            }
        } else {
            System.out.println("As medidas informadas NÃO formam um triângulo.");
        }

        scanner.close();
    }
}