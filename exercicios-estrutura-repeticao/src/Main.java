
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite a senha:");
//        int senha = sc.nextInt();
//        while (senha!= 2002.0) {
//            System.out.println("Senha invalida");
//            senha = sc.nextInt();
//        }
//        System.out.println("Acesso permitido");
//        sc.close();
//    }
//}
//Questão 2
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite as cordenadas:");
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        while(x!=0.0 || y!=0.0){
//            if(x>0.0 && y>0.0){
//                System.out.println("primeiro");
//            }
//            else if(x<0.0 && y>0.0){
//                System.out.println("segundo");
//            }
//            else if(x<0.0 && y<0.0){
//                System.out.println("terceiro");
//            }
//            else{
//                System.out.println("quarto");
//            }
//            x = sc.nextInt();
//            y = sc.nextInt();
//        }
//        sc.close();
//        }
//    }
//Questão 3
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int alcool = 0;
//        int gasolina =0;
//        int diesel = 0;
//        System.out.println("Digite o tipo de combustivel:1.Álcool 2.Gasolina 3.Diesel 4.Fim ");
//        int codigo=sc.nextInt();
//        while(codigo!=4){
//            switch(codigo){
//                case 1:
//                    alcool = alcool + 1;
//                    break;
//                case 2:
//                    gasolina = gasolina + 1;
//                    break;
//                case 3:
//                    diesel = diesel + 1;
//                    break;
//                default:
//                    break;
//            }
//            codigo = sc.nextInt();
//        }
//        System.out.println("MUITO OBRIGADO");
//        System.out.println("Alcool: " + alcool);
//        System.out.println("Gasolina: " + gasolina);
//        System.out.println("Diesel: " + diesel);
//        sc.close();
//    }
//}