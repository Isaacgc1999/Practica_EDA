package utils;
import java.util.Scanner;

public class Campeonato {
	
	boolean existeID=false;
	TablaDispersa campeonato = new TablaDispersa();
	
	@SuppressWarnings("static-access")
	public void insertarJugador() {	
		String nombre = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el nombre del jugador");
		
		if(input.hasNextLine()){
			  nombre = input.nextLine();
			}
		
		input.close();
		
		if(isEmpty())
		{
			Jugador j = new Jugador(nombre);
			campeonato.tabla[0] = j;
		}
		else
		{
			for(int i=0;i<campeonato.TAMTABLA;i++)
			{
				if(nombre == campeonato.tabla[i].id)
				{
					System.out.println("Error. Un jugador con el mismo nombre ya esta inscrito");
					existeID = true;
				}
			}
			if(existeID == false)
			{
				Jugador j = new Jugador(nombre);
				campeonato.tabla[campeonato.numJugadores+1] = j;
				campeonato.numJugadores ++;
			}
		}	
		
	}
	
	boolean isEmpty()
	{
		if(campeonato.numJugadores == 0) {
			return true;
		}
		return false;
	}
	
	public void anyadirPuntos()
	{
		String iden = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el id del jugador");
		
		if(input.hasNextLine()){
			  iden = input.nextLine();
		}
		
		int sumarP = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce la puntuacion a anyadir al jugador");
		
		if(in.hasNextLine()){
			  sumarP = in.nextInt();
		}
		
		for(int i=0;i<campeonato.numJugadores;i++)
		{
			if(iden == campeonato.tabla[i].id)
			{
				campeonato.tabla[i].puntuacion += sumarP; 
			}
		}
		input.close();
		in.close();	
	}
	
	public void eliminarPuntos()
	{
		String iden = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el id del jugador");
		
		if(input.hasNextLine()){
			  iden = input.nextLine();
		}
		
		int sumarP = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce la puntuacion a anyadir al jugador");
		
		if(in.hasNextLine()){
			  sumarP = in.nextInt();
		}
		
		for(int i=0;i<campeonato.numJugadores;i++)
		{
			if(iden == campeonato.tabla[i].id)
			{
				campeonato.tabla[i].puntuacion -= sumarP; 
			}
		}
		input.close();
		in.close();	
	}
	
	public void eliminarJugador()
	{

		String iden = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el id del jugador");
		
		if(input.hasNextLine()){
			  iden = input.nextLine();
		}
		
		for(int i=0;i<campeonato.numJugadores;i++)
		{
			if(iden == campeonato.tabla[i].id)
			{
				campeonato.tabla[i] = null;
			}
		}
		input.close();
		
	}

}
