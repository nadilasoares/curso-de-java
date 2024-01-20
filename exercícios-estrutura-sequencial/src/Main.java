//Questão 1
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x, y, soma;
//        x = sc.nextInt();
//        y = sc.nextInt();
//        soma = (int)x+y;
//        System.out.println("Soma:  "+soma);
//
//        sc.close();
//    }
//}

//Questão 2
//import java.util.Locale;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        double raio, area;
//        raio = sc.nextDouble();
//        area = 3.14159 * Math.pow(raio, 2);
//        System.out.printf("A= %.4f%n ",area);
//
//        sc.close();
//    }
//}


//Questão 3

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int A, B, C, D, DIFERENCA;
//        A = sc.nextInt();
//        B = sc.nextInt();
//        C = sc.nextInt();
//        D = sc.nextInt();
//        DIFERENCA =(A*B)-(C*D);
//        System.out.println("A diferença é: "+DIFERENCA);
//        sc.close();
//
//    }
//}

//Questão 4
//import java.util.Locale;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        int num_funcionario, horas_trabalhadas;
//        double valor_por_hora, salario;
//        num_funcionario = sc.nextInt();
//        horas_trabalhadas = sc.nextInt();
//        valor_por_hora = sc.nextDouble();
//        salario =(double) horas_trabalhadas*valor_por_hora;
//        System.out.println("Number: "+num_funcionario);
//        System.out.printf("Salary: %.2f%n", salario);
//        sc.close();
//    }
//}

//Questão 5
//import java.util.Locale;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        int codigo1, num_pecas1, codigo2, num_pecas2;
//        double valor1, valor2, valor_pago;
//        codigo1=sc.nextInt();
//        num_pecas1 = sc.nextInt();
//        valor1 = sc.nextDouble();
//        codigo2 = sc.nextInt();
//        num_pecas2 = sc.nextInt();
//        valor2 = sc.nextDouble();
//        valor_pago = (double)(num_pecas1*valor1)+(num_pecas2*valor2);
//        System.out.printf("VALOR A PAGAR: %.2f%n", valor_pago);
//        sc.close();
//    }
//}

//Questão 6
//import java.util.Locale;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
//
//        A = sc.nextDouble();
//        B = sc.nextDouble();
//        C = sc.nextDouble();
//
//        triangulo = A * C / 2.0;
//        circulo = 3.14159 * C * C;
//        trapezio = (A + B) / 2.0 * C;
//        quadrado = B * B;
//        retangulo = A * B;
//
//        System.out.printf("TRIANGULO: %.3f%n", triangulo);
//        System.out.printf("CIRCULO: %.3f%n", circulo);
//        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
//        System.out.printf("QUADRADO: %.3f%n", quadrado);
//        System.out.printf("RETANGULO: %.3f%n", retangulo);
//
//        sc.close();
//    }
//}