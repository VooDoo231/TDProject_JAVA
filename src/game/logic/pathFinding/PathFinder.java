package game.logic.pathFinding;

import java.util.HashMap;

public class PathFinder {
	
	HashMap<String, Box> map;
	
	public PathFinder(HashMap<String, Box> map) {
		this.map = map;
	}
	
	public HashMap<String, Box> findPath() {
		return this.map;
	}
}
