package game.basic.gameObject.moveable;

import game.logic.position.interfaces.Positionable;
import game.special.gameDataType.ElementType;

public class Unit extends AbstractMovableGameObject{

	/**
	 * Title: Enemy
	 * Use: Superclass for units
	 */
	private static final long serialVersionUID = 1L;

	protected int unitDMG;
	protected int unitSPEED;
	protected int unitHP;
	protected ElementType unitTYP;

	
	public Unit(Positionable pos, int uDMG, int uSPEED, int uHP, ElementType uTYP) {
		super(pos);
		this.setUnitDMG(uDMG);
		this.setUnitSPEED(uSPEED);
		this.setUnitHP(uHP);
		this.setUnitTYP(uTYP);
	}


	public int getUnitDMG() {
		return unitDMG;
	}


	public void setUnitDMG(int unitDMG) {
		this.unitDMG = unitDMG;
	}


	public int getUnitSPEED() {
		return unitSPEED;
	}


	public void setUnitSPEED(int unitSPEED) {
		this.unitSPEED = unitSPEED;
	}


	public int getUnitHP() {
		return unitHP;
	}


	public void setUnitHP(int unitHP) {
		this.unitHP = unitHP;
	}


	public ElementType getUnitTYP() {
		return unitTYP;
	}


	public void setUnitTYP(ElementType unitTYP) {
		this.unitTYP = unitTYP;
	}

}
