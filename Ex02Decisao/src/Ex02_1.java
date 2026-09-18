/*-------------------------------------------------------------------
    Ex 2.1: Subtotal e raspadinhas
    - informar o valor da compra
    - dar raspadinhas de brinde para compras acima de R$ 100

    TAREFA:
    - peça para o usuário informar o valor em reais da compra
    - se o valor for maior que R$ 100, calcule quantas raspadinhas o
      cliente deve receber: uma raspadinha para cada R$ 100
    - imprima a quantidade de raspadinhas recebidas

    ATENÇÃO:
    - não pode existir uma quantidade fracionária de raspadinhas
    - use a função Math.round() para arredondar a quantidade calculada
    - uma forma de calcular é: Math.round(valor / 100.0)
-------------------------------------------------------------------*/
import java.util.Scanner;
public class Ex02_1 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Você Gastou quantos reais:");
                double gasto = scanner.nextDouble();

                if (Math.round(gasto) > 100) {
                        int raspadinha = (int) (gasto/100);
                        System.out.println("Voce ganhou:"+raspadinha + " "+"Rasapadinha");
                }
}
        }

