package Controlador;

import Modelo.Mundo;
import Vista.InterfazGrafica;

public class Controlador 
{

	Mundo c = new Mundo();
	InterfazGrafica gui = new InterfazGrafica();
	
	public Controlador()
	{
		
		gui.comenzarPrograma();
		gui.Superheroes();
		gui.Superman();
		gui.Supermandespegar();
		gui.Supermanvolar();
		gui.SupermanAterrizar();
		gui.Supermansaltaredificios();
		gui.Supermanpoder();
		gui.Supermanbalas();
		gui.Supermancomer();
		gui.Supergirl();
		gui.SupergirlPoder();
		gui.SupergirlComer();
		gui.ave();
		gui.avedespegar();
		gui.avevolar();
		gui.aveAterrizar();
		gui.aveComer();
		gui.aeronave();
		gui.Aeronavedespegar();
		gui.Aeronaveconducir();
		gui.Aeronavolar();
		gui.Aeronaaterrizar();
		
		}
	
	
	
	
	
	
}
