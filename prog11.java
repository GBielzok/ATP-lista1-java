//Exercício 11
import java.util.Scanner;
public class prog11{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite um número:");
        num1=sc.nextInt();

        System.out.println("Digite outro número:");
        num2=sc.nextInt();

        if(num1 % 2 == 0 && num2 % 2 == 0){
            System.out.println(num1+" e "+num2+" são múltiplos de 2.");
        
        }else if(num1 % 2 != 0 && num2 % 2 != 0){
            System.out.println(num1+" e "+num2+" não são múltiplos de 2.");
        
        }else if(num1 % 2 == 0 && num2 % 2 != 0){    
            System.out.println(num1+" é múltiplo de 2, mas "+num2+" não.");
        
        }else if(num1 % 2 != 0 && num2 % 2 == 0){    
            System.out.println(num2+" é múltiplo de 2, mas "+num1+" não.");
        }
        
        sc.close();
    }
}
