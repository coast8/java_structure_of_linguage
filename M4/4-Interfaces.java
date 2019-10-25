
/*
As interfaces são padrões definidos através de contratos ou especificações. Um contrato define um determinado conjunto de métodos que serão implementados nas classes que assinarem esse contrato. Uma interface é 100% abstrata, ou seja, os seus métodos são definidos como abstract, e as variáveis por padrão são sempre constantes (static final).

Uma interface é definida através da palavra reservada “interface”. Para uma classe implementar uma interface é usada a palavra “implements”, descrita na Listagem 8.
*/

/*
Como a linguagem Java não tem herança múltipla, as interfaces ajudam nessa questão, pois bem se sabe que uma classe pode ser herdada apenas uma vez, mas pode implementar inúmeras interfaces. As classes que forem implementar uma interface terão de adicionar todos os métodos da interface ou se transformar em uma classe abstrata, veja nos exemplos abaixo.
*/

// Declaração de uma interface
interface Conta{
	void depositar(double valor);
	void sacar(double valor);
	double getSaldo();
}


//Classe Conta Corrente
public class ContaCorrente implements Conta {
	private double saldo;
	private double taxaOperacao = 0.45;
	
	@Override
	public void deposita(double valor) {
		this.saldo += valor - taxaOperacao;
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor + taxaOperacao;
	}

}

//ContaPoupanca com os métodos sobrepostos da interface Conta
public class ContaPoupanca implements Conta {
	private double saldo;
	
	@Override
	public void deposita(double valor) {
		this.saldo += valor;		
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
		
	}

}

FONT: http://www.devmedia.com.br/polimorfismo-classes-abstratas-e-interfaces-fundamentos-da-poo-em-java/26387

