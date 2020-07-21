class IndianArmy {

	int totalSoldiers = 0;
	static String chiefName = "President Ram Nath Kovind";

	void displayCount() {
	
		System.out.println("Indian Army - Total Soldiers = "+totalSoldiers);
	}

	static void showChiefName() {
	
		System.out.println("Indian Army - Chief is "+chiefName);
	}
}

class IndianNavy {

	int totalSoldiers = 0;
	static String chiefName = "Admiral Karambir Singh";
	
	void displayCount() {
	
		System.out.println("Indian Navy - Total Soldiers = "+totalSoldiers);
	}

	static void showChiefName() {
	
		System.out.println("Indian Navy - Chief is "+chiefName);
	}
}

class IndianAirForce {

	int totalSoldiers = 0;
	static String chiefName = "Rakesh Kumar Singh Bhadauria";
	
	void displayCount() {
	
		System.out.println("Indian Air Force - Total Soldiers = "+totalSoldiers);
	}
	
	static void showChiefName() {
	
		System.out.println("Indian Air Force - Chief is "+chiefName);
	}
}

class IndianArmedForce {
	
	public static void main(String []args){
		IndianArmy army = new IndianArmy();
		army.totalSoldiers = 1237117;
		army.displayCount();
		army.showChiefName();
		
		IndianNavy navy = new IndianNavy();
		navy.totalSoldiers = 67252;
		navy.displayCount();
		navy.showChiefName();
		
		IndianAirForce airForce = new IndianAirForce();
		airForce.totalSoldiers = 139576;
		airForce.displayCount();
		airForce.showChiefName();
	}
}
