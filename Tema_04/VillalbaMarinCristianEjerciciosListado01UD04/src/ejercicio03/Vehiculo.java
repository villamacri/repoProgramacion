package ejercicio03;

public class Vehiculo {

	private double impuesto;
	private String categoriaEmision;
	
	public Vehiculo(double impuesto, String categoriaEmision) {
		super();
		this.impuesto = impuesto;
		this.categoriaEmision = categoriaEmision;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	public String getCategoriaEmision() {
		return categoriaEmision;
	}

	public void setCategoriaEmision(String categoriaEmision) {
		this.categoriaEmision = categoriaEmision;
	}

	@Override
	public String toString() {
		return "Vehiculo [impuesto=" + impuesto + ", categoriaEmision=" + categoriaEmision + "]";
	}
	
	public double calcularImpuesto() {
		String [] listadoTiposEmision= {"Cero emisiones","ECO","tipo B","tipo C"};
		double [] impuestoCategoria= {25, 65, 150, 200};
		
		for (int i = 0; i < listadoTiposEmision.length; i++) {
			if(categoriaEmision.equalsIgnoreCase(listadoTiposEmision[i])) {
				impuesto=impuestoCategoria[i];
			}
		}
		return impuesto;
	}
}
