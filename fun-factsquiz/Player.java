public class Player extends person {


  	private String name;

	public Player() {

		super();

		  setName("unknown");
  }
		public Player(String name){
			super(name);

		setName(name);
		}
		public String getName(){
			return name;
		}
		public void setName(String name){
			name=name;
		}
 }

