//Exercício 12
import java.util.Scanner;
public class prog12{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char sexo;
        double altura, pesoideal;

        System.out.println("Digite o seu sexo, (M) para masculino ou (F) para feminino:");
        sexo=sc.next().charAt(0);

        System.out.println("Digite a sua altura:");
        altura=sc.nextDouble();

        if(sexo == 'm'){
            pesoideal = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal é "+pesoideal);
        
        }else if(sexo == 'f'){
            pesoideal = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é "+pesoideal);
        
        }else
            System.out.println("Sexo inválido.");
        
        sc.close();
    }
}
