package game.logic.pathFinding;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

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
				this.hashBoxMap.put(new Position(i, j).toString(), new Box(new Position(30 * i, 30 * j), 1));
			}
		}
	}
	
	private void genMap() {
		int y, ranInt;
		Random ranVal = new Random();
		y = ranVal.nextInt(this.getHeight());		
		
		for (int x = 0; x < this.getWidth(); x++) {			
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
				this.hashBoxMap.replace(new Position(x, y-1).toString(),new Box(new Position(30 * x, 30 * (y-1)), 0));
				this.hashBoxMap.replace(new Position(x, y).toString(),new Box(new Position(30 * x, 30 * y), 0));
			}		
	}
	
	private void findShortestPath() {
		
	}

	public Set<Entry<String, Box>> entrySet() {
		return this.hashBoxMap.entrySet();
	}
	
	public Box getBoxAt(String key) {
		return this.hashBoxMap.get(key);
	}
	
	public Box getBoxAt(int x, int y) {
		return this.hashBoxMap.get(new Position(x, y).toString());
	}
	
	public Box findBox(int posX, int posY) {
		System.out.println( posX + "=>" + (posX / 30) * 30);
		System.out.println( posY + "=>" + (posY / 30) * 30);
		System.out.println(new Position(((posX / 30) * 30) / 30, ((posY / 30) * 30) / 30).toString());
		return this.hashBoxMap.get(new Position(((posX / 30) * 30) / 30, ((posY / 30) * 30) / 30).toString());
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

