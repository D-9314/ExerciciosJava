//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex01_1 {
    public static void main(String[] args) {
        // .println pula uma linha depois de escrever
        System.out.println("Olá mundo!");

        // .print só escreve mas não pula linha
        System.out.print("Olá ");
        System.out.print("mundo, ");
        // \n pula uma linha
        System.out.print("outra vez!\n");

        // vamos criar algumas variáveis
        String nome = "Juca da Silva";
        int idade = 20;
        double altura = 1.97;
        char tamanho = 'G';
        // printf imprime variaveis misturadas no texto
        System.out.printf("Olá %s, você tem %d anos e %fm de altura? Você é tamanho %c!\n",
                nome, idade, altura, tamanho);
    }
}