package fp.daw.examen2ev.Ejercicio1;

public class Camion extends Veh�culo {

	public Camion(String matricula) {
		super(matricula);
		precioalquiler = preciobase + 40;

	}

	@Override
	public float getPrecioAlquiler(int dias) {
		return precioalquiler * dias;
	}

	@Override
	public String toString() {
		return "Camion [ " + super.toString() + " ]";
	}

}
