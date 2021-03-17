package fp.daw.examen2ev;

public class Furgoneta extends TransporteMercanc�a {

	public Furgoneta(String matricula, float toneladas) {
		super(matricula, toneladas);
	}

	@Override
	public float getPrecioAlquiler(int dias) {
		return precioalquiler * dias;
	}

	@Override
	public String toString() {
		return "Furgoneta [ " + super.toString() + ", precio alquiler= " + precioalquiler + " ]";
	}

}
