import java.util.Scanner;

public class CalculadoraPesoIdeal {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira a altura em metros
        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble(); // Lê a altura digitada pelo usuário

        // Solicitar ao usuário que indique o gênero
        System.out.print("Digite o gênero (M para masculino, F para feminino): ");
        String genero = scanner.next(); // Lê o gênero digitado pelo usuário

        double pesoIdeal = 0;

        // Verificar o gênero e calcular o peso ideal de acordo com a fórmula correspondente
        if (genero.equalsIgnoreCase("M")) { // se for masculino
            pesoIdeal = (72.7 * altura) - 58;
        } else if (genero.equalsIgnoreCase("F")) { // se for feminino
            pesoIdeal = (62.1 * altura) - 44.7;
        } else { // se o gênero informado for inválido
            System.out.println("Gênero inválido. Favor informar M para masculino ou F para feminino.");
            scanner.close();
            return; // encerra o programa
        }

        // Exibir o resultado
        System.out.println("O peso ideal é: " + pesoIdeal + " kg");

        // Fechar o objeto Scanner
        scanner.close();
    }
}
