//Exercício 1 
import java.util.Scanner;
public class prog {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner (System.in);
    int num1, num2;

    System.out.println ("Digite um número:");
    num1=sc.nextInt();

    System.out.println ("Digite outro número:");
    num2=sc.nextInt();

    
    if (num1 > num2){
      System.out.println ("O número " +num1+ " é o maior.");
    
    }else if (num2 > num1){
      System.out.println ("O número " +num2+ " é o maior.");
    
    }else
      System.out.println ("Os dois números são iguais.");

    sc.close();
  }
}
