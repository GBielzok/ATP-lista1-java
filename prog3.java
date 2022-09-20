//Exercício 3
import java.util.Scanner;
public class prog3{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double num1, num2, res;

        System.out.println("Digite um número:");
        num1=sc.nextDouble();

        System.out.println("Digite outro número:");
        num2=sc.nextDouble();

        if (num1 > num2){
            res = num1 - num2;
            System.out.println("O resultado da subtração é: " +res);
        
        }else if (num2 > num1){
            res = num2 - num1;
            System.out.println("O resultado da subtração é: " +res);
        
        }else
        System.out.println("Os números são iguais. O resultado é 0");
        
        sc.close();
    }
}
