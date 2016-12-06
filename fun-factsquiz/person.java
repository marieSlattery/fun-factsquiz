public class person {
	private String name;


	//Accessor Methods
	public String getName() { return name;}


		//mutator methods
	public void setName( String name) {
			this.name = name;
		}


	public person(String name ) {
				setName(name);

	}

	public person() {
			this("Not Given");
	}

	public String toString() {
			return getName();
	}
}