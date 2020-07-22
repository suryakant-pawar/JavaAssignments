class Dominos {

	double price;
	int quantity;
	static double total = 0;

	Dominos(double price, int quantity) {
	
		this.price = price;
		this.quantity = quantity;
	}

	static void bill() {
	
		System.out.println("Total Bill : "+total);
	}

	public static void main(String []args) {
	
		Dominos pizza = new Dominos(200.50, 3);
		total = pizza.price * pizza.quantity;
		pizza.bill();

		Dominos fires = new Dominos(340.74, 5);
		total = fires.price * fires.quantity;
		fires.bill();
	}
}
