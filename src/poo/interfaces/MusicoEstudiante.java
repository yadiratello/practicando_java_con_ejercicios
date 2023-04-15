package poo.interfaces;

public class MusicoEstudiante implements Musico,Estudiante{

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("Estoy hablando. bla bla bla...");
	}

	@Override
	public void estudiar() {
		// TODO Auto-generated method stub
		System.out.println("Estoy estudiando programacion");
	}

	@Override
	public void tocarMusica() {
		// TODO Auto-generated method stub
		System.out.println("estoy tocando y cantando");
	}

}
