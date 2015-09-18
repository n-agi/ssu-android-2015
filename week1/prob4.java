public class prob4{
interface a{
	public abstract void method1();
	public abstract void method2();
}
interface b{
	public abstract void method3();
	public abstract void method4();
}
interface c{
	public abstract void method5();
	public abstract void method6();
}
interface d extends a,b,c{
	public abstract void method7();
}
class concrete{
	public int test;
	public concrete(){
		System.out.println("Concrete!");
	}
}
class test extends concrete implements d{
	public test(){
		super();
	}
	public void method1(){
		System.out.println("method 1");
	}
        public void method2(){
                System.out.println("method 2");
        }
        public void method3(){
                System.out.println("method 3");
        }
        public void method4(){
                System.out.println("method 4");
        }
        public void method5(){
                System.out.println("method 5");
        }
        public void method6(){
                System.out.println("method 6");
        }
        public void method7(){
                System.out.println("method 7");
        }
	public void test1(d a){
		a.method1();
	}
	public void test2(b a){
		a.method4();
	}
	public void test3(c a){
		a.method5();
	}
	public void test4(d a){
		a.method7();
	}
}
	static test obj;
	public static void main(String args[]){
		obj = new test();
		obj.test1(a);
		
	}
}
