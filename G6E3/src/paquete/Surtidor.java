package paquete;

import excepciones.CargaInvalidaException;
import excepciones.FaltaCombustibleException;
import excepciones.TipoCombustibleException;

public class Surtidor {

	private double cantidadDiesel = 20000;
	private double cantidadPremium = 20000;
	private double cantidadSuper = 20000;
	
	public Surtidor() {
	}
	
	public void cargarCombustible(String combustible, double cantidad) throws CargaInvalidaException {
		if (combustible.equals("Diesel") || combustible.equals("Premium") || combustible.equals("Super"))
			if (cantidad > 0)
				if (combustible.equals("Diesel") && cantidad<cantidadDiesel)
					cantidadDiesel-=cantidad;
				else
					if (combustible.equals("Premium") && cantidad<cantidadPremium)
						cantidadPremium-=cantidad;
					else
						if (combustible.equals("Super") && cantidad<cantidadSuper)
							cantidadSuper-=cantidad;
						else
							if (combustible.equals("Diesel") && cantidad>=cantidadDiesel) {
								throw new FaltaCombustibleException("No hay combustible suficiente",combustible,cantidad,cantidadDiesel);
							}
							else
								if (combustible.equals("Premium") && cantidad>=cantidadPremium)
									throw new FaltaCombustibleException("No hay combustible suficiente",combustible,cantidad,cantidadPremium);
								else
									if (combustible.equals("Super") && cantidad>=cantidadSuper)
										throw new FaltaCombustibleException("No hay combustible suficiente",combustible,cantidad,cantidadSuper);
			else
				if (combustible.equals("Diesel"))
					throw new CargaInvalidaException("Ingrese un valor correcto",combustible,cantidad,cantidadDiesel);
				else
					if (combustible.equals("Premium"))
						throw new CargaInvalidaException("Ingrese un valor correcto",combustible,cantidad,cantidadPremium);
					else
						throw new CargaInvalidaException("Ingrese un valor correcto",combustible,cantidad,cantidadSuper);
		else
			throw new TipoCombustibleException("Combustible desconocido",combustible,cantidad,0);
	}	

	public double getCantidadDiesel() {
		return cantidadDiesel;
	}

	public double getCantidadPremium() {
		return cantidadPremium;
	}

	public double getCantidadSuper() {
		return cantidadSuper;
	}
	
	public void llenarDiesel() {
		cantidadDiesel = 20000;
	}
	
	public void llenarPremium() {
		cantidadPremium = 20000;
	}
	
	public void llenarSuper() {
		cantidadSuper = 20000;
	}

}
