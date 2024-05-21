import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  
 // Definção da variável do scanner
	Scanner leia = new Scanner(System.in); 
	
	int n[] = new int[5];
	int i;
	int indice; 
	
	for (i=0; i<5;i++){
	    System.out.println("Qual é o valor do indice "+i);
             n[i] = leia.nextInt();
	}
	System.out.println("\n"+n[4]);
    System.out.println("\n"+n[3]);
    System.out.println( "\n"+n[2]);
    System.out.println( "\n"+n[1]);
    System.out.println("\n"+n[0]);
  }
}


