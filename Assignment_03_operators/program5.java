class Pune {

	static int covidActiveCases;
	int totalCases;

	static void noCorona() {
	
		System.out.println("Stay safe");
	}

	void lockdown() {
	
		covidActiveCases++;
		totalCases++;
		System.out.println("Active Cases : "+covidActiveCases); 	
		System.out.println("Total Cases : "+totalCases); 	
	}
	
	void noLockdown() {
	
		covidActiveCases++;
		totalCases++;
		System.out.println("Active Cases : "+covidActiveCases); 	
		System.out.println("Total Cases : "+totalCases); 	
	}
}

class Mumbai {

	static int covidActiveCases;
	int totalCases;

	static void noCorona() {
	
		System.out.println("Stay safe");
	}

	void lockdown() {
	
		covidActiveCases++;
		totalCases++;
		System.out.println("Active Cases : "+covidActiveCases); 	
		System.out.println("Total Cases : "+totalCases); 	
	}
	
	void noLockdown() {
	
		covidActiveCases++;
		totalCases++;
		System.out.println("Active Cases : "+covidActiveCases); 	
		System.out.println("Total Cases : "+totalCases); 	
	}
}

class Maharastra {

	public static void main(String []args) {
	
		Pune katraj = new Pune();
		katraj.covidActiveCases = 20;
		katraj.totalCases = 120;
		katraj.lockdown();
		katraj.noLockdown();
		katraj.lockdown();
		katraj.noLockdown();
		katraj.noCorona();

		Mumbai dharavi = new Mumbai();
		dharavi.covidActiveCases = 60;
		dharavi.totalCases = 350;
		dharavi.lockdown();
		dharavi.noLockdown();
		dharavi.lockdown();
		dharavi.noLockdown();
		dharavi.noCorona();
	} 
}
