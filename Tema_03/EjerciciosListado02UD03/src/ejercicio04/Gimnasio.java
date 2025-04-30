package ejercicio04;

import java.util.Arrays;

public class Gimnasio {

	private Cliente [] listado;
	private int numClien;
	
	public Gimnasio(Cliente[] listado, int numClien) {
		super();
		this.listado = listado;
		this.numClien = numClien;
	}

	public Cliente[] getListado() {
		return listado;
	}

	public void setListado(Cliente[] listado) {
		this.listado = listado;
	}

	public int getNumClien() {
		return numClien;
	}

	public void setNumClien(int numClien) {
		this.numClien = numClien;
	}

	@Override
	public String toString() {
		return "Gimnasio [listado=" + Arrays.toString(listado) + ", numClien=" + numClien + "]";
	}
	
	public Cliente findByCodCliente(int codCliente) {
		Cliente buscado=null;
		int i=0;
		boolean encontrado=false;
		
		while(i<listado.length && !encontrado) {
			if(listado[i].getCodCliente()==codCliente) {
				buscado=listado[i];
			}else {
				i++;
			}
		}
		return buscado;
	}
	
	public double calcularIMC(int codCliente) {
		double Imc, dos=2;
		Imc=findByCodCliente(codCliente).getPeso()/(Math.pow(findByCodCliente(codCliente).getPeso(), dos));
		return Imc;
	}
	
	public void mostrarClientes() {
		for (int i = 0; i < listado.length; i++) {
			System.out.println(listado[i]);
		}
	}
	
}
