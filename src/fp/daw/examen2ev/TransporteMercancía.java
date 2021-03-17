package fp.daw.examen2ev;

public abstract class TransporteMercancía extends Vehículo {

	protected float toneladas;

	public TransporteMercancía(String matricula, float toneladas) {
		super(matricula);
		this.toneladas = toneladas;
		precioalquiler = preciobase + (toneladas * 20);
	}

	@Override
	public String toString() {
		return super.toString() + ", toneladas=" + toneladas;
	}

}
