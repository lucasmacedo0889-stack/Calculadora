import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);

    System.out.println("\u001B[32mDigite o primeiro numero");
    double nm1= Scanner.nextDouble();

System.out.println("Digite o segundo numero\u001B[0m");
double nm2= Scanner.nextDouble();

System.out.println("\u001B[35mEscolha a operação:");
        System.out.println("1 - Adição (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");

System.out.println("Digite sua opção");
int opcao= Scanner.nextInt();

switch (opcao) {
    case 1:System.out.println("Resultado: " + (nm1 + nm2));
        
        break;
case 2:
                System.out.println("Resultado: " + (nm1 - nm2));
                break;

            case 3:
                System.out.println("Resultado: " + (nm1 * nm2));
                break;

            case 4:
                if (nm2 != 0) {
                    System.out.println("Resultado: " + (nm1 / nm2));
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;

            default:
                System.out.println("Opção inválida!");
        }

        Scanner.close();
    }
}