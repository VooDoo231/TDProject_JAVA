package game.basic.gameObject.stationary;

import game.basic.gameObeject.AbstractGameObject;
import game.basic.gameObject.interfaces.Stationary;
import game.logic.position.interfaces.Positionable;

public abstract class AbstractStationaryGameObject extends AbstractGameObject implements  Stationary{

	/**
	 * Title: AbstractStationaryGameObject
	 * Use: Superclass for StationaryGameObjects
	 */
	private static final long serialVersionUID = 1L;
	private Positionable deltaPos;
	
	public AbstractStationaryGameObject(Positionable pos) {
		super(pos);
	}

	@Override
	public void place() {
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
