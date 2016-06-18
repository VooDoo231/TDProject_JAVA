package game.logic.position.interfaces;

public interface Positionable {
	
	public abstract int getX();
	public abstract int getY();
	
	public abstract void setX(int x);
	public abstract void setY(int y);
	
	public abstract void move(Positionable shift);
	public abstract void moveTo(Positionable pos);
	
	public abstract String toString();
	public abstract boolean equals(Object other);
}
