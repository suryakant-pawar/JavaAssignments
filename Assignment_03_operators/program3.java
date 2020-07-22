class LogicalOp {

	public static void main(String []args) {
	
		int i = 5, j = 4;

		System.out.println((i++ >= j++) && (--j < i++));
		System.out.println((--i < j--) || (j++ >= ++i));
	}
}
