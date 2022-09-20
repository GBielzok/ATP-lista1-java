//Exercício 8
import java.util.Scanner;
public class prog8{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double num1, res1, num2, num3, res3;

        System.out.println ("1)Digite um número:");
        num1=sc.nextFloat();

        System.out.println ("2)Digite outro número:");
        num2=sc.nextFloat();

        System.out.println ("3)Digite outro número:");
        num3=sc.nextFloat();
        
        //Entrada 1
        if (num1 > 0){
            res1 = Math.sqrt(num1);
            System.out.println ("1)A raiz quadrada de "+num1+" é "+res1);
        
        }else if (num1 < 0){
            res1 = num1*num1;
            System.out.println ("1)O quadrado do número "+num1+" é "+res1);
        
        }else
            System.out.println ("1)"+num1+" é um número neutro.");
        
        //Entrada 2
        if (num2 > 10 && num2 < 100){
                System.out.println ("2)Número entre 10 e 100. Intervalo permitdo.");
        }
        
        //Entrada 3
        if (num3 < num2){
            res3 = num2 - num3;
            System.out.println ("3)A diferença de "+num2+" e "+num3+ " é: "+res3);
        
        }else if (num3 > num2){
            res3 = num2 + num3;
            System.out.println ("3)A soma de "+num3+" e "+num2+ " é: "+res3);
        }
        
        sc.close();
    }
}
