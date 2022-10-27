class CmdLineArgs4 {

	public static void main(String[] args) {
	
		for(String item : args) {

			/*Here, the parseInt() method of the 
			 Integer class converts the String argument
			 into an integer.
			*/

			int num = Integer.parseInt(item);

			System.out.println(num);			
		}
	}
}