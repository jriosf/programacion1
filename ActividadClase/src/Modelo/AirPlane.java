package Modelo;

public class AirPlane extends Vehicle implements Flyer
{
	

	public AirPlane()
	{
		
	}

	@Override
	public String Despegar()
	{
	  String despegar  = "La cosa voladora despega en las mañanas";
	  return despegar; 
	}

	@Override
	public String aterrizar() 
	{
		String Aterrizar = "Aterriza en una pista de aterrizaje";
		return Aterrizar; 
	
	}

	@Override
	public String fly() {
		String volar = "el vuela hacia su destino";
		return volar; 
	}

	@Override
	public String Conducir() {
		String conducir = "conduce por los aires";
		return conducir; 
	}
	
}
