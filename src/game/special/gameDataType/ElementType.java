package game.special.gameDataType;

public abstract class ElementType {
	protected String name;
	protected String goodVS;
	protected String badVS;
	
	public boolean goodAgainst(String typ) {
		if (this.goodVS == typ)
			return true;
		else
			return false;
	}
	
	public boolean badAgainst(String typ) {
		return !this.goodAgainst(typ);
	}
	
	protected String getName() {
		return name;
	}

	protected String getGoodVS() {
		return goodVS;
	}

	protected String getBadVS() {
		return badVS;
	}

	
	
	
	
}
