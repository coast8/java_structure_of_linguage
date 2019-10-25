
import java.util.Date;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
        


public class UsandoFormatacao {

   
    public static void main(String[] args) {
        
       
        
//        Date agora = new Date();
//        
//        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");        
//        SimpleDateFormat formatadorData2 = new SimpleDateFormat("EEEE, dd' de 'MMMMM' de 'yyyy");
//        
//       
//        
//        System.out.println( new SimpleDateFormat("dd/MM/yyyy").format( agora ));
//        System.out.println( new SimpleDateFormat("EEEE, dd' de 'MMMMM' de 'yyyy").format ( agora ) );
//                        
//        String formatoExtenso = agora.toString();                
//        System.out.println( formatoExtenso );
//        
//        //ENTRADA
//        String data = JOptionPane.showInputDialog( null, "Digite uma data (dd/mm/aaaa)");
//        
//       
//        
//        
//        //PROCESSAMENTO
//        
//        try{
//        Date dataInform = new Date();
//        dataInform = new SimpleDateFormat( "dd/MM/yyyy" ).parse(data);
//           
//        
//        
//        //SAIDA
//        JOptionPane.showMessageDialog(null, new SimpleDateFormat ("EEEE, dd' de 'MMMMM' de 'yyyy").format( dataInform ));
//        }   catch( Exception e){
//            
//            JOptionPane.showMessageDialog( null, "Erro no formato da data");            
//        }   
//        }
        
        double result = 100000.0 / 3.0;
        
        System.out.println("Result: " + new DecimalFormat( "#,###.00" ).format (result));
       
    }
}
