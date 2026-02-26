
class Camera{
	static String brand;
    static String model;
	static double price;
	static int megapixels;
	static boolean isDSLR;
	static String lensType;
	static int iso;
	static double weight;
	static boolean hasWifi;
	static String color;
	
	public static boolean createCamera(String brandName, String modelName, double priceAmt, int megapixelsNum, boolean DSL, String lenseTypeName, int isoType, double weightNum, boolean wifiConnect, String colorDesign){
		boolean isAccountCreated=false;
		boolean isCameraCreated = false;
		boolean isBrandValid = false;
		boolean isModelValid = false;
		boolean isPriceValid = false;
		boolean isMegaPixelsValid = false;
		boolean isDSLRValid = false;
		boolean isLensTypeValid = false;
		boolean isISOValid = false;
		boolean isWeightValid = false;
		boolean isWIFIValid = false;
		boolean isColorValid = false;
		
		if(brandName!=null && !brandName.isEmpty()){
			System.out.println("Brand name is Valid");
			brand = brandName;
			isBrandValid = true;
		}else {
			System.out.println("Brand name is invalid");
		}
		if(modelName!=null && !modelName.isEmpty()){
			System.out.println("Model name is Valid");
			model = modelName;
			isModelValid = true;
		}else {
			System.out.println("Model name is invalid");
		}
		if(priceAmt!=0){
			System.out.println("Price is Valid");
			price = priceAmt;
			isModelValid = true;
		}else {
			System.out.println("Price is invalid");
		}
		if(megapixels!=0){
			System.out.println("Mega pixels is Valid");
			megapixels = megapixelsNum;
			isMegaPixelsValid = true;
		}else {
			System.out.println("Mega pixels is invalid");
		}
		if(isDSLR!=false){
			System.out.println("DSLR is Valid");
			isDSLR = DSL;
			isDSLRValid = true;
		}else {
			System.out.println("DSLR is invalid");
		}
		if(lensType!=null && !lensType.isEmpty()){
			System.out.println("Lens type is Valid");
			lensType = lensType;
			isLensTypeValid = true;
		}else {
			System.out.println("Lens type is invalid");
		}
		if(iso!=0){
			System.out.println("ISO is Valid");
			iso = isoType;
			isISOValid = true;
		}else {
			System.out.println("ISO is invalid");
		}
		if(weight!=0){
			System.out.println("Weight is Valid");
			weight = weightNum;
			isWeightValid = true;
		}else {
			System.out.println("Weight is invalid");
		}
		if(hasWifi!=false){
			System.out.println("Wifi is Valid");
			hasWifi = wifiConnect;
			isWIFIValid = true;
		}else {
			System.out.println("Wifi is invalid");
		}
		if(color!=null && !color.isEmpty()){
			System.out.println("Color is Valid");
			color = colorDesign;
			isColorValid = true;
		}else {
			System.out.println("Color is invalid");
		}
		if(isBrandValid == true && isModelValid == true && isPriceValid == true && isMegaPixelsValid == true && isDSLRValid == true && isLensTypeValid==true && isISOValid==true && isWeightValid == true && isWIFIValid == true && isColorValid == true){
			isAccountCreated=true;
		}else{
			System.out.println("The camera is not valid");
		}
		return isCameraCreated;
	}
	public static void getCameraDetails(){
		System.out.println("Camera details are:");
		System.out.println("Brand name is valid" + brand);
		System.out.println("Model name is valid" + model);
		System.out.println("Price is valid" + price);
		System.out.println("Mega Pixels is valid" + megapixels);
		System.out.println("DSLR is valid"+ isDSLR);
		System.out.println("Lens is valid" + lensType);
		System.out.println("ISO is valid" + iso);
		System.out.println("Weight is valid" + weight);
		System.out.println("Wifi is valid" + hasWifi);
		System.out.println("Color is valid" + color);
	}
}
		
		
		
		
		
		
		
		
		
