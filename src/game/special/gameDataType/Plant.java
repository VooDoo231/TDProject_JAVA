package game.special.gameDataType;

public class Plant extends ElementType{
	public Plant() {
		this.name = this.getClass().getName().toString();
		this.goodVS = "Watter";
		this.badVS = "Fire";
	}
}
