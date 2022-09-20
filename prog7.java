//Exercício 7
import java.util.Scanner;
public class prog7{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float num1, num2, res;
        int opcao;

        System.out.println("Digite um número:");
        num1=sc.nextFloat();

        System.out.println("Digite outro número:");
        num2=sc.nextFloat();

        System.out.println("Digite um número para a ação desejada:");
        System.out.println("1 Média entre os números digitados;");
        System.out.println("2 Diferença do maior para o menor;");
        System.out.println("3 Produto entre os números digitados;");
        System.out.println("4 Divisão do primeiro pelo segundo.");
        opcao=sc.nextInt();

        if(opcao == 1){
            res = (num1 + num2) / 2;
            System.out.println("A média entre os números "+num1+ " e " +num2+" é "+res);
        
        }else if(opcao == 2 && num1 > num2){
            res = num1 - num2;
            System.out.println("A diferença entre números "+num1+ " e " +num2+" é "+res);
        
        }else if(opcao == 2 && num2 > num1){
            res = num2 - num1;
            System.out.println("A diferença entre números "+num2+ " e " +num1+" é "+res);
        
        }else if(opcao == 3){
            res = num1 * num2;
            System.out.println("O produto entre os números "+num1+ " e " +num2+" é "+res);
        
        }else if(opcao == 4){
            res = num1 / num2;
            System.out.println("A divisão entre os números "+num1+ " e " +num2+" é "+res);
        
        } else
            System.out.println("Opção inválida.");
        
        sc.close();
    }
}
