package game.logic.pathFinding;

public class Box {
	
	private int layer;
	private int width;
	private int height;
	
	
	public Box(int lay, int width, int height) {
		this.setLayer(lay);
		this.setWidth(width);
		this.setHeight(height);
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
