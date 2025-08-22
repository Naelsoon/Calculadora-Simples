import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("     Escolha uma Operação    ");
        System.out.println("=============================");
        System.out.println("|       Calculadora         |");
        System.out.println("| 1- Adição                 |");
        System.out.println("| 2- Subtração              |");
        System.out.println("| 3- Divisão                |");
        System.out.println("| 4- Multiplicação          |");
        System.out.println("=============================");
        int Calcuadora = scanner.nextInt();

        switch (Calcuadora){

            case 1:
                double resultado = 0;
                System.out.println("========================");
                System.out.println("|        Adição        |");
                System.out.println("========================");
                System.out.println("Digite o primeiro numero");
                double n1 = scanner.nextDouble();
                System.out.println("Digite o segundo numero");
                double n2 = scanner.nextInt();
                resultado = (n1 + n2);
                System.out.println("Seu resultado e: " + resultado);
                break;

            case 2:
                 resultado = 0;
                System.out.println("========================");
                System.out.println("|       Subtração      |");
                System.out.println("========================");
                System.out.println("Digite o primeiro numero");
                n1 = scanner.nextDouble();
                System.out.println("Digite o segundo numero");
                n2 = scanner.nextInt();
                resultado = (n1 - n2);
                System.out.println("Seu resultado e: " + resultado);
                break;


            case 3:
                resultado = 0;
                System.out.println("========================");
                System.out.println("|       Divisão        |");
                System.out.println("========================");
                System.out.println("Digite o primeiro numero");
                n1 = scanner.nextDouble();
                System.out.println("Digite o segundo numero");
                n2 = scanner.nextInt();

                if (n2 != 0){
                    resultado = (n1 / n2);
                    System.out.println("Seu resultado e: " + resultado);
                }
                else{
                    System.out.println("Operação Invalida");
                }
                break;

            case 4:
                resultado = 0;
                System.out.println("========================");
                System.out.println("|    Multiplicação     |");
                System.out.println("========================");
                System.out.println("Digite o primeiro numero");
                n1 = scanner.nextDouble();
                System.out.println("Digite o segundo numero");
                n2 = scanner.nextInt();
                resultado = (n1 * n2);
                System.out.println("Seu resultado e: " + resultado);
                scanner.close();
                break;






        }
    }
}