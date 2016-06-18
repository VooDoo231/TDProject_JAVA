package game.special.gameDataType;

public class Fire extends ElementType {	
	public Fire() {
		this.name = this.getClass().getName().toString();
		this.goodVS = "Plant";
		this.badVS = "Watter";
	}
}
