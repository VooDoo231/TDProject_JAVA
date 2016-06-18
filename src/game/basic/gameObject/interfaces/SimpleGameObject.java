package game.basic.gameObject.interfaces;

import game.logic.position.interfaces.Positionable;

public interface SimpleGameObject {
	
	public abstract Positionable getPos();
	
	public abstract void setPos(Positionable pos);
	public abstract void setPos(int x, int y);
	public abstract void setX(int x);
	public abstract void setY(int y);
	
	public abstract int getWidth();
	public abstract int getHeight();
}
