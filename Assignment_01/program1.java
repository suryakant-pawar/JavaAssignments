class BoycottChineseProduct {

	int noOfProduct = 0;

	void displayCount() {
	
		System.out.println("Total Products = "+noOfProduct);
	}

	static void displayProdNames() {
	
		System.out.println("TikTok");
		System.out.println("UC Browser");
	}
}

class Main {

	public static void main(String []args) {
	
		BoycottChineseProduct prod = new BoycottChineseProduct();
		prod.noOfProduct = 120;
		prod.displayCount();
		prod.displayProdNames();
	}
}
