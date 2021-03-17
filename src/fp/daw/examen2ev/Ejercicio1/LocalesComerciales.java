package fp.daw.examen2ev.Ejercicio1;

public class LocalesComerciales extends Empresa {

	private String RefCatastral;

	public LocalesComerciales(String RefCatastral) {
		super();
		this.RefCatastral = RefCatastral;
	}

	@Override
	public float getPrecioAlquiler(int dias) {
		return 0;
	}

	@Override
	public String toString() {
		return "LocalesComerciales [ " + super.toString() + ", RefCatastral=" + RefCatastral + "]";
	}

}
