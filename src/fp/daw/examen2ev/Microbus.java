package fp.daw.examen2ev;

public class Microbus extends Vehículo {
	private int plazas;

	public Microbus(String matricula, int plazas) {
		super(matricula);
		this.plazas = plazas;
		precioalquiler = preciobase + (2 * plazas);

	}

	@Override
	public float getPrecioAlquiler(int dias) {
		return precioalquiler * dias;
	}

	@Override
	public String toString() {
		return "Microbus [ " + super.toString() + ", precio alquiler= " + precioalquiler + ", plazas=" + plazas + "]";
	}

}
