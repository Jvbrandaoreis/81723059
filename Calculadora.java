import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){
         int num1;
         int num2;
         int opcao;

        Scanner input = new Scanner(System.in);  
        
        System.out.println("Digite uma operação");
        System.out.println("1 para soma , 2 para subtração");
        opcao = input.nextInt();
        
        if(opcao == 1){
            System.out.println("Digite numero 1: ");  
            num1 = input.nextInt();
            System.out.println("Digite numero 2: ");
            num2 = input.nextInt();
            System.out.println("Seu resultado de soma " + (num1 + num2));       
        } 
        
        if(opcao == 2){
            System.out.println("Digite numero 1: ");  
            num1 = input.nextInt();
            System.out.println("Digite numero 2: ");
            num2 = input.nextInt();
            System.out.println("Seu resultado de subtração " + (num1 - num2));       
        }        
    }    
}            