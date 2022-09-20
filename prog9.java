//Exercício 9
import java.util.Scanner;
public class prog9{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.println("Digite a sua idade:");
        idade=sc.nextInt();

        if (idade == 16 || idade > 16 && idade <18){
            System.out.println("Você já possui maioridade civil.");
        
        }else if (idade == 18 || idade > 18){
            System.out.println("Você já possui maioridade penal.");
        
        }else
            System.out.println("Você não possui maioridade penal ou civil.");
        
        sc.close();
    }
}
