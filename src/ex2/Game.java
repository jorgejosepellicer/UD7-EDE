package ex2;

public class Game {
	
	//Constantes
	
	Player player1 = new Player(0,0);
	
	public void movement(Direction direction) {
		switch (direction) {
			case RIGHT:
				player1.moveRight();
				break;
			case LEFT:
				player1.moveLeft();
				break;
			case UP:
				player1.moveUp();
				break;
			case DOWN:
				player1.moveDown();
				break;
		}
		System.out.println(player1.getPosition());
	}
}
