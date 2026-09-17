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
public class Ex02_5 {
    public static void main(String[] args) {
    }
}
