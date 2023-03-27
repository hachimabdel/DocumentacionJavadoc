package Ejercicio1;

import utilidades.Leer;

/**
 * @since 1.0 
 * @version 1.1
 * @author abdelhachim
 * 
 * Esto es una calculadora
 *
 */

public class Prinicipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)Realizar un programa que haga las operaciones básicas de una calculadora solo con números
		//enteros (sumar, resta, multiplicar, dividir y raíz cuadrada) teniendo en cuenta las posibles excepciones
		//que se pueden producir (entrada de datos, división por cero, raíz de un número negativo, etc.)
		
		double num1 = 0.0, num2 = 0.0, result = 0.0; 
		int op = 0; 
		
		Calculadora c = new Calculadora();
		
		System.out.println("***************************");
		System.out.println("Bienvenido a la calculadora");
		System.out.println("***************************");
		do {
			/**
			 * @exception si en el case 4 le introducimos un 0 nos dara el error
			 */
			try {
				System.out.println("1. Sumar");
				System.out.println("2. Restar");
				System.out.println("3. Multiplicar");
				System.out.println("4. Dividir ");
				System.out.println("5. Raíz cuadrada");
				System.out.println("0. Salir");
				System.out.println("***************************");
				System.out.print("Eliga un número: ");
				op = Leer.datoInt();
				System.out.println("---------------");
			
				switch (op) {
				case 0:
					System.out.println("Saliendo del programa");
					break;
				case 1:
					System.out.print("Diga un número: ");
					num1 = Leer.datoInt();
					System.out.print("Diga otro número: ");
					num2 = Leer.datoInt();
					System.out.println("Este es el resultado: "+c.sumar(num1, num2));
					System.out.println("");
					break;
		
				case 2:
					System.out.print("Diga un número: ");
					num1 = Leer.datoInt();
					System.out.print("Diga otro número: ");
					num2 = Leer.datoInt();
					System.out.println("Este es el resultado: "+c.restar(num1, num2));
					System.out.println("");
					break;
					
				case 3: 
					System.out.print("Diga un número: ");
					num1 = Leer.datoInt();
					System.out.print("Diga otro número: ");
					num2 = Leer.datoInt();
					System.out.println("Este es el resultado: "+c.multiplicar(num1, num2));
					System.out.println("");
					break;
					
				case 4:
					System.out.print("Diga un número: ");
					num1 = Leer.datoInt();
					System.out.print("Diga otro número: ");
					num2 = Leer.datoInt();
					System.out.println("Este es el resultado: "+c.dividir(num1, num2));
					System.out.println("");
					break;
		
				case 5:
					System.out.print("Diga un número: ");
					num1 = Leer.datoInt();
					System.out.print("Este es el resultado: "+c.raizCuadrada(num1));
					System.out.println("");
					break;
				default:
					System.out.println("Opcion desconocida");
					break;
				}
			}catch (ArithmeticException a) {
				System.err.println("¡Esta usted dividiendo entre cero!");
			} catch (NumberFormatException n) {
				System.err.println("¡Error en la lectura!");
			} catch (Exception e) {
				System.err.println("¡Error inesperado!");
			}
			
		 
		}while (op != 0);
		System.out.println("Gracias por usar el programa");
		
		
		


	}

}
