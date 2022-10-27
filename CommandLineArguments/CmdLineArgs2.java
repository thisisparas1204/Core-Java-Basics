class CmdLineArgs2 {

	public static void main(String[] args) {


		/*Here, we're using for loop, 
		  so user can give input as many as he wants.
		*/

		for(String item : args) {
			System.out.println(item);
		}
	}
}