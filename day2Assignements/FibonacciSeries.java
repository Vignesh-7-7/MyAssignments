package week1.day2Assignements;

public class FibonacciSeries {
	
	void fibonacciSeries(int range)
	{
		
		int a = 0, b = 1, c= 0;
		for (int i = 1; i <=range;i++)
		{
			System.out.print(a + " ");
			c = a+b;
			a = b;
			b = c;
			
		}
		
	}

	public static void main(String[] args) {
		
		FibonacciSeries f = new FibonacciSeries();
		f.fibonacciSeries(8);
		
		}

	}


