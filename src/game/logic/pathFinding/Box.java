package game.logic.pathFinding;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

import game.basic.gameObeject.AbstractGameObject;
import game.basic.gameObject.stationary.AbstractStationaryGameObject;
import game.basic.gameObject.stationary.Tower;
import game.logic.position.Position;
import game.logic.position.interfaces.Positionable;
import sun.security.krb5.internal.TGSRep;

public class Box extends AbstractStationaryGameObject{
	
	private int layer;
	private int width;
	private int height;
	private Tower tower;

	public Box(Positionable pos, int lay) {
		super(pos);
		this.setLayer(lay);
		this.setWidth(29);
		this.setHeight(29);
	}	

	@Override
	public String toString() {
		return "( Lay: " + this.getLayer() + ", X: " + this.getPos().getX() + ", Y: " + this.getPos().getY() + ", HE: " + this.getHeight() + ", WI: " + this.getWidth() + ")";
	}
	
	public String consoleGrafik() {
		if(this.getLayer() == 0) {
			return "□";
		}
		else if(this.getLayer() == 1) {
			return "■";
		}
		return null;
	}
	
	public int getLayer() {
		return layer;
	}

	public void setLayer(int layer) {
		this.layer = layer;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public Tower getTower() {
		return tower;
	}

	public void setTower(Tower tower) {
		this.tower = tower;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		if(this.getLayer() == 1) {
			if(this.getTower() != null) {
				this.tower.paintComponent(g);
			}
			else {
				this.setLocation(this.getPos().getX(), this.getPos().getY());
				g.setColor(new Color(120,160,20));
				g.fillRect(0, 0, this.getWidth(), this.getHeight());
			}
				
			
		}
		else {
			this.setLocation(this.getPos().getX(), this.getPos().getY());
			g.setColor(new Color(150,200,200));
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
		}		
	}
}
