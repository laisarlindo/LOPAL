import java.util.Scanner;

public class Main{
 public static void main(String[] args){
     Scanner leia = new Scanner(System.in);
     
    String [] [] clientes = new String [3] [2];
    String nome;
    String endereço;
    
    clientes [0] [0] = "João";
    clientes [0] [1] = "Rua das flores, 123 ";
    clientes [1] [0] =  "Maria";
    clientes [1] [1] =  "Avenida dos anjos,456 ";
    clientes [2] [0] =  "Pedro";
    clientes [2] [1] =  "Praça da liberdade,789";
    
    for(int i = 0; i < 3; i++){
        System.out.println("nome:"+clientes [i][0]);
        System.out.println("endereço:"+clientes [i][1]);
        System.out.println();
    }
   for (int i = 0; i < Nome; i++) {
            System.out.print("Digite o seu nome " + (i + 1) + ": ");
            Scanner scanner = new Scanner(System.in);
            nome[i] = scanner.nextLine();
        
    }
     for (int i = 0; i < Endereço; i++) {
            System.out.print("Digite o seu Endereço " + (i + 1) + ": ");
            Scanner scanner = new Scanner(System.in);
            endereço[i] = scanner.nextLine();
     }
 }
}
    

