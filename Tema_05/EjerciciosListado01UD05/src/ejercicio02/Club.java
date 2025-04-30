package ejercicio02;

import java.util.List;

public class Club {

	private List <Socio> listadoSocios;

	public Club(List<Socio> listadoSocios) {
		super();
		this.listadoSocios = listadoSocios;
	}

	public List<Socio> getListadoSocios() {
		return listadoSocios;
	}

	public void setListadoSocios(List<Socio> listadoSocios) {
		this.listadoSocios = listadoSocios;
	}

	@Override
	public String toString() {
		return "Club [listadoSocios=" + listadoSocios + "]";
	}
	
	public void alquilarPista(Socio s) {
		s.setAlquilerPista(true);
	}
	
	public double pagarCuota(Socio s, double pago, double suplPista) {
		if(s.isAlquilerPista()) {
			return pago-(s.getCuotaBase()+suplPista); 
		}else {
			return pago-s.getCuotaBase();
		}
		
	}
}
