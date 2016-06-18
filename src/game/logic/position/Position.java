package game.logic.position;

import game.logic.position.interfaces.Positionable;

public class Position implements Positionable {

	private int x;
	private int y;
	
	public Position(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	@Override
	public int getX() {
		return this.x;
	}

	@Override
	public int getY() {
		return this.y;
	}

	@Override
	public void setX(int x) {
		this.x = x;
		
	}

	@Override
	public void setY(int y) {
		this.y = y;
		
	}

	@Override
	public void move(Positionable shift) {
		this.x += shift.getX();
		this.y += shift.getY();
	}

	@Override
	public void moveTo(Positionable pos) {
		this.x = pos.getX();
		this.y = pos.getY();
	}

}
