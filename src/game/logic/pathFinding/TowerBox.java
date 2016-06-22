package game.logic.pathFinding;

import game.basic.gameObject.stationary.Tower;
import game.logic.position.interfaces.Positionable;

public class TowerBox extends Box {

	private Tower tower;
	
	public TowerBox(Positionable pos, int lay, Tower tower) {
		super(pos, lay);
		this.setTower(tower);
	}
	
	public Tower getTower() {
		return tower;
	}

	public void setTower(Tower tower) {
		this.tower = tower;
	}

}
