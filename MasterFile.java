public class MasterFile {

	public MasterFile()
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
		//Sanjana - I learned about lambda notations and how to make them. I also learned what pushing and pulling meant and I learned about Gitkraken and how it is easier to work with a partner with GitKraken.

	}

	public static void main (String [] args) {
		MasterFile app = new MasterFile();
	}
}