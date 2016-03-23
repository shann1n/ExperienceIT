class Birthday {
	public static void main(String[] args) {
		
		String DOB = "10/15/2014";
		String month = "";
		String day = "";
		String year = "";
		
		month = DOB.substring (0,2);
		day = DOB.substring (3,5);
		year = DOB.substring (6,10);
		
	
				
		System.out.println("Birthday: " +DOB);
		System.out.println("Month: " +month);
		System.out.println("Day: " +day);
		System.out.println("Year: " +year);
	}
}

