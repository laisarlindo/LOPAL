
import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  
 // Definção da variável do scanner
	Scanner leia = new Scanner(System.in);
    int n[] = new int[10];
	int i;
	
	for(i=0;i < 10; i++){
	 System.out.println("Digite 10  números inteiros" + i +":\n");
	   n[i] = leia.nextInt();
	}

    for(i=0;i < 10; i++){
     if (n[i]%n[i] == n[i]%n[i]){
    System.out.println("Os números primos são" + i + ":\n");
     }
    else  {
     System.out.println("Não é número primo");
    }
    }


    
  }
}
        
         
	 
	
	    
	    
	   
