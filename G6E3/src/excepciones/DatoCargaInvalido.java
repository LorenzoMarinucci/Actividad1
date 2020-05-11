package excepciones;

public class DatoCargaInvalido {

	private double cantidadDisponible;
	private double cantidadRequerida;
	private String combustible;
	
	public DatoCargaInvalido(double cantidadDisponible, double cantidadRequerida, String combustible) {
		this.cantidadDisponible = cantidadDisponible;
		this.cantidadRequerida = cantidadRequerida;
		this.combustible = combustible;
	}

	public double getCantidadDisponible() {
		return cantidadDisponible;
	}

	public double getCantidadRequerida() {
		return cantidadRequerida;
	}

	public String getCombustible() {
		return combustible;
	}
	
	
	
}
