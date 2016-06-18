package game.logic.pathFinding;

import java.util.HashMap;
import java.util.Random;

import game.logic.position.Position;

public class BoxMap {
	
	private HashMap<Position, Box> hashBoxMap;
	private int width;
	private int height;
	
	
	public BoxMap(int width, int height) {
		this.setWidth(width);
		this.setHeight(height);
		this.genMap(width, height);
	}
	
	private void genMap(int width, int height) {
		int x, y, ranInt;
		Random ranVal = new Random();
		x = 0;
		y = ranVal.nextInt(height);		
		for (int i = 0; i < width; i++) {			
			for (int j = 0; j < height; j++) {
				if(x % 2 == 0) {
					ranInt = ranVal.nextInt(2);
					if (ranInt == 0){
						if(y <= height && y > 0) {
							y--;
						}
					}
					else if(ranInt == 1) {
						if(y < height) {
							y++;
						}
					}
						
				}
			}
		}
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

