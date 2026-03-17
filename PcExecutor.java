class PcExecutor {
	public static void main(String[] args) {
/*
		Hardware hardware1 = new Hardware();
		hardware1.hardwareId = 1;
		hardware1.hardwareName = "GPU";
		hardware1.brand = "NVIDIA";
		hardware1.price = 35000;
		hardware1.isInternal = true;
		Pc pc1 = new Pc();
		pc1.pcId = 1;
		pc1.pcBrand = "Dell";
		pc1.processor = "Intel i7";
		pc1.ram = 16;
		pc1.price = 90000;
		pc1.hardware = hardware1;
		pc1.getPcDetails();

		Hardware hardware2 = new Hardware();
		hardware2.hardwareId = 2;
		hardware2.hardwareName = "CPU Cooler";
		hardware2.brand = "Cooler Master";
		hardware2.price = 4500;
		hardware2.isInternal = true;
		Pc pc2 = new Pc();
		pc2.pcId = 2;
		pc2.pcBrand = "HP";
		pc2.processor = "AMD Ryzen 5";
		pc2.ram = 8;
		pc2.price = 55000;
		pc2.hardware = hardware2;
		pc2.getPcDetails();

		Hardware hardware3 = new Hardware();
		hardware3.hardwareId = 3;
		hardware3.hardwareName = "SSD";
		hardware3.brand = "Samsung";
		hardware3.price = 8000;
		hardware3.isInternal = true;
		Pc pc3 = new Pc();
		pc3.pcId = 3;
		pc3.pcBrand = "Lenovo";
		pc3.processor = "Intel i5";
		pc3.ram = 16;
		pc3.price = 75000;
		pc3.hardware = hardware3;
		pc3.getPcDetails();

		Hardware hardware4 = new Hardware();
		hardware4.hardwareId = 4;
		hardware4.hardwareName = "Motherboard";
		hardware4.brand = "ASUS";
		hardware4.price = 12000;
		hardware4.isInternal = true;
		Pc pc4 = new Pc();
		pc4.pcId = 4;
		pc4.pcBrand = "Asus";
		pc4.processor = "Intel i9";
		pc4.ram = 32;
		pc4.price = 150000;
		pc4.hardware = hardware4;
		pc4.getPcDetails();

		Hardware hardware5 = new Hardware();
		hardware5.hardwareId = 5;
		hardware5.hardwareName = "RAM";
		hardware5.brand = "Corsair";
		hardware5.price = 5500;
		hardware5.isInternal = true;
		Pc pc5 = new Pc();
		pc5.pcId = 5;
		pc5.pcBrand = "Acer";
		pc5.processor = "AMD Ryzen 7";
		pc5.ram = 32;
		pc5.price = 95000;
		pc5.hardware = hardware5;
		pc5.getPcDetails();

		Hardware hardware6 = new Hardware();
		hardware6.hardwareId = 6;
		hardware6.hardwareName = "Mechanical Keyboard";
		hardware6.brand = "Logitech";
		hardware6.price = 6000;
		hardware6.isInternal = false;
		Pc pc6 = new Pc();
		pc6.pcId = 6;
		pc6.pcBrand = "Apple";
		pc6.processor = "Apple M2";
		pc6.ram = 16;
		pc6.price = 130000;
		pc6.hardware = hardware6;
		pc6.getPcDetails();

		Hardware hardware7 = new Hardware();
		hardware7.hardwareId = 7;
		hardware7.hardwareName = "Gaming Mouse";
		hardware7.brand = "Razer";
		hardware7.price = 3500;
		hardware7.isInternal = false;
		Pc pc7 = new Pc();
		pc7.pcId = 7;
		pc7.pcBrand = "MSI";
		pc7.processor = "Intel i7";
		pc7.ram = 16;
		pc7.price = 110000;
		pc7.hardware = hardware7;
		pc7.getPcDetails();

		Hardware hardware8 = new Hardware();
		hardware8.hardwareId = 8;
		hardware8.hardwareName = "Power Supply Unit";
		hardware8.brand = "Seasonic";
		hardware8.price = 7000;
		hardware8.isInternal = true;
		Pc pc8 = new Pc();
		pc8.pcId = 8;
		pc8.pcBrand = "Gigabyte";
		pc8.processor = "AMD Ryzen 9";
		pc8.ram = 64;
		pc8.price = 180000;
		pc8.hardware = hardware8;
		pc8.getPcDetails();

		Hardware hardware9 = new Hardware();
		hardware9.hardwareId = 9;
		hardware9.hardwareName = "Monitor";
		hardware9.brand = "LG";
		hardware9.price = 18000;
		hardware9.isInternal = false;
		Pc pc9 = new Pc();
		pc9.pcId = 9;
		pc9.pcBrand = "Dell";
		pc9.processor = "Intel i5";
		pc9.ram = 8;
		pc9.price = 65000;
		pc9.hardware = hardware9;
		pc9.getPcDetails();

		Hardware hardware10 = new Hardware();
		hardware10.hardwareId = 10;
		hardware10.hardwareName = "Webcam";
		hardware10.brand = "Logitech";
		hardware10.price = 4000;
		hardware10.isInternal = false;
		Pc pc10 = new Pc();
		pc10.pcId = 10;
		pc10.pcBrand = "HP";
		pc10.processor = "Intel i3";
		pc10.ram = 8;
		pc10.price = 40000;
		pc10.hardware = hardware10;
		pc10.getPcDetails();

		Hardware hardware11 = new Hardware();
		hardware11.hardwareId = 11;
		hardware11.hardwareName = "Sound Card";
		hardware11.brand = "Creative";
		hardware11.price = 5000;
		hardware11.isInternal = true;
		Pc pc11 = new Pc();
		pc11.pcId = 11;
		pc11.pcBrand = "Lenovo";
		pc11.processor = "Intel i7";
		pc11.ram = 16;
		pc11.price = 85000;
		pc11.hardware = hardware11;
		pc11.getPcDetails();

		Hardware hardware12 = new Hardware();
		hardware12.hardwareId = 12;
		hardware12.hardwareName = "Network Card";
		hardware12.brand = "TP-Link";
		hardware12.price = 2500;
		hardware12.isInternal = true;
		Pc pc12 = new Pc();
		pc12.pcId = 12;
		pc12.pcBrand = "Acer";
		pc12.processor = "AMD Ryzen 5";
		pc12.ram = 16;
		pc12.price = 60000;
		pc12.hardware = hardware12;
		pc12.getPcDetails();

		Hardware hardware13 = new Hardware();
		hardware13.hardwareId = 13;
		hardware13.hardwareName = "HDD";
		hardware13.brand = "Seagate";
		hardware13.price = 3500;
		hardware13.isInternal = true;
		Pc pc13 = new Pc();
		pc13.pcId = 13;
		pc13.pcBrand = "Apple";
		pc13.processor = "Apple M3";
		pc13.ram = 24;
		pc13.price = 175000;
		pc13.hardware = hardware13;
		pc13.getPcDetails();

		Hardware hardware14 = new Hardware();
		hardware14.hardwareId = 14;
		hardware14.hardwareName = "Blu-ray Drive";
		hardware14.brand = "LG";
		hardware14.price = 6000;
		hardware14.isInternal = true;
		Pc pc14 = new Pc();
		pc14.pcId = 14;
		pc14.pcBrand = "MSI";
		pc14.processor = "Intel i9";
		pc14.ram = 32;
		pc14.price = 200000;
		pc14.hardware = hardware14;
		pc14.getPcDetails();

		Hardware hardware15 = new Hardware();
		hardware15.hardwareId = 15;
		hardware15.hardwareName = "USB Hub";
		hardware15.brand = "Anker";
		hardware15.price = 1500;
		hardware15.isInternal = false;
		Pc pc15 = new Pc();
		pc15.pcId = 15;
		pc15.pcBrand = "HP";
		pc15.processor = "AMD Ryzen 3";
		pc15.ram = 4;
		pc15.price = 35000;
		pc15.hardware = hardware15;
		pc15.getPcDetails();

		Hardware hardware16 = new Hardware();
		hardware16.hardwareId = 16;
		hardware16.hardwareName = "Graphics Tablet";
		hardware16.brand = "Wacom";
		hardware16.price = 15000;
		hardware16.isInternal = false;
		Pc pc16 = new Pc();
		pc16.pcId = 16;
		pc16.pcBrand = "Dell";
		pc16.processor = "Intel i7";
		pc16.ram = 16;
		pc16.price = 95000;
		pc16.hardware = hardware16;
		pc16.getPcDetails();

		Hardware hardware17 = new Hardware();
		hardware17.hardwareId = 17;
		hardware17.hardwareName = "Capture Card";
		hardware17.brand = "Elgato";
		hardware17.price = 12000;
		hardware17.isInternal = false;
		Pc pc17 = new Pc();
		pc17.pcId = 17;
		pc17.pcBrand = "Asus";
		pc17.processor = "AMD Ryzen 7";
		pc17.ram = 32;
		pc17.price = 120000;
		pc17.hardware = hardware17;
		pc17.getPcDetails();

		Hardware hardware18 = new Hardware();
		hardware18.hardwareId = 18;
		hardware18.hardwareName = "Liquid Cooling System";
		hardware18.brand = "NZXT";
		hardware18.price = 9000;
		hardware18.isInternal = true;
		Pc pc18 = new Pc();
		pc18.pcId = 18;
		pc18.pcBrand = "Gigabyte";
		pc18.processor = "Intel i9";
		pc18.ram = 64;
		pc18.price = 220000;
		pc18.hardware = hardware18;
		pc18.getPcDetails();

		Hardware hardware19 = new Hardware();
		hardware19.hardwareId = 19;
		hardware19.hardwareName = "External SSD";
		hardware19.brand = "WD";
		hardware19.price = 7500;
		hardware19.isInternal = false;
		Pc pc19 = new Pc();
		pc19.pcId = 19;
		pc19.pcBrand = "Lenovo";
		pc19.processor = "Intel i5";
		pc19.ram = 8;
		pc19.price = 70000;
		pc19.hardware = hardware19;
		pc19.getPcDetails();

		Hardware hardware20 = new Hardware();
		hardware20.hardwareId = 20;
		hardware20.hardwareName = "VR Headset";
		hardware20.brand = "Meta";
		hardware20.price = 40000;
		hardware20.isInternal = false;
		Pc pc20 = new Pc();
		pc20.pcId = 20;
		pc20.pcBrand = "Acer";
		pc20.processor = "AMD Ryzen 9";
		pc20.ram = 32;
		pc20.price = 160000;
		pc20.hardware = hardware20;
		pc20.getPcDetails(); */
		

		Hardware hardware1 = new Hardware(1, "GPU", "NVIDIA", 35000.0, true);
		Pc pc1 = new Pc(1, "Dell", "Intel i7", 16, 90000.0, hardware1);
		pc1.getPcDetails();

		Hardware hardware2 = new Hardware(2, "CPU Cooler", "Cooler Master", 4500.0, true);
		Pc pc2 = new Pc(2, "HP", "AMD Ryzen 5", 8, 55000.0, hardware2);
		pc2.getPcDetails();

		Hardware hardware3 = new Hardware(3, "SSD", "Samsung", 8000.0, true);
		Pc pc3 = new Pc(3, "Lenovo", "Intel i5", 16, 75000.0, hardware3);
		pc3.getPcDetails();

		Hardware hardware4 = new Hardware(4, "Motherboard", "ASUS", 12000.0, true);
		Pc pc4 = new Pc(4, "Asus", "Intel i9", 32, 150000.0, hardware4);
		pc4.getPcDetails();

		Hardware hardware5 = new Hardware(5, "RAM", "Corsair", 5500.0, true);
		Pc pc5 = new Pc(5, "Acer", "AMD Ryzen 7", 32, 95000.0, hardware5);
		pc5.getPcDetails();

		Hardware hardware6 = new Hardware(6, "Mechanical Keyboard", "Logitech", 6000.0, false);
		Pc pc6 = new Pc(6, "Apple", "Apple M2", 16, 130000.0, hardware6);
		pc6.getPcDetails();

		Hardware hardware7 = new Hardware(7, "Gaming Mouse", "Razer", 3500.0, false);
		Pc pc7 = new Pc(7, "MSI", "Intel i7", 16, 110000.0, hardware7);
		pc7.getPcDetails();

		Hardware hardware8 = new Hardware(8, "Power Supply Unit", "Seasonic", 7000.0, true);
		Pc pc8 = new Pc(8, "Gigabyte", "AMD Ryzen 9", 64, 180000.0, hardware8);
		pc8.getPcDetails();

		Hardware hardware9 = new Hardware(9, "Monitor", "LG", 18000.0, false);
		Pc pc9 = new Pc(9, "Dell", "Intel i5", 8, 65000.0, hardware9);
		pc9.getPcDetails();

		Hardware hardware10 = new Hardware(10, "Webcam", "Logitech", 4000.0, false);
		Pc pc10 = new Pc(10, "HP", "Intel i3", 8, 40000.0, hardware10);
		pc10.getPcDetails();

		Hardware hardware11 = new Hardware(11, "Sound Card", "Creative", 5000.0, true);
		Pc pc11 = new Pc(11, "Lenovo", "Intel i7", 16, 85000.0, hardware11);
		pc11.getPcDetails();

		Hardware hardware12 = new Hardware(12, "Network Card", "TP-Link", 2500.0, true);
		Pc pc12 = new Pc(12, "Acer", "AMD Ryzen 5", 16, 60000.0, hardware12);
		pc12.getPcDetails();

		Hardware hardware13 = new Hardware(13, "HDD", "Seagate", 3500.0, true);
		Pc pc13 = new Pc(13, "Apple", "Apple M3", 24, 175000.0, hardware13);
		pc13.getPcDetails();

		Hardware hardware14 = new Hardware(14, "Blu-ray Drive", "LG", 6000.0, true);
		Pc pc14 = new Pc(14, "MSI", "Intel i9", 32, 200000.0, hardware14);
		pc14.getPcDetails();

		Hardware hardware15 = new Hardware(15, "USB Hub", "Anker", 1500.0, false);
		Pc pc15 = new Pc(15, "HP", "AMD Ryzen 3", 4, 35000.0, hardware15);
		pc15.getPcDetails();

		Hardware hardware16 = new Hardware(16, "Graphics Tablet", "Wacom", 15000.0, false);
		Pc pc16 = new Pc(16, "Dell", "Intel i7", 16, 95000.0, hardware16);
		pc16.getPcDetails();

		Hardware hardware17 = new Hardware(17, "Capture Card", "Elgato", 12000.0, false);
		Pc pc17 = new Pc(17, "Asus", "AMD Ryzen 7", 32, 120000.0, hardware17);
		pc17.getPcDetails();

		Hardware hardware18 = new Hardware(18, "Liquid Cooling System", "NZXT", 9000.0, true);
		Pc pc18 = new Pc(18, "Gigabyte", "Intel i9", 64, 220000.0, hardware18);
		pc18.getPcDetails();

		Hardware hardware19 = new Hardware(19, "External SSD", "WD", 7500.0, false);
		Pc pc19 = new Pc(19, "Lenovo", "Intel i5", 8, 70000.0, hardware19);
		pc19.getPcDetails();

		Hardware hardware20 = new Hardware(20, "VR Headset", "Meta", 40000.0, false);
		Pc pc20 = new Pc(20, "Acer", "AMD Ryzen 9", 32, 160000.0, hardware20);
		pc20.getPcDetails();


	}
}