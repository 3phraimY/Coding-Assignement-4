
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fibonacci(1));
	}
	
	//takes in int index, which determines how many times the algorithm is run
	//prints out the counter
	//returns int of Fibbonacci sequence
	public static int Fibonacci(int index)
	{
		//num1 lower temp
		int num1 = 0;
		//num2 higher temp
		int num2 = 1;
		int sum = 1;
		int counter = 0;
		
		//every time through sum is calulated
		//lowest temp value is set to higher
		//higher temp value is set to sum
		//counter is incremented
		for(int i =0; i<index; i++)
		{
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			counter++;
		}
		System.out.println("times run: " + counter);
		return sum;
	}
}
