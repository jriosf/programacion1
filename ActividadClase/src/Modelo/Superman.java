package Modelo;

public class Superman extends Kryptonian implements Flyer
{

	
	
	public Superman() 
	{
		
		
		
	}

	@Override
	public String Despegar() 
	{
		String despegar = "Superman despega en la mañana hacia su trabajo o lugares con gran peligro";
		
		return despegar;
	}

	@Override
	public String aterrizar() {
		String Aterrizar = "Superman aterriza en las noches en su casa despues de un largo dia de trabajo";
		
		return Aterrizar; 
	}

	@Override
	public String fly() {
		String volar = "Al volar , el mira todo a su alrededor y se fija que no este pasando nada malo";
		
		return volar; 
	}

	@Override
	public String poder() {
		String poder = "Ademas de volar, sus poderes son rayos laser, super fuerza y agilidad";
		
		return poder; 
	}

	
	public String saltarEdificios()
	{
		String saltar = "el salta por los edificios cuando persigue villanos";
		
		return saltar; 
		
		
	}
	
	public String detenerBalas()
	{
		String detener = "detiene las balas ya que su cuerpo es muy fuerte";
		
		return detener; 
	}
	
	public String comer()
	{
		String comer = super.comer();
		
		return comer;
	}
	
}
