class AirConditionerExecutor {

    public static void main(String[] args) {

        AirConditioner ac1 = new AirConditioner();
			ac1.brand = "LG";
			ac1.model = "DualCool";
			ac1.price = 45000;
			ac1.type = "Split";
			ac1.weight = 35;
			String[] colors1 = {"White","Silver"};
			ac1.colors = colors1;
			ac1.warranty = 5;
			ac1.working = true;
			ac1.display();

        AirConditioner ac2 = new AirConditioner();
			ac2.brand = "Samsung";
			ac2.model = "WindFree";
			ac2.price = 48000;
			ac2.type = "Split";
			ac2.weight = 34;
			String[] colors2 = {"Black","Grey"};
			ac2.colors = colors2;
			ac2.warranty = 4;
			ac2.working = true;
			ac2.display();

        AirConditioner ac3 = new AirConditioner();
			ac3.brand = "Voltas";
			ac3.model = "Turbo";
			ac3.price = 40000;
			ac3.type = "Window";
			ac3.weight = 38;
			String[] colors3 = {"White"};
			ac3.colors = colors3;
			ac3.warranty = 3;
			ac3.working = true;
			ac3.display();

        AirConditioner ac4 = new AirConditioner();
			ac4.brand = "Daikin";
			ac4.model = "Inverter";
			ac4.price = 52000;
			ac4.type = "Split";
			ac4.weight = 33;
			String[] colors4 = {"White","Blue"};
			ac4.colors = colors4;
			ac4.warranty = 5;
			ac4.working = true;
			ac4.display();

        
    }
}