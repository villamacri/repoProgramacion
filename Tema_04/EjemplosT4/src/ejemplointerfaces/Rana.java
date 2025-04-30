package ejemplointerfaces;

public class Rana extends Anfibio implements IPresa, IDepredador{

	@Override
	public void observar() {
		// TODO Auto-generated method stub
		System.out.println("Rana mirando 360º");
	}

	@Override
	public void huir() {
		// TODO Auto-generated method stub
		System.out.println("Salto triple");
	}

	@Override
	public void cazar() {
		// TODO Auto-generated method stub
		System.out.println("Me chupo la mosca");
	}

	@Override
	public void perseguir() {
		// TODO Auto-generated method stub
		System.out.println("Acosando moscas");
	}

}
