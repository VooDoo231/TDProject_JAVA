package game.basic.gameObeject;

import javax.swing.JComponent;

import game.basic.gameObject.interfaces.GameObject;
import game.logic.position.interfaces.Positionable;
import game.logic.position.Position;

public abstract class AbstractGameObject extends JComponent implements GameObject{

	/**
	 * Title: AbstactGameObject
	 * Use: Superclass for GameObjects
	 */
	
	private Positionable pos;
	
	private static final long serialVersionUID = 1L;
	
	public AbstractGameObject(Positionable pos) {
		this.pos = pos;
	}
	
	@Override
	public Positionable getPos() {
		return this.pos;
	}
	
	@Override
	public void setPos(Positionable pos) {
		this.pos = pos;
	}
	@Override
	public void setPos(int x, int y) {
		if (this.pos == null)
			this.setPos(new Position(0, 0));
		
		this.setX( x );
		this.setY( y );
	}
	
	@Override
	public void setX(int x) {
		this.pos.setX( x );
	}
	@Override
	public void setY(int y) {
		this.pos.setY( y );
	}	
}
