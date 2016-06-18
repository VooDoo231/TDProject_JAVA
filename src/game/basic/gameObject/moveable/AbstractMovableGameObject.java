package game.basic.gameObject.moveable;

import game.basic.gameObeject.AbstractGameObject;
import game.basic.gameObject.interfaces.Moveable;
import game.logic.position.interfaces.Positionable;

public abstract class AbstractMovableGameObject extends AbstractGameObject implements Moveable{
	/**
	 * Title: AbstractStationaryGameObject
	 * Use: Superclass for MovableGameObjects
	 */
	
	private static final long serialVersionUID = 1L;
	private Positionable deltaPos;
	
	public AbstractMovableGameObject(Positionable pos) {
		super(pos);
	}
	
	@Override
	public void move() {
		int newY = this.getPos().getX() + this.getDeltaPos().getX();
		int newX = this.getPos().getY() + this.getDeltaPos().getX();
		this.setPos(newX, newY);
	}
	
	@Override
	public void setDeltaPos(Positionable deltaPos) {
		this.deltaPos = deltaPos;
	}
	
	@Override
	public Positionable getDeltaPos() {
		return this.deltaPos;
	}
}
