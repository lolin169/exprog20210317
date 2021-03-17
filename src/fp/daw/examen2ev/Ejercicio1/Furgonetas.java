package fp.daw.examen2ev.Ejercicio1;

public class Furgonetas extends Vehículo {

	private float toneladas;

	public Furgonetas(String matricula, float toneladas) {
		super(matricula);
		this.toneladas = toneladas;
		precioalquiler = preciobase + (20 * toneladas);
	}

	@Override
	public float getPrecioAlquiler(int dias) {

		return precioalquiler * dias;
	}

	public float getToneladas() {
		return toneladas;
	}

	public void setToneladas(float toneladas) {
		this.toneladas = toneladas;
	}

	@Override
	public String toString() {
		return "Furgonetas [ " + super.toString() + ", toneladas=" + toneladas + "]";
	}

}
