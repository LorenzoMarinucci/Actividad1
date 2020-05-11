package excepciones;

public class TipoCombustibleException extends CargaInvalidaException {

	public TipoCombustibleException(String mensaje, String combustible, double cantidadRequerida, double cantidadDisponible) {
		super(mensaje, combustible, cantidadRequerida, cantidadDisponible);
	}

}
