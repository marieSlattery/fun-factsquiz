public class person {
	private String name;
	private int playernum;


	public String getName() { return name;}
	public int getPlayernum() { return playernum;}
	
	
	public void setName( String name) {
			this.name = name;
		}
	public void setPlayernum (int playernum) {
				this.playernum = playernum;
	}
	
	public person(String name, int playernum) {
				setName(name);
				setPlayernum(playernum);
	}
	
	public person() {
			this("Not Given",0);
	}
	
	public String toString() {
			return getName() + " " + getPlayernum();
	}
}