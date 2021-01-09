package main;
import utils.Campeonato;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Campeonato c = new Campeonato();
		
		Scanner input = new Scanner(System.in);
		
		int option = 0;
			
		do {
			System.out.println("Introduce la opcion que quieras");
			System.out.println("");
			System.out.println("0. Exit");
			System.out.println("1. Insertar Jugador");
			System.out.println("2. Anyadir puntos");
			System.out.println("3. Insertar Jugador");
			System.out.println("4. Visualizar Ronda");		
			System.out.println("5. Eliminar Puntos");
			System.out.println("6. Eliminar Jugador");
			System.out.println("7. Ver puntuaciones");

			option = input.nextInt();
				
			switch(option) {
				case 1: c.insertarJugador();	
						break;
				case 2: c.anyadirPuntos();	
						break;
				case 3:c.eliminarPuntos();	
						break;		
				case 4: c.eliminarJugador();	
						break;
				case 5: //c.verPuntuaciones();	
						break;
			
			}
			
			
		}while(option!=0);
		
		input.close();
		return;
		

	}

}
