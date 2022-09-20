//Exercício 13
import java.util.Scanner;
public class prog13{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int nvendedor, vendas;
        double salariofixo, salariototal;

        System.out.println("Digite seu número de vendedor:");
        nvendedor=sc.nextInt();

        System.out.println("Digite seu salário fixo:");
        salariofixo=sc.nextDouble();

        System.out.println("Digite quantas vendas você efetuou:");
        vendas=sc.nextInt();
        
        if(vendas <= 10000){
            salariototal = salariofixo + (vendas / 100 * 3);
            System.out.println("Número do vendedor: "+nvendedor);
            System.out.println("Seu total de vendas é: "+vendas);
            System.out.println("Seu salário fixo é: "+salariofixo);
            System.out.println("Seu salário total é: "+salariototal);
        
        }else{
            salariototal = salariofixo + (10000 / 100 * 3) + ((vendas - 10000) / 100 * 5);
            System.out.println("Número do vendedor: "+nvendedor);
            System.out.println("Seu total de vendas é : "+vendas);
            System.out.println("Seu salário fixo é: "+salariofixo);
            System.out.println("Seu salário total é: "+salariototal);
        
        }
        
        sc.close();
    }
}
