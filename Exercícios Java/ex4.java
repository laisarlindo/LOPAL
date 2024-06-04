import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  
 // Definção da variável do scanner
	Scanner leia = new Scanner(System.in); 
    Float nota1;
    Float nota2;
    Float nota3;
    Float media;
    Float soma;

    System.out.println("Digite nota1: ");
    nota1 = leia.nextFloat(); //Entrada de dados
    System.out.println("Digite nota2");
    nota2= leia.nextFloat();
    System.out.println("Digite nota3");
    nota3= leia.nextFloat();
    
    soma=nota1+nota2+nota3;
    media=soma/3;
    
    System.out.println("Sua nota final é " + media);

}
}
