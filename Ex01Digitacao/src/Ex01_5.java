/*-------------------------------------------------------------------
  Ex 1.5: Troca de dinheiro
  - informar um valor inteiro em reais, sem os centavos
  - calcular quantas notas e moedas podem ser obtidas na troca

  TAREFA:
  - peça para o usuário informar um valor inteiro em reais, sem os centavos
  - calcule e imprima quantas notas de 50, 10, 5 e 2 reais
    e quantas moedas de 1 real é preciso para fazer esse valor
  - não é necessário usar if em nenhum lugar: use apenas divisão inteira (/)
    e resto da divisão (%)

  DESAFIO:
  - depois de terminar, altere o programa para aceitar um valor double,
    incluindo os centavos
  - calcule e imprima também quantas moedas de 50, 25, 10, 5 e 1 centavo
    podem ser obtidas
-------------------------------------------------------------------*/
import java.util.Scanner;
public class Ex01_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Quantas notas em Reais voce tem R$:");
double dinheiro = scanner.nextDouble();

double cent50 = (dinheiro%0.50 );
System.out.println("\nVocê tem em moedas de 50:"+ cent50);
        double cent25 = (dinheiro%0.25 );
        System.out.println("\nVocê tem em moedas de 25:"+ cent25);
        double cent10 = (dinheiro/0.10 );
        System.out.println("\nVocê tem em moedas de 10:"+ cent10);
        double cent5 = (dinheiro/0.5 );
        System.out.println("\nVocê tem em moedas de 5:"+ cent5);
        double cent1 = (dinheiro/0.1 );
        System.out.println("\nVocê tem em moedas de 1"+ cent1);
    }
}
