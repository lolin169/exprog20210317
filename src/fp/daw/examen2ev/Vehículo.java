package fp.daw.examen2ev;

public abstract class Veh�culo extends Empresa {
	private String matricula;
	protected float preciobase;
	protected float precioalquiler;

	public Veh�culo(String matricula) {
		this.matricula = matricula;
		this.preciobase = 50;
	}

	public String getMatricula() {
		return matricula;
	}

	public float getPreciobase() {
		return preciobase;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setPreciobase(float preciobase) {
		this.preciobase = preciobase;
	}

	@Override
	public String toString() {
		return "matricula=" + matricula;
	}

}
