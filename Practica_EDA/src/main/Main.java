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
			System.out.println("1. Insertar jugador");
			System.out.println("2. Anyadir puntos");
			System.out.println("3. Visualizar ronda");
			System.out.println("4. Eliminar puntos");		
			System.out.println("5. Eliminar jugador");
			System.out.println("6. Ver puntuaciones");

			option = input.nextInt();
				
			switch(option) {
				case 1: c.insertarJugador();	
						break;
				case 2: c.anyadirPuntos();	
						break;
				case 3: //c.visualizarRonda();	
						break;		
				case 4: c.eliminarPuntos();
						break;
				case 5: c.eliminarJugador();	
						break;	
				case 6: //c.verPuntuaciones();	
					break;	
			}
			
			
		}while(option!=0);
		
		input.close();
		return;
		

	}

}
