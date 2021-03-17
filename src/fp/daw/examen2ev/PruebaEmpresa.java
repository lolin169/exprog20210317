package fp.daw.examen2ev;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PruebaEmpresa {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int respuesta = 0;
		try {
			System.out.println("Introduce un número de días para alquilar el vehículo");
			respuesta = teclado.nextInt();
		} catch (Exception e) {
			System.out.println("No es un numero entero ->" + respuesta);
			respuesta = 2;// asignamos un número de días por defecto para probar el programa
		}
		ArrayList<Empresa> alquilables = new ArrayList<>();
		Empresa coche = new Coche("O-6543-BT", 5);
		alquilables.add(coche);
		alquilables.add(new Microbus("5643-FRT", 40));
		alquilables.add(new Furgoneta("3451-DFT", 2.9f));
		alquilables.add(new Camion("4567-KJT", 6.0f));
		alquilables.add(new LocalesComerciales("EDSR4324583"));

		Coche coche1 = new Coche("6543-KKQ", 4);
		alquilables.add(coche1);

//		for (Empresa e : alquilables)
//			System.out.println(e);
//		Otra forma de iteración:

		Iterator<Empresa> i = alquilables.iterator();
		while (i.hasNext()) {
			Empresa e = i.next();
			System.out.println(e.toString());
		}

		for (Empresa e : alquilables)
			if (e instanceof Coche) {
				System.out.println("El precio de alquiler por " + respuesta + " días del "
						+ e.getClass().getSimpleName() + " es de: " + e.getPrecioAlquiler(respuesta) + " €uros");
			} else if (e instanceof Microbus) {
				System.out.println("El precio de alquiler por " + respuesta + " días del "
						+ e.getClass().getSimpleName() + " es de: " + e.getPrecioAlquiler(respuesta) + " €uros");
			} else if (e instanceof Camion) {
				System.out.println("El precio de alquiler por " + respuesta + " días del "
						+ e.getClass().getSimpleName() + " es de: " + e.getPrecioAlquiler(respuesta) + " €uros");
			} else if (e instanceof Furgoneta) {
				System.out.println("El precio de alquiler por " + respuesta + " días del "
						+ e.getClass().getSimpleName() + " es de: " + e.getPrecioAlquiler(respuesta) + " €uros");

			}

		System.out.println("Fin del programa");

		/**
		 * Podríamos intentar crear una instancia de Empresa pero nos daría error, una
		 * de las condiciones del ejercicio es que no se puedan instanciar, de ahí que
		 * lo pongamos en estos comentarios: Empresa e= new Empresa();
		 */

	}

}
