package Ejercicio1;

/**
 * 
 * @author abdelhachim
 *
 */
public class Calculadora {
	    

		/**
		 * Este método suma dos valores
		 * @param num1 valor1
		 * @param num2 valor2
		 * @return double con resultado num1+num2
		 */
	    public double sumar(double num1, double num2){
	        return num1 + num2;
	    }    
	    
	    /**
	     * Este método resta dos valores
	     * @param num1 valor1
	     * @param num2 valor2
	     * @return double con el resultado num1-num2
	     */
	    public double restar(double num1, double num2){
	        return num1 - num2;
	    }
	    /**
	     * Este método multiplica dos valores
	     * @param num1 valor 1
	     * @param num2 valor2
	     * @return double con el resultado num1 * num2
	     */
	    public double multiplicar(double num1, double num2){
	        return num1 * num2;
	    }
	    /**
	     * Esto divide dos valores
	     * @param num1 valor 1
	     * @param num2 valor2 
	     * @return double con resultado num1/num2
	     */
	  
	    public double dividir(double num1, double num2){
	            return num1 / num2;
	   
	    }

	    /**
	     * Esto hace la raíz cuadradada
	     * @param num1 valor1
	     * @return un double con la raíz cuadrada
	     */
	    public double raizCuadrada(double num1){
	        return Math.sqrt(num1);
	    }

}
