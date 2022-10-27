class CmdLineArgs3 {

	public static void main(String[] args) {

		double a;
		double b;
		//Passing Numeric Command-Line arguments.

		a = Double.parseDouble(args[0]);
		b = Double.parseDouble(args[1]);
		double c = a + b;
		
		System.out.println("Addition: " + c);
	}
}