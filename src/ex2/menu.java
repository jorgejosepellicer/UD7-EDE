package ex2;

//Programa main
public class Menu {
	
public static void main(String[] args) {
		
		//Crear objeto que va a ejecutar el m�todo
		Game partida1 = new Game ();
		
		partida1.movement(Direction.DOWN);
		partida1.movement(Direction.RIGHT);
		partida1.movement(Direction.RIGHT);
		partida1.movement(Direction.DOWN);
		partida1.movement(Direction.UP);
						
	}
}
