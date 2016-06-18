package game.basic.gameObject.interfaces;

import game.logic.position.interfaces.Positionable;

public interface Moveable {
	
	void move();
	
	void setDeltaPos(Positionable deltaPos);
	Positionable getDeltaPos();
	
}
