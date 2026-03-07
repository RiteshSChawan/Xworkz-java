class FiberExecutor {

    public static void main(String[] fiber) {
		
		Fiber fiber1 = new Fiber();
		fiber1.name = "Optical";
		fiber1.length = 100.5; 
		String[] vendors1 = {"ABC", "XYZ"};
		fiber1.vendors = vendors1;
        fiber1.display();
		
		Fiber fiber2 = new Fiber();
		fiber2.name = "Plastic";
		fiber2.length = 80.2; 
		String[] vendors2 = {"FiberTech", "NetWorld"};
		fiber2.vendors = vendors2;
        fiber2.display();
		
		Fiber fiber3 = new Fiber();
		fiber3.name = "Glass";
		fiber3.length = 120.5; 
		String[] vendors3 = {"SpeedNet", "QuickFiber"};
		fiber3.vendors = vendors3;
        fiber3.display();
		
		Fiber fiber4 = new Fiber();
		fiber4.name = "Hybrid";
		fiber4.length = 95.7; 
		String[] vendors4 = {"UltraNet", "LinkFiber"};
		fiber4.vendors = vendors4;
        fiber4.display();
		
       
    }
}