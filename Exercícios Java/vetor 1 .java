import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  
 // Definção da variável do scanner
	Scanner leia = new Scanner(System.in); 
     
     int n[] = new int[8];
     int maior = 0;
     int indice = 0;
 
     for (int i=0; i<8;i++){
             System.out.println("Qual é o valor do indice"+i);
             n[i] = leia.nextInt();
         }
           for(int i= 0; i< 8; i++){
               if(n[i] > maior){
                   maior = n[i];
                   indice = i;
               } 
         
         }
     
         System.out.println("O número maior é "+ maior +" Se encontra no indice"+ indice);
              }
           }
              
              

             
             
     
          
         
     
     
  
 
	
	


