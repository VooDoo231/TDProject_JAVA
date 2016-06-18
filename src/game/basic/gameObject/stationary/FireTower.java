package game.basic.gameObject.stationary;

import game.logic.position.interfaces.Positionable;
import game.special.gameDataType.ElementType;

public class FireTower extends Tower{

	/**
	 * Title: FireTower
	 * Use: Is a FireTower for the Game
	 */
	private static final long serialVersionUID = 1L;
	
	public FireTower(Positionable pos, int tDMG, int tRANGE, int tSPEED, int tCOST, ElementType tTYP) {
		super(pos, tDMG, tRANGE, tSPEED, tCOST, tTYP);
	}
	
}
