package Modelo;

public class Supergirl extends Kryptonian {

	@Override
	public String poder() 
	{
		String Poder = "sus poderes son super vuelo, fuerza, curación, reflejos, entre muchos otros.";
		return Poder;
	}

	
	public String comer()
	{
	 String Comer = super.comer();
	 return Comer; 
	}
	
}
