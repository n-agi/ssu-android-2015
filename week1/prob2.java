class Amphibian{
	public Amphibian(){
		System.out.println("Amphibian");
	}
}
class Frog extends Amphibian{
	public Frog(){
		System.out.println("frog frog");
	}
}
public class prob2{
	public static void main(String args[]){
		Amphibian ins = new Frog();
	}
}
