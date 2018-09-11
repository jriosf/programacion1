package Vista;

import javax.swing.JOptionPane;

public class InterfazGrafica 
{

	public InterfazGrafica()
	{
		
	}
	
	public void comenzarPrograma()
	{
		
		JOptionPane.showMessageDialog(null, "Bienvenido al programa");
		
	}
	
	public void Superheroes()
	{
		JOptionPane.showMessageDialog(null, "Super Heroes");
	}
	
	public void Superman()
	{
		JOptionPane.showMessageDialog(null,  "[1]Superman");
		
	}
	
	public void Supermandespegar()
	{
		Modelo.Superman superman = new Modelo.Superman();
		JOptionPane.showMessageDialog(null, superman.Despegar());
	}
	
	public void SupermanAterrizar()
	{
		Modelo.Superman superman = new Modelo.Superman();
		JOptionPane.showMessageDialog(null, superman.aterrizar());
		
	}
	
	public void Supermanvolar()
	{
		Modelo.Superman superman = new Modelo.Superman();
		JOptionPane.showMessageDialog(null, superman.fly());
		
	}
	
	public void Supermanpoder()
	{
		Modelo.Superman superman = new Modelo.Superman();
		JOptionPane.showMessageDialog(null, superman.poder());
		
	}
	
	public void Supermansaltaredificios()
	{
		Modelo.Superman superman = new Modelo.Superman();
		JOptionPane.showMessageDialog(null, superman.saltarEdificios());
		
	}
	
	public void Supermanbalas()
	{
		Modelo.Superman superman = new Modelo.Superman();
		JOptionPane.showMessageDialog(null, superman.detenerBalas());
		
	}
	public void Supermancomer()
	{
		Modelo.Superman superman = new Modelo.Superman();
		JOptionPane.showMessageDialog(null, superman.comer());
		
	}
	
	public void Supergirl()
	{
		JOptionPane.showMessageDialog(null, "Mujer maravilla");
	}
	
	
	public void SupergirlPoder()
	{
		Modelo.Supergirl supergirl = new Modelo.Supergirl();
		JOptionPane.showMessageDialog(null, supergirl.poder());
		}
	public void SupergirlComer()
	{
		Modelo.Supergirl supergirl = new Modelo.Supergirl();
		JOptionPane.showMessageDialog(null, supergirl.comer());
	}
	
	
	public void ave()
	{
		JOptionPane.showMessageDialog(null, "Ave");
	}
	
	public void avedespegar()
	{
		Modelo.Bird ave = new Modelo.Bird();
		JOptionPane.showMessageDialog(null, ave.Despegar());
	}

	public void avevolar()
	{
		Modelo.Bird ave = new Modelo.Bird();
		JOptionPane.showMessageDialog(null, ave.fly());
	}
	
	public void aveAterrizar()
	{
		Modelo.Bird ave = new Modelo.Bird();
		JOptionPane.showMessageDialog(null, ave.aterrizar());
	}

	public void aveComer()
	{
		Modelo.Bird ave = new Modelo.Bird();
		JOptionPane.showMessageDialog(null, ave.comer());
	}
	
	public void aeronave()
	{
		JOptionPane.showMessageDialog(null, "Aeronave");
	}
	
	public void Aeronavedespegar()
	{
		Modelo.AirPlane aeroplano = new Modelo.AirPlane();
		JOptionPane.showMessageDialog(null, aeroplano.Despegar());
	}
	
	public void Aeronavolar()
	{
		Modelo.AirPlane aeroplano = new Modelo.AirPlane();
		JOptionPane.showMessageDialog(null, aeroplano.fly());
	}
	
	public void Aeronaveconducir()
	{
		Modelo.AirPlane aeroplano = new Modelo.AirPlane();
		JOptionPane.showMessageDialog(null, aeroplano.Conducir());
	}
	
	public void Aeronaaterrizar()
	{
		Modelo.AirPlane aeroplano = new Modelo.AirPlane();
		JOptionPane.showMessageDialog(null, aeroplano.aterrizar());
	}
	
}
