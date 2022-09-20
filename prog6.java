//Exercício 6
import java.util.Scanner;
public class prog6{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite um número:");
        num1=sc.nextInt();

        System.out.println("Digite outro número:");
        num2=sc.nextInt();

        if(num1 > num2){
            System.out.println(num1+ " é maior que " +num2);
            System.out.println(num1+ " não é menor que " +num2);
            System.out.println(num1+ " e " +num2+ " não são iguais");
        
        }else if(num1 < num2){
            System.out.println(num1+ " não é maior que " +num2);
            System.out.println(num1+ " é menor que " +num2);
            System.out.println(num1+ " e " +num2+ " não são iguais");
        
        }else{
            System.out.println(num1+ " não é maior que " +num2);
            System.out.println(num1+ " não é menor que " +num2);
            System.out.println(num1+ " e " +num2+ " são iguais");
        }
        
        sc.close();
    }
}
