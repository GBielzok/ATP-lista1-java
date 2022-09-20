//Exercício 15
import java.util.Scanner;

public class prog15 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double valor1, valor2, valor3, media;

        System.out.println("Digite um valor: ");
        valor1=sc.nextDouble();

        System.out.println("Digite mais um valor: ");
        valor2=sc.nextDouble();

        System.out.println("Digite mais um valor: ");
        valor3=sc.nextDouble();
        
        if(valor1 > valor2 && valor1 > valor3){
            valor1 = (valor1 * 5);
            valor2 = (valor2 * 2.5);
            valor3 = (valor3 *2.5);
        
        }else if(valor2 > valor1 && valor2 > valor3){
            valor2 = (valor2 * 5);
            valor2 = (valor2 * 2.5);
            valor3 = (valor3 *2.5);
        }else {
            valor3 = (valor3 * 5);
            valor2 = (valor2 * 2.5);
            valor3 = (valor3 *2.5);
        }
        
        media = (valor1 + valor2 + valor3 / 3);
        System.out.println("A média ponderada dos os 3 valores é: "+media);
        
        sc.close();
    }
}
