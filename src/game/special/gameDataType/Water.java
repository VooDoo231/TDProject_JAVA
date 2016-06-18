package game.special.gameDataType;

public class Water extends ElementType{
	public Water() {
		this.name = this.getClass().getName().toString();
		this.goodVS = "Fire";
		this.badVS = "Plant";
	}
}
