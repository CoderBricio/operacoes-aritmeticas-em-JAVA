package operacoes;
import java.util.Scanner;

public class opclase {
	public static void main (String []args){
        Scanner scan = new Scanner (System.in);
        int v1 = 50;
        int v2 =50;
        
        
        System.out.println("escolha uma operação");
        System.out.println("[1] - SOMAR");
        System.out.println("[2] - SUBTRAIR");
        System.out.println("[3] - MULTIPLICAR");
        System.out.println("[4] - DIVIDIR");
        int escolha = scan.nextInt();
        
        switch (escolha) {
            case 1 -> System.out.println(v1+v2);
            case 2 ->  System.out.println(v1-v2);
            case 3 ->  System.out.println(v1*v2);
            case 4 ->  System.out.println(v1/v2);
              
        }
        } 
}
