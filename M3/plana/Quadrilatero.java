
package plana;

/**
 * Classe resposavel pelo armazenamento de informações de uma figura plana com quatro lados
 * 
 * @author Roniere
 * @version 2.0
 */

public class Quadrilatero extends FiguraPlana {
    

   
   /**
    * Metodo construtor sem parametros responsavel por valorizar os atributos lado1 e lado2 do quadrilatero com 10
    * 
    */
   
   public Quadrilatero(){
       super();
   }
   
   /**
    * Metodo construtor com parametros que define valores iniciais para os atributos lado1 e lado2
    * 
    * @param l1 Valor correspondente ao lado1 do quadrilatero
    * @param l2 Valor correspondente ao lado2 do quadrilatero
    */
   
   public Quadrilatero( int l1, int l2){
       super( l1, l2);
   
   }
   
 
   
    
   /**
    * Retorna a area do quadrilatero (lado1 x lado2)
    * @return Area do quadrilatero
    */
   
    @Override
   public double getAreaPlana() {
       return super.getLado1() * super.getLado2();
   }
   
   /**
    * Retorna a area do quadrilatero ( soma dos lados)
    * @return Perimetro do quadrilatero
    */
   
   public double getPerimetroPlana() {
       return (2 * super.getLado2()) + (2 * super.getLado2() );
   }
   
   /**
    * Verifica se o quadrilatero é um quadrado (lados iguais), retornando true caso verdadeiro
    * @return Verdaeiro se for quadrado
    */
   
   public boolean isQuadradoPlana() {
       if ( super.getLado1() == super.getLado2() ) {
           return true;
       } else {
           return false;
       } 
   }
   
   /**
    * Verifica se o quadrilatero é um retangulo (lados diferentes ), retornando true caso verdadeiro
    * @return Verdaeiro se for retangulo
    */   
   
   public boolean isRetanguloPlana() {
       return ! this.isQuadradoPlana();
   }
   
}
