class Investor {
	public static void main(String[] args) {
		float total = 14000;
		
		System.out.println("Start Investment: $" + total);
		total = total + (total * .4F);
		
				
		
		
		System.out.println("First Year: $" + total);
		total = total - 1500F;
		
		System.out.println("Second Year: $" + total);
		total = total + (total * .12F);
		
		System.out.println("Thrid Year: $" + total);
	}
	}