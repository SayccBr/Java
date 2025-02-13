import java.awt.*;
import java.security.DrbgParameters;
import java.util.Scanner;

public class Cinema {

    // Construtor da classe Cinema, inicializa o array de assentos
    public Cinema(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                arr[i][j] = 0;
            }
        }
    }

    // Método para exibir os assentos
    public void Assentos(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.printf("%d, ", arr[i][j]);
            }
            System.out.println(); // Adiciona nova linha para melhorar a visualização
        }
    }

    public void Reservar(int[][] arr, int x, int y) {
        //verificação para garantir que os índices estão dentro dos limites da matriz bidimensional
        if (x < 0 || x >= arr.length || y < 0 || y >= arr[0].length) {
            System.out.println("Posição inválida!");
        } else if (arr[x][y] == 1) {
            System.out.println("Assento já reservado!");
        } else {
            arr[x][y] = 1;
            System.out.println("Reserva feita com sucesso.");
        }
    }

    public void Menu(int[][]  arr) {
        Scanner scanner = new Scanner(System.in);
        int num = -1; // Inicializa com um valor diferente de 0 para entrar no ‘loop’

        while (num != 3) { // ‘Loop’ até que a opção "Sair" (3) seja escolhida
            System.out.println("Menu:");
            System.out.println("1 - Reservar");
            System.out.println("2 - Assentos");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            num = scanner.nextInt();

            switch (num) {
                case 1:
                    System.out.print("Digite o assento desejado: ");
                    int assentox = scanner.nextInt();
                    int assentoy = scanner.nextInt();

                    //reserva assento
                    this.Reservar(arr, assentox, assentoy);
                    break;
                case 2:
                    // Exibe os assentos
                    this.Assentos(arr);
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }


    // Método principal
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];

        // Inicializa o objeto Cinema e passa o array para o menu
        Cinema cinema = new Cinema(arr);
        cinema.Menu(arr);
    }
}
