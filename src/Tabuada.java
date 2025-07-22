import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {

            System.out.println("Digite o número da tabuada (1 a 10) ou 0 para mostrar as tabuadas:");
            int tabuada = scanner.nextInt();

            if (tabuada < 0 || tabuada > 10) {
                System.out.println("Número inválido! Digite um número entre 0 e 10.");
            } else {
                if (tabuada == 0) {
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("Tabuada do " + i + ":");
                        for (int j = 1; j <= 10; j++) {
                            System.out.println(i + " X " + j + " = " + (i * j));
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Tabuada do " + tabuada + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
                    }
                }
            }
            System.out.println("Deseja fazer outra tabuada? (S para sim | N para não)");
            String resposta = scanner.next();

            if (!resposta.equalsIgnoreCase("S")) {
                continuar = false;
                System.out.println("Programa encerrado. Até mais!");
            }
        }
        scanner.close();
    }
}
