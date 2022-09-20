//Exercício 2
import java.util.Scanner;
public class prog2{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Digite um número:");
        num1=sc.nextInt();

        System.out.println("Digite outro número:");
        num2=sc.nextInt();

        System.out.println("Digite outro número:");
        num3=sc.nextInt();

        if (num1 <= num2 && num1 <= num3){
            System.out.println(num1+" é o menor número.");
        
        }else if (num2 <= num1 && num2 <= num3){
            System.out.println(num2+" é o menor número.");
        
        }else if (num3 <= num1 && num3 <= num2){ 
            System.out.println(num3+" é o menor número.");
        }

        sc.close();
    }
}
