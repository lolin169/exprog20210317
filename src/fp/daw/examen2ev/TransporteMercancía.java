package fp.daw.examen2ev;

public abstract class TransporteMercanc�a extends Veh�culo {

	protected float toneladas;

	public TransporteMercanc�a(String matricula, float toneladas) {
		super(matricula);
		this.toneladas = toneladas;
		precioalquiler = preciobase + (toneladas * 20);
	}

	@Override
	public String toString() {
		return super.toString() + ", toneladas=" + toneladas;
	}

}
