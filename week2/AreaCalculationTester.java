import java.util.Scanner;
class lessthanZERO extends Exception{
        public lessthanZERO(String msg){
                System.out.println(msg);
        }
}
public class AreaCalculationTester 
{
	public static void main(String []args)
	{
		String input;
		double length;
		double width;
		boolean flag = true;
		while(flag){
		try{
			Scanner in = new Scanner(System.in); 
			System.out.println("Enter the length ");
			input=in.next();
			length=Integer.parseInt(input);
			System.out.println("Enter the width ");
			input=in.next();
			width=Integer.parseInt(input);
			if(width < 0.0 || length < 0.0){
				throw new lessthanZERO("Input is less than zero");
			}
			AreaCalculation obj1=new AreaCalculation(length,width);
			System.out.println(obj1.getArea());
			flag = false;
			}
			catch(Exception e){
				System.out.println("Input cannot be letter");
			}
		}
	}
}
class AreaCalculation 
{
	private double length;
	private double width;
	public AreaCalculation(double length, double width)
	{
		this.length=length;
		this.width=width;
	}
	public double getArea()
	{
		return length*width;
	}
}

