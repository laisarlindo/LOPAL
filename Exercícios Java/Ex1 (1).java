import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int idade = 0;

        System.out.println("Digite sua idade");
        idade = leia.nextInt();
         if(idade>=18){
    System.out.println("Pode votar");
    }
    else{
    System.out.println("Não pode votar"); 
    }
   }
  }
