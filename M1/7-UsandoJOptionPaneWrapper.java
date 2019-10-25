

import javax.swing.JOptionPane;


public class UsandoJOptionPaneWrapper {

    public static void main(String[] args) {
       
        //ENTRADA
       
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
        String sobrenome = JOptionPane.showInputDialog(null, "Digite seu sobrenome");
        
        String aux = JOptionPane.showInputDialog(null, "Digite seu salario");
        
                
        double salario = Double.parseDouble( aux );
        
        aux = JOptionPane.showInputDialog(null, "Digite sua idade");        
        int idade = Integer.parseInt( aux );
        
        //PROCESSAMENTO
        String nomeCompleto = nome + " " + sobrenome;
        double result = salario * idade;
        
        
        //SAIDA
        JOptionPane.showMessageDialog(null, nomeCompleto);
        JOptionPane.showMessageDialog(null, "Salario x Idade " + result);
    }
}
