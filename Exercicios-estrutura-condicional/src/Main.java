//questão 1
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int numero;
//        System.out.println("Digite um número: ");
//        numero = sc.nextInt();
//        if(numero<0){
//            System.out.println("O numero que vc digitou é negativo!");
//        }
//        else{
//            System.out.println("O numero que vc digitou é positivo!");
//        }
//        sc.close();
//    }
//}

//Questão 2
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int A, B;
//        System.out.println("Digite o primeiro numero:");
//        A = sc.nextInt();
//        System.out.println("Digite o segundo numero:");
//        B = sc.nextInt();
//        sc.close();
//        if(A%B == 0 || B%A == 0){
//            System.out.println("São multiplos");
//        }
//        else {
//            System.out.println("Não sao multiplos");
//        }
//    }
//}

//Questão 3
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int inicio, fim, diferenca;
//        System.out.println("Digite a hora do inicio do jogo:");
//        inicio = sc.nextInt();
//        System.out.println("Digite a hora do fim do jogo:");
//        fim = sc.nextInt();
//        if (inicio < fim) {
//            diferenca = fim - inicio;
//        } else {
//            diferenca = 24 - inicio + fim;
//        }
//        System.out.println("O jogo durou: "+diferenca+ " Horas");
//        sc.close();
//    }
//}
//Questão 5
//import java.util.Scanner;
//import java.util.Locale;
//public class Main {
//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        int codigo, quantidade;
//        double valor;
//        System.out.println("Digite o codigo do produto");
//        codigo = sc.nextInt();
//        System.out.println("Digite a quantidade:");
//        quantidade = sc.nextInt();
//        if(codigo==1){
//            valor = quantidade * 4.0;
//        }
//        else if (codigo == 2) {
//            valor = quantidade * 4.5;
//        }
//        else if (codigo == 3) {
//            valor = quantidade * 5.0;
//        }
//        else if (codigo == 4) {
//            valor = quantidade * 2.0;
//        }
//        else {
//            valor = quantidade * 1.5;
//        }
//
//        System.out.printf("Total: R$ %.2f%n", valor);
//        sc.close();
//    }
//}
//Questão 6
//import java.util.Scanner;
//import java.util.Locale;
//public class Main {
//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        double valor;
//        System.out.println("Digite o valor:");
//        valor = sc.nextDouble();
//        if(valor>100.0 || valor<0.0){
//            System.out.println("Fora do intervalo");
//        }
//        else if(valor<=25.0){
//            System.out.println("Intervao (0,25)");
//        }
//        else if (valor <= 50.0) {
//            System.out.println("Intervalo (25,50]");
//        }
//        else if (valor <= 75.0) {
//            System.out.println("Intervalo (50,75]");
//        }
//        else {
//            System.out.println("Intervalo (75,100]");
//        }
//        sc.close();
//    }
//}
//Questão 7
//import java.util.Scanner;
//import java.util.Locale;
//public class Main {
//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        double x, y;
//        x = sc.nextDouble();
//        y = sc.nextDouble();
//        if(x==0.0 && y==0.0){
//            System.out.println("Origem");
//        }
//        else if(x==0.0){
//            System.out.println("Eixo y");
//        }
//        else if(y==0.0){
//            System.out.println("Eixo x");
//        }
//        else if(x>0.0 && y>0.0){
//            System.out.println("Q1");
//        }
//        else if(x<0.0 && y>0.0){
//            System.out.println("Q2");
//        }
//        else if(x<0.0 && y<0.0){
//            System.out.println("Q3");
//        }
//        else if(x>0.0 && y<0.0){
//            System.out.println("Q4");
//        }
//        sc.close();
//    }
//}
//Questão 8
//import java.util.Scanner;
//import java.util.Locale;
//public class Main {
//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        double salario, imposto;
//        salario = sc.nextDouble();
//        if (salario <= 2000.0) {
//            imposto = 0.0;
//        }
//        else if (salario <= 3000.0) {
//            imposto = (salario - 2000.0) * 0.08;
//        }
//        else if (salario <= 4500.0) {
//            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
//        }
//        else {
//            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
//        }
//
//        if (imposto == 0.0) {
//            System.out.println("Isento");
//        }
//        else {
//            System.out.printf("R$ %.2f%n", imposto);
//        }
//
//        sc.close();
//    }
//}