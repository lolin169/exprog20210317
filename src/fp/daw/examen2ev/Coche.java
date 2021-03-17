package fp.daw.examen2ev;

public class Coche extends Vehículo {

	private int plazas;

	public Coche(String matricula, int plazas) {
		super(matricula);
		this.plazas = plazas;
		precioalquiler = (float) (preciobase + (plazas * 1.5));

	}

	@Override
	public float getPrecioAlquiler(int dias) {
		return precioalquiler * dias;
	}

	@Override
	public String toString() {
		return "Coche [ " + super.toString() + ", precio alquiler= " + precioalquiler + ", plazas=" + plazas + "]";
	}

}
