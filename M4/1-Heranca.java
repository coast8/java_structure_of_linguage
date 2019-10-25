
//Entendendo e Aplicando Herança em Java

/*
*
* A herança é um princípio da POO que permite a criação de novas classes a 
* partir de outras previamente criadas. Essas novas classes são chamadas de 
* subclasses, ou classes derivadas; e as classes já existentes, que deram 
* origem às subclasses, são chamadas de superclasses, ou classes base.
*
*/

	// Classe Pessoa
import java.util.Date;
public class Pessoa {
	public String nome;
	public String cpf;
	public Date data_nascimento;
	
	public Pessoa(String _nome, String _cpf, Date _data) {
		this.nome = _nome;
		this.cpf = _cpf;
		this.data_nascimento = _data;
	}
}


	//Classes Aluno, Funcionario e Professor
import java.util.Date;
public class Aluno extends Pessoa {
	public Aluno(String _nome, String _cpf, Date _data) {
		super(_nome, _cpf, _data);
	}
	public String matricula;
}

public class Professor extends Pessoa {
	public Professor(String _nome, String _cpf, Date _data) {
		super(_nome, _cpf, _data);
	}
	public double salario;
	public String disciplina;
}

public class Funcionario extends Pessoa {
	public Funcionario(String _nome, String _cpf, Date _data) {
		super(_nome, _cpf, _data);
	}
	public double salario;
	public Date data_admissao;
	public String cargo;
}


	//Testando a chamada super
public class main {
	public static void main(String[] args) {
		Aluno i = new Aluno("Jose Francisco", "123.456.789-00", new Date());
		System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + i.nome);
		System.out.println("CPF: " + i.cpf);
		System.out.println("Data de nascimento: " + i.data_nascimento.toString());
	}
}




FONT: http://www.devmedia.com.br/entendendo-e-aplicando-heranca-em-java/24544