package ex2;

public class Player {
	
	private int x, y;
	
	public Player(int x, int y) {
		this.x=x;
		this.y=y;
	}
	//Getters y setters
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//Métodos
	public void moveRight() {
		x++;
	}
	
	public void moveLeft() {
		x--;
	}
	
	public void moveUp() {
		y--;
	}
	
	public void moveDown() {
		y++;
	}
	
	public String getPosition() {
		return "(" + x + ", " + y + ")";
	}
	

}
//Primera subida