import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class UsandoListaJava {

   
    public static void main(String[] args) {
        
//        ArrayList<String> lista = new ArrayList();
//        lista.add("Maria");
//        lista.add("Pedro");
//        lista.add("Joana");
//        lista.add( "Jose");
//        
//        if (lista.contains ("Maria")) {
//            System.out.println( "Achou ");            
//        } else{
//            System.out.println("Objeto não encontrado");
//        }
//        
//        String elemento = lista.get( 0 );
//        System.out.println(elemento);
//        
//        String ultimoElemento = lista.get( lista.size() -1 );
//        System.out.println(ultimoElemento);
//        
//        Iterator<String> it = lista.iterator();
//        
//        while ( it.hasNext()){
//            elemento = it.next();
//            System.out.println( "Elemento " +elemento );
//        }
        
        Hashtable<String, String> lista = new Hashtable();
        lista.put( "joao", "joao;rua das flores;123;Curitiba;PR" );
        lista.put( "maria", "joao;rua das americas;123456;Florianopolis;SC" );
        
        String elemento = lista.get( "joao" );
        System.out.println( elemento );
        
        Enumeration<String> en = lista.keys();
        
        while ( en.hasMoreElements() ){
            elemento = en.nextElement();
            System.out.println( elemento);
        }
        
        
        
          
            
        
        
        
//        String nome[] = new String[15];
//        int idade[] = new int[10];
//        
//        nome[0] = "Olá";
//        idade[9] = 15;
//        
//        String aux = nome[3];
//        int result = idade[0] +idade[1];
    }
}
