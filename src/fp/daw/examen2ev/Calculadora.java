package fp.daw.examen2ev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		System.out.println("calculadora > ");
		while (!(linea = in.readLine()).equalsIgnoreCase("fin")) {
			calcular(linea);
			System.out.println("calculadora > ");
		}
	}

	static void calcular(String linea) {
		Scanner s = new Scanner(linea);
		try {
			float num1 = Float.parseFloat(s.next());
			String simbolo = s.next();
			float num2 = Float.parseFloat(s.next());
			if (s.hasNext()) {
				s.close();
				throw new NumberFormatException("Demasiados datos");
			}
			if (simbolo.equals("+"))
				System.out.println("Resultado de SUMAR " + num1 + " + " + num2 + " = " + num1 + num2);
			else if (simbolo.equals("-"))
				System.out.println("Resultado de RESTAR " + num1 + " - " + num2 + " = " + (num1 - num2));
			else if (simbolo.equalsIgnoreCase("x") || simbolo.equals("*"))
				System.out.println("Resultado de MULTIPLICAR " + num1 + " x " + num2 + " = " + (num1 * num2));
			else if (simbolo.equals("/"))
				System.out.println("Resultado de DIVIDIR " + num1 + " / " + num2 + " = " + (num1 / num2));
			else {
				s.close();
				throw new NumberFormatException();
			}

		} catch (NumberFormatException e) {
			System.out.println("expresión incorrecta (" + e.getMessage() + ")");
		} catch (NoSuchElementException e) {
			System.out.println("expresión incorrecta (" + e.getMessage() + ")");
		} catch (Exception e) {
			System.out.println("expresión incorrecta (" + e.getMessage() + ")");
			// no debería entrar en ésta Exception, con las Excepciones anteriores ya
			// capturaríamos todas las entradas erróneas.
		}
		s.close();
	}

}
