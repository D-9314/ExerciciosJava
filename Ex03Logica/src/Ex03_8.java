/* Ex 3.8: Máquina de jogos
 *
 * Pergunte se o jogador possui ficha e se a máquina está funcionando
 * (S/N). O jogo poderá começar somente quando as duas condições forem
 * verdadeiras. Utilize duas variáveis boolean e o operador &&.
 */
import java.util.Scanner;
public class Ex03_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ficha;
        String maquina;
        System.out.println("Você possui uma ficha?:");
        ficha = scanner.next();
        System.out.println("A maquina está funcionando?:");
        maquina= scanner.next();
        if(ficha.equalsIgnoreCase("s")&& maquina.equalsIgnoreCase("s")){
            System.out.println("Está tudo ok! Pode jogar a vontade");
        } else if (ficha.equalsIgnoreCase("n")) {
            System.out.println("Você não tem uma ficha compre uma");
        } else if (maquina.equalsIgnoreCase("n")) {
            System.out.println("A maquina não esta funcionando tente outra ou tente novamente mais tarde");
        }
        else {
            System.out.println("Voce não tem nada suma daqui");
        }
        scanner.close();
    }
}
