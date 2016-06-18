package game.special.gameDataType;

public class Normal extends ElementType{
	public Normal() {
		this.name = this.getClass().getName().toString();
		this.goodVS = "All";
		this.badVS = "None";
	}
}
