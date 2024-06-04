import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  
 // Definção da variável do scanner
	Scanner leia = new Scanner(System.in);
    int n[] = new int[10];
	int produtoPares = 1;
	int somaImpares = 0;
	
	System.out.println("Informe 10 números inteiros:");
	
	for(int i = 0; i < 10; i++) {
	n[i] = leia.nextInt();
	}
    for(int i = 0; i < 10; i++) {
    if (n[i] % 2 == 0) { 
    produtoPares *= n[i];
    } else { // Se o número for ímpar
                somaImpares += n[i]; // Soma aos ímpares
    }
        }
        System.out.println("A multiplicação dos pares é: " + produtoPares);
        System.out.println("\nA soma dos ímpares é: " + somaImpares);
  }
}
	    
	
	
