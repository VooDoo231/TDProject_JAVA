package game.logic.pathFinding;

import javax.swing.JComponent;

import game.basic.gameObeject.AbstractGameObject;
import game.basic.gameObject.stationary.Tower;
import game.logic.position.Position;
import game.logic.position.interfaces.Positionable;

public class Box extends AbstractGameObject{
	
	public Box(Positionable pos, int lay) {
		super(pos);
		this.setLayer(lay);
		this.setWidth(30);
		this.setHeight(30);
	}

	private int layer;
	private int width;
	private int height;

	@Override
	public String toString() {
		return "(" + this.getLayer() + ", " + this.getHeight() + ", " + this.getWidth() + ")";
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
}
