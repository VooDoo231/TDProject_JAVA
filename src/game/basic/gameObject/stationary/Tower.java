package game.basic.gameObject.stationary;

import game.logic.position.interfaces.Positionable;
import game.special.gameDataType.ElementType;

public class Tower extends AbstractStationaryGameObject{

	/**
	 * Title: Tower
	 * Use: Superclass for Towers
	 */
	private static final long serialVersionUID = 1L;

	protected int towerDMG;
	protected int towerRANGE;
	protected int towerSPEED;
	protected int towerCOST;
	protected ElementType towerTYP;
	
	

	public Tower(Positionable pos, int tDMG, int tRANGE, int tSPEED, int tCOST, ElementType tTYP) {
		super(pos);
		this.setTowerDMG(tDMG);
		this.setTowerRANGE(tRANGE);
		this.setTowerSPEED(tSPEED);
		this.setTowerCOST(tCOST);
		this.setTowerTYP(tTYP);

	}	
	
	public int getTowerDMG() {
		return towerDMG;
	}

	public void setTowerDMG(int towerDMG) {
		this.towerDMG = towerDMG;
	}

	public int getTowerRANGE() {
		return towerRANGE;
	}

	public void setTowerRANGE(int towerRANGE) {
		this.towerRANGE = towerRANGE;
	}

	public int getTowerSPEED() {
		return towerSPEED;
	}

	public void setTowerSPEED(int towerSPEED) {
		this.towerSPEED = towerSPEED;
	}

	public int getTowerCOST() {
		return towerCOST;
	}
	
	public void setTowerCOST(int towerCOST) {
		this.towerCOST = towerCOST;
	}
	
	public ElementType getTowerTYP() {
		return towerTYP;
	}

	public void setTowerTYP(ElementType towerTYP) {
		this.towerTYP = towerTYP;
	}

}
