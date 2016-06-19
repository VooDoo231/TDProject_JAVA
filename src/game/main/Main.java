package game.main;

import java.util.HashMap;
import java.util.Map;

import game.logic.pathFinding.BoxMap;

public class Main {
	public static void main(String args[]) {
		BoxMap map = new BoxMap(10, 10);
		
		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(map.getBoxAt(i, j));
			}
		}
	}
}
