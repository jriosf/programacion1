package Modelo;

public class Bird extends Animal implements Flyer
{

	public Bird()
	{
		
	}
	
	
	@Override
	public String comer() {
		String Comer = "el pajaro come alpiste";
		return Comer; 
	}


	@Override
	public String Despegar() {
		String Despegar = "los pajaros despegan en las mañanas cuando se despierta";
		return Despegar; 
	}


	@Override
	public String aterrizar() {
		String Aterrizar = "el pajaro aterriza en los lugares donde lo ve seguro";
		return Aterrizar; 
	}


	@Override
	public String fly() {
		String volar = "el pajaro vuela para buscar comida o desplazarse de lugar";
		return volar; 
	}

}
