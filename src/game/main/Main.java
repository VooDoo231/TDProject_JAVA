package game.main;

import java.util.HashMap;
import java.util.Map;

import game.basic.gameObject.stationary.FireTower;
import game.grafik.GUItdgame;
import game.logic.pathFinding.Box;
import game.logic.pathFinding.BoxMap;
import game.logic.position.Position;

public class Main {
	public static void main(String args[]) {
		int width, height;
		width = 20;
		height = 20;
		BoxMap map = new BoxMap(width, height);
		GUItdgame display = new GUItdgame(map);
		display.run();
		
		for(int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				System.out.print(map.getBoxAt(i, j).consoleGrafik());
			}
			System.out.println("");
		}
	}
}
