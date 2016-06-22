package game.basic.gameObject.stationary;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Stroke;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

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
	protected Color colPri, colSec;
	
	
	public Tower(Positionable pos) {
		super(pos);
		this.setSize(30, 30);
		this.setPos(pos);
		colPri = Color.BLACK;
		colSec = Color.GRAY;
	}
	
	public Tower(Positionable pos, int tDMG, int tRANGE, int tSPEED, int tCOST, ElementType tTYP) {
		super(pos);
		this.setTowerDMG(tDMG);
		this.setTowerRANGE(tRANGE);
		this.setTowerSPEED(tSPEED);
		this.setTowerCOST(tCOST);
		this.setTowerTYP(tTYP);
		
		this.setSize(30, 30);
		
		
	}	
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(colSec);
		g.fillRect(0, 0, 30, 30);
		g.setColor(colPri);
		((Graphics2D)g).setStroke(new BasicStroke(10));
		g.fillRect(5, 5, 20, 20);
		g.drawLine(0, 0, 30, 30);
		
		
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
