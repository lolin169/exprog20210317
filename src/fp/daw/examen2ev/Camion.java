package fp.daw.examen2ev;

public class Camion extends TransporteMercancía {

	public Camion(String matricula, float toneladas) {
		super(matricula, toneladas);
		precioalquiler += 40;
	}

	@Override
	public float getPrecioAlquiler(int dias) {
		return precioalquiler * dias;
	}

	@Override
	public String toString() {
		return "Camion [ " + super.toString() + ", precio alquiler=" + precioalquiler + " ]";
	}

}
