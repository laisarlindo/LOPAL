import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  
 // Definção da variável do scanner
	Scanner leia = new Scanner(System.in); 
	
	float num; 
	num=0;
	
	System.out.println("Digite um numéro: ");
    num = leia.nextFloat(); //Entrada de dados
    
    if (num <0){
    System.out.println("O número é negativo");
    }
    else if (num >0){
    System.out.println("O número é positivo");
    }
    else if (num == 0){
    System.out.println("O número é 0");
    }
 }
}

