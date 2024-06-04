import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  
 // Definção da variável do scanner
	Scanner leia = new Scanner(System.in); 
     
     int n[] = new int[10];
     float soma = n[0] + n[1] + n[2] + n[3] + n[4] + n[5] + n[6] + n[7] + n[8] + n[9]; 
     int i;
     
     
     for (i=0; i<10;i++){
             System.out.println("Qual é o valor do indice "+i);
             n[i] = leia.nextInt();
             
     }
                 soma = n[0] + n[1] + n[2] + n[3] + n[4] + n[5] + n[6] + n[7] + n[8] + n[9];
             
             System.out.println("A soma é"+soma);
            }
          }
         
                    
             
                 
             
             
             

