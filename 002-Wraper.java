

/*
Exemplo 1
*/

public class Teste1 {
	public static void main (String args[]){
	    Double price = new Double("12.45");
		double d = price.doubleValue();
		int i = price.intValue();
		byte b = price.byteValue();
	}
}




/*
Exemplo 2
Convertendo valor
*/
public class Teste2 {
	public static void main (String args[]){
	    double d = Double.parseDouble("123.45");
		int i = Integer.parseInt("123");
		float f = Float.parseFloat("3.14F");
		
		System.out.println(f);
	}
}




/*
Section String

Exemplo 2 Java para contar as ocorrências da letra “a” em uma frase
https://www.guj.com.br/t/programa-java-para-contar-as-ocorrencias-da-letra-a-em-uma-frase/51532/2

*/
public class Teste2 {
	public static void main (String args[]){
	    String x = "Os nomes das classes em Java precisam começar com letra e depois desta quaisquer combinações de letras e dígitos.";
		int total = 0;

		for (int i = 0; i < x.length(); i++) {
			char ch = x.charAt(i);
			String x1 = String.valueOf(ch);

			if (x1.equalsIgnoreCase("a")) {
				total = total + 1;
			}
		}

		System.out.println(total);
	}
}


/*
Section String

Exemplo 2 Java Pegar último caracter de String. [RESOLVIDO!]
https://www.guj.com.br/t/pegar-ultimo-caracter-de-string-resolvido/50767

*/
public class Teste2 {
	public static void main (String args[]){
	    
	    // maneira 2
	    String nomeString = "Fernando";  
	    int tamanho = nomeString.length(); 
	    String valor = nomeString.substring(tamanho-1, tamanho); 
	    System.out.println("Último caracter da String: " + valor);

	    // maneira 2
	    String nomeString = "Fernando";  
	    System.out.println("Último caracter da String: " + nomeString.charAt(nomeString.length() -2));
	    
	}
}


/*
Section String

Exemplo - Retirar vírgula
https://www.guj.com.br/t/retirar-virgula/69226/7

*/
public class Teste2 {
	public static void main (String args[]){
	    
	    String str = "23,00"; 
		String newStr = str.replace(",", "");
		System.out.println(newStr);


		// forcando um double a ser int
		double numero = 23.00;
		System.out.println((int) numero*100);
	}
}


/*
Section String

Exemplo - trocar caracteres em um String
https://www.guj.com.br/t/re-trocar-caracteres-em-um-string/102204

*/
public class Teste2 {
	public static void main (String args[]){
	    

	    // code 1
	    String[] nulos = {"!", "@", "#", ...};
		String str = "!@@##$pera";

		for (String n:nulos)
			str = str.replaceAll(n, "");

		System.out.println(str);


		// code 2
		String palavra = "!@#$%¨&*()_+-=´[`{~]^},.<>;/º/";
		String palavra1 = palavra.replaceAll("!@#", "");
		System.out.println("Palavra era:   [" + palavra + "]");
		System.out.println("Palavra ficou: [" + palavra1 + "]");
	}
}


