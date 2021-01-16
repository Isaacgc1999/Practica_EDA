package utils;

public class Jugador {
	
	public String id;
	public int puntuacion;	
	boolean esAlta;
	
	public Jugador(String id)
	{
		puntuacion = 0;	
		this.id = id;
	}

	public int compareTo(Jugador jugador) {
		return this.puntuacion - jugador.puntuacion;
	}	

}


