
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        
        System.out.println("Digite um número");
        num1 = leia.nextInt();
        
        System.out.println("Digite o segundo número");
        num2 = leia.nextInt();
        
        if( num1 > num2){
        System.out.println("num1 é maior que o num2");
        }
        else{
        System.out.println("Num2 é maior");
        }
        }
    
} 
            
            
