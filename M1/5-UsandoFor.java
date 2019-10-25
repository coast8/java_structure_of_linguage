
import java.util.Scanner;


public class UsandoFor {

    
    public static void main(String[] args) {
        
        //ENTRADA    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero da tabuada ");
        int num = entrada.nextInt();
        
        //PROCESSAMENTO E SAIDA 
        for (int i = 1; i <= 10; i++){
            System.out.println( num +  "x" + i + "=" + (i * num ));
        
        }
        
        
        
        
        
       
    }
}
