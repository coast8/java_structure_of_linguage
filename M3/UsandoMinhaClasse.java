
import javax.swing.JOptionPane;


public class UsandoMinhaClasse {

   
    public static void main(String[] args) {
        
        String resposta = "";
        
        //ENTRADA
        String op = JOptionPane.showInputDialog( null, "Baskara(B) ou Fatorial(H) ?");
        
        //PROCESSAMENTO
        if ( op.equals ( "B" )){
            double a = Integer.parseInt (
                    JOptionPane.showInputDialog( null, "Digite o valor de a" ) );
            double b = Integer.parseInt (
                    JOptionPane.showInputDialog( null, "Digite o valor de b" ) );
            double c = Integer.parseInt (
                    JOptionPane.showInputDialog( null, "Digite o valor de c" ) );
            
            resposta = FuncoesMatematicas.getBaskara(a, b, c);
        
        } else if (op.equals ( "F" )){
            int num = Integer.parseInt (
                    JOptionPane.showInputDialog( null, "Digite o numero para fatorial" ) );
            
            int result = FuncoesMatematicas.getFatorial( num );
            
            resposta = String.valueOf( result ) ;
        
        }
        
        
        //SAIDA
        JOptionPane.showMessageDialog( null, "Resposta: " + resposta);
        
    }
}
