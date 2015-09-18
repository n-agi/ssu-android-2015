class Rodent{
	public Rodent(){
		System.out.println("I am rodent.");
	}
	public void Rodent_common(){
		System.out.println("I don't know what's in common.");
	}
}
class Gerbil extends Rodent{
	public Gerbil(){
		super();
		System.out.println("and I am a gerbil.");
	}
	public void Rodent_common(){
		System.out.println("Gerbil's common action from rodent.");
	}
}
class Mouse extends Rodent{
	public Mouse(){
		super();
		System.out.println("and I am a mouse.");
	}
        public void Rodent_common(){
                System.out.println("Mouse's common action from rodent.");
        }

}
class Hamster extends Rodent{
	public Hamster(){
		super();
		System.out.println("and I am a hamster.");
	}
        public void Rodent_common(){
                System.out.println("Hamster's common action from rodent.");
        }

}
public class prob3{
	public static void main(String args[]){
		Gerbil a = new Gerbil();
		a.Rodent_common();
		Mouse b = new Mouse();
		b.Rodent_common();
		Hamster c = new Hamster();
		c.Rodent_common();
	}
}
