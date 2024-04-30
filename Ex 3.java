import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  
 // Definção da variável do scanner
	Scanner leia = new Scanner(System.in); 
    
    int nota = 0;

    System.out.println("Digite sua nota: ");
    nota = leia.nextInt(); //Entrada de dados
    
    if(nota >= 90 && nota <=100 ){
    System.out.println("Sua classificação é A");
    }
  else if(nota >=80 && nota <=89){
    System.out.println("Sua classisicação é B");
	}
  else if( nota >= 70 && nota <=79){
    System.out.println("Sua classificação é C");
    }
    else if(nota >=60 && nota <=69){
        System.out.println("sua classificação é D");
    }
    else if(nota >=0 && nota <=59){
        System.out.println("Sua classificação é F");
    }
  }
}