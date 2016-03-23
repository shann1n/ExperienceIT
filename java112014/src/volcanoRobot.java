class volcanoRobot {
	String status;
	int speed;
	float temperature;
   
    volcanoRobot(String st, int sp,float tp){
        status=st;
        speed=sp;
        temperature=tp;
    }
	
	void checkTemperature () {
		if (temperature > 660) {
			status = "returning home";
			speed = 5;
		}
	}
	void showAttributes () {
		System.out.println("Status: " + status);
		System.out.println("Speed: " + speed);
		System.out.println("Temperature: " + temperature);
		
		}
}