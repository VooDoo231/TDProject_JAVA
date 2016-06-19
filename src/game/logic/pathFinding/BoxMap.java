package game.logic.pathFinding;

import java.util.HashMap;
import java.util.Random;

import game.logic.position.Position;

public class BoxMap {
	
	private HashMap<String, Box> hashBoxMap;
	private int width;
	private int height;
	
	
	public BoxMap(int width, int height) {
		this.hashBoxMap = new HashMap<String, Box>();
		this.setWidth(width);
		this.setHeight(height);
		this.fillMap();
		this.genMap();
	}
	
	private void fillMap() {
		for (int i = 0; i < this.getWidth(); i++) {			
			for (int j = 0; j < this.getHeight(); j++) {
				Position tempPos = new Position(i, j);
				Box tempBox = new Box(1, 10, 10);
				this.hashBoxMap.put(tempPos.toString(), tempBox );
			}
		}
	}
	
	private void genMap() {
		int x, y, ranInt;
		Random ranVal = new Random();
		x = 0;
		y = ranVal.nextInt(this.getHeight());		
		
		for (int i = 0; i < this.getWidth(); i++) {			
			for (int j = 0; j < this.getHeight(); j++) {
				if(x % 2 == 0) {
					ranInt = ranVal.nextInt(2);
					if (ranInt == 0){
						if(y <= this.getHeight() && y > 0) {
							y--;
						}
					}
					else if(ranInt == 1) {
						if(y < this.getHeight()) {
							y++;
						}
					}
				}
				this.hashBoxMap.replace(new Position(i, j).toString(),new Box(0, 10, 10));
			}
		}		
	}

	public Box getBoxAt(int x, int y) {
		return this.hashBoxMap.get(new Position(x, y).toString());
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

