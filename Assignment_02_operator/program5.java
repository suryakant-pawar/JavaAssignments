class UnaryProgram_3 {

	public static void main(String []args) {
	
		int a = 10, b = 20, c = 50, ans = 0;

		ans = a++ + --b + c--;
		
		System.out.println("Ans = "+ans);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
	} 
}
