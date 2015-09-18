class A{
	public A(){
		System.out.println("I am A");
	}
}
class B{
	public B(){
		System.out.println("I am B");
	}
}
class C extends A{
}
public class prob1{
	public static void main(String args[]){
		A a = new A();
		B b = new B();
		C c = new C();
	}
}
