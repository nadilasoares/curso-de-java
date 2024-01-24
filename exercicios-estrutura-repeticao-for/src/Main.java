//Questão 1
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int valor = sc.nextInt();
//        for(int i=1; i<valor; i++){
//            if(i%2!=0){
//                System.out.println(i);
//            }
//        }
//        sc.close();
//
//    }
//}
//Questão 2
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int in=0;
//        int out = 0;
//        for(int i=0;i<n;i++){
//            int x = sc.nextInt();
//            if(x>=10 && x<=20){
//                in+=1;
//            }
//            else{
//                out+=1;
//            }
//        }
//        System.out.println(in + " in");
//        System.out.println(out + " out");
//        sc.close();
//    }
//}
//Questão 3
//import java.util.Locale;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        for(int i=0;i<n;i++){
//            double a = sc.nextDouble();
//            double b = sc.nextDouble();
//            double c = sc.nextDouble();
//            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
//
//            System.out.printf("%.1f%n", media);
//        }
//
//        sc.close();
//    }
//}
//Questão 4
//import java.util.Scanner;
//import java.util.Locale;
//public class Main {
//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=0; i<n; i++){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            double divisao;
//            if(b==0){
//                System.out.println("Divisão impossivel");
//            }
//            else{
//                divisao = (double) a/b;
//                System.out.printf("%.1f%n",divisao);
//            }
//        }
//        sc.close();
//    }
//}
//Questão 5
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int fatorial = 1;
//        for (int i = 1; i <= n; i++) {
//            fatorial = fatorial*i;
//        }
//        System.out.println(fatorial);
//        sc.close();
//    }
//}
//Questão 6
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n =sc.nextInt();
//        for(int i=0; i<n;i++){
//            if(n%i==0){
//                System.out.println(i);
//            }
//        }
//        sc.close();
//    }
//}
//Questão 7
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i=1; i<=n; i++) {
//
//            int primeiro = i;
//            int segundo = i * i;
//            int terceiro = i * i * i;
//            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
//        }
//        sc.close();
//    }
//}