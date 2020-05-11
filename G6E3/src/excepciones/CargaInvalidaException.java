package excepciones;

public class CargaInvalidaException extends Exception {
	
	private DatoCargaInvalido datoCargaInvalido;

	public CargaInvalidaException(String mensaje, String combustible, double cantidadRequerida, double cantidadDisponible) {
		super(mensaje);
		datoCargaInvalido = new DatoCargaInvalido(cantidadDisponible,cantidadRequerida,combustible);
	}

	public DatoCargaInvalido getDatoCargaInvalido() {
		return datoCargaInvalido;
	}
	
	

}
