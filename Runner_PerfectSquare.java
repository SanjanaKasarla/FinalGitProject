public class Runner_PerfectSquare
{

	public Runner_PerfectSquare()
	{
		PerfSquare function = (num) ->
		{
			double sr = Math.sqrt(num);
			if((sr)-(int)(sr) == 0)
				return true;

				return false;
		};

		System.out.println(function.perfSquare(25));
		System.out.println(function.perfSquare(24));
	}

	public static void main (String [] args)
	{
		Runner_PerfectSquare app = new Runner_PerfectSquare();
	}

}