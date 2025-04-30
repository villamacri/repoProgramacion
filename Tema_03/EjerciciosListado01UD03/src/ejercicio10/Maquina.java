package ejercicio10;

public class Maquina {

	private double recaudacionBilletes;

	public Maquina(double recaudacionBilletes) {
		super();
		this.recaudacionBilletes = recaudacionBilletes;
	}
	
	public double getRecaudacionBilletes() {
		return recaudacionBilletes;
	}

	public void setRecaudacionBilletes(double recaudacionBilletes) {
		this.recaudacionBilletes = recaudacionBilletes;
	}
	
	@Override
	public String toString() {
		return "Maquina [recaudacionBilletes=" + recaudacionBilletes + "]";
	}

	public double comprarBilletes(Ticket t, int cant) {
		return t.getPrecio()*cant;
	}
	
	public double calcularCambio(Ticket t, int cant, double pago) {	
		return pago-comprarBilletes(t, cant);
	}
	
	public void imprimirBillete(Ticket t, int cant, double pago) {
		if(cant==1) {
			System.out.printf("""
					------------------------------------------------------------
					Metro Sevilla		Consorcio de transportes de Andalucía
					
					Estación: San Juan Bajo.
					
					Precio billete: %.2f€
					Importe: %.2f€
					
					Cambio a devolver: %.2f€
					------------------------------------------------------------
					""",t.getPrecio(), t.getPrecio(), calcularCambio(t, cant, pago));
		}else {
			System.out.printf("""
					------------------------------------------------------------
					Metro Sevilla		Consorcio de transportes de Andalucía
					
					Estación: San Juan Bajo.
					
					Precio billete: %.2f€
					Importe: %.2f€
					
					Cambio a devolver: %.2f€
					
					Este billete es válido para %d personas.
					------------------------------------------------------------
					""", t.getPrecio(), comprarBilletes(t, cant), calcularCambio(t, cant, pago), cant);
		}
	}
	
	public boolean comprobarContra(String contra, String contrLeida) {
		boolean acceso;
		if(contra.equals(contrLeida)) {
			acceso=true;
		}else {
			acceso=false;
		}
		return acceso;
	}
	public void actualizarRecaudacion(double importe) {
		recaudacionBilletes+=importe;
	}
	
	public void mostrarRecaudacion() {
		System.out.printf("Total recaudado: %.2f€\n", recaudacionBilletes);
	}
}
