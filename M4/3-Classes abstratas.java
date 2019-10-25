

/*
Pode-se dizer que as classes abstratas servem como “modelo” 
para outras classes que dela herdem, não podendo ser instanciada 
por si só. Para ter um objeto de uma classe abstrata é necessário 
criar uma classe mais especializada herdando dela e então instanciar 
essa nova classe. Os métodos da classe abstrata devem então serem 
sobrescritos nas classes filhas.
*/


abstract class Conta {
	
	private double saldo;
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public abstract void imprimeExtrato();

}

/*
 em uma annotation conhecida como @Override, significando que estamos sobrescrevendo
 o método da superclasse. Entende-se em que na classe abstrata “Conta” os métodos 
 que são abstratos têm um comportamento diferente, por isso não possuem corpo. Ou 
 seja, as subclasses que estão herdando precisam desse método mas não de forma 
 genérica, aonde permite inserir as particularidades de cada subclasse.
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {

	@Override
	public void imprimeExtrato() {
		System.out.println("### Extrato da Conta ###");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
		Date date = new Date();
		
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Data: "+sdf.format(date));
		
	}
}