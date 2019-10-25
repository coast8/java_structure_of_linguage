
import javax.swing.JOptionPane;


public class UsandoModeloOO {

   
    public static void main(String[] args) {
        
//        //ENTRADA
//        String texto = JOptionPane.showInputDialog( null, "Digite um texto");
//        String saida = "";
//        
//        
//        //PROCESSAMENTO
//        
//        saida = texto.toUpperCase();
//        
//      
//        
//        
//        //SAIDA
//        JOptionPane.showMessageDialog( null, "Resposta: " + saida );
        
        
        //ENTRADA
        String data = JOptionPane.showInputDialog( null, "Digite uma data (dd/mm/aaaa)");
        
        String meses[] = {"janeiro", "fevereito", "março", "abril",
        "maio", "junho", "julho", "agosto", "setembro", "outubro", 
        "novembro", "dezembro" };
        
        
        //PROCESSAMENTO
        String parte[] = data.split("/");
        int mes = Integer.parseInt( parte[1] );
        String mesExtenso = meses[ mes - 1 ];
        
        
        //SAIDA
        JOptionPane.showMessageDialog(null, parte[0] + " de " + mesExtenso + " de " + parte[2] );
        
    }
}
