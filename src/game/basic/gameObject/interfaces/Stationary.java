package game.basic.gameObject.interfaces;

import game.logic.position.interfaces.Positionable;

public interface Stationary {
	
	void place();
	
	void setDeltaPos(Positionable deltaPos);
	Positionable getDeltaPos();
	
}
