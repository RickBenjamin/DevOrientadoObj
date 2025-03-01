import java.util.Scanner;

public class Hello {
    
public static void main(String[] args) {

     Scanner scan =  new Scanner(System.in);
     int  option = 0;


     while(option != 4){ 
        System.out.println("Escolha uma Opção: ");
        System.out.println("[1]Imprimir Hello World");
        System.out.println("[2]Imprimir Olá Mundo");
        System.out.println("[4]Sair");
        option = scan.nextInt();

        switch(option){

            case 1:
                System.out.println("Hello World: ");
            break;

            case  2:
                System.out.println("Olá Mundo"); 
            break;
            
            case 4:
                System.out.println("Saindo...");
            break;

            default:
            System.out.println("Invalido tente novamente: ");

        }




        }
 
 
 
    }
}
