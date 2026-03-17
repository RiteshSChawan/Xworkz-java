class FactoryExecutor {
	public static void main(String[] args) {
/*
		Machine machine1 = new Machine();
		machine1.machineId = 1;
		machine1.machineName = "CNC Lathe";
		machine1.type = "Metal Cutting";
		machine1.powerConsumption = 15.5;
		machine1.isAutomated = true;
		Factory factory1 = new Factory();
		factory1.factoryId = 1;
		factory1.factoryName = "Tata Steel Plant";
		factory1.location = "Jamshedpur";
		factory1.workers = 500;
		factory1.productionCapacity = 10000.0;
		factory1.machine = machine1;
		factory1.getFactoryDetails();

		Machine machine2 = new Machine();
		machine2.machineId = 2;
		machine2.machineName = "Hydraulic Press";
		machine2.type = "Metal Forming";
		machine2.powerConsumption = 22.0;
		machine2.isAutomated = false;
		Factory factory2 = new Factory();
		factory2.factoryId = 2;
		factory2.factoryName = "Mahindra Auto Plant";
		factory2.location = "Pune";
		factory2.workers = 800;
		factory2.productionCapacity = 5000.0;
		factory2.machine = machine2;
		factory2.getFactoryDetails();

		Machine machine3 = new Machine();
		machine3.machineId = 3;
		machine3.machineName = "Injection Moulding";
		machine3.type = "Plastic Forming";
		machine3.powerConsumption = 18.0;
		machine3.isAutomated = true;
		Factory factory3 = new Factory();
		factory3.factoryId = 3;
		factory3.factoryName = "Reliance Polymer Plant";
		factory3.location = "Hazira";
		factory3.workers = 350;
		factory3.productionCapacity = 8000.0;
		factory3.machine = machine3;
		factory3.getFactoryDetails();

		Machine machine4 = new Machine();
		machine4.machineId = 4;
		machine4.machineName = "Robotic Welder";
		machine4.type = "Welding";
		machine4.powerConsumption = 30.0;
		machine4.isAutomated = true;
		Factory factory4 = new Factory();
		factory4.factoryId = 4;
		factory4.factoryName = "Maruti Suzuki Plant";
		factory4.location = "Manesar";
		factory4.workers = 1200;
		factory4.productionCapacity = 15000.0;
		factory4.machine = machine4;
		factory4.getFactoryDetails();

		Machine machine5 = new Machine();
		machine5.machineId = 5;
		machine5.machineName = "Conveyor Belt";
		machine5.type = "Material Handling";
		machine5.powerConsumption = 8.5;
		machine5.isAutomated = true;
		Factory factory5 = new Factory();
		factory5.factoryId = 5;
		factory5.factoryName = "Nestle Food Factory";
		factory5.location = "Moga";
		factory5.workers = 400;
		factory5.productionCapacity = 20000.0;
		factory5.machine = machine5;
		factory5.getFactoryDetails();

		Machine machine6 = new Machine();
		machine6.machineId = 6;
		machine6.machineName = "Textile Loom";
		machine6.type = "Weaving";
		machine6.powerConsumption = 5.0;
		machine6.isAutomated = false;
		Factory factory6 = new Factory();
		factory6.factoryId = 6;
		factory6.factoryName = "Raymond Textile Mill";
		factory6.location = "Thane";
		factory6.workers = 650;
		factory6.productionCapacity = 12000.0;
		factory6.machine = machine6;
		factory6.getFactoryDetails();

		Machine machine7 = new Machine();
		machine7.machineId = 7;
		machine7.machineName = "PCB Soldering Robot";
		machine7.type = "Electronics Assembly";
		machine7.powerConsumption = 12.0;
		machine7.isAutomated = true;
		Factory factory7 = new Factory();
		factory7.factoryId = 7;
		factory7.factoryName = "Samsung Electronics Plant";
		factory7.location = "Noida";
		factory7.workers = 900;
		factory7.productionCapacity = 30000.0;
		factory7.machine = machine7;
		factory7.getFactoryDetails();

		Machine machine8 = new Machine();
		machine8.machineId = 8;
		machine8.machineName = "Bottling Line";
		machine8.type = "Packaging";
		machine8.powerConsumption = 10.0;
		machine8.isAutomated = true;
		Factory factory8 = new Factory();
		factory8.factoryId = 8;
		factory8.factoryName = "Coca Cola Bottling Plant";
		factory8.location = "Bangalore";
		factory8.workers = 300;
		factory8.productionCapacity = 50000.0;
		factory8.machine = machine8;
		factory8.getFactoryDetails();

		Machine machine9 = new Machine();
		machine9.machineId = 9;
		machine9.machineName = "Ball Mill";
		machine9.type = "Grinding";
		machine9.powerConsumption = 40.0;
		machine9.isAutomated = false;
		Factory factory9 = new Factory();
		factory9.factoryId = 9;
		factory9.factoryName = "UltraTech Cement Plant";
		factory9.location = "Rajasthan";
		factory9.workers = 700;
		factory9.productionCapacity = 25000.0;
		factory9.machine = machine9;
		factory9.getFactoryDetails();

		Machine machine10 = new Machine();
		machine10.machineId = 10;
		machine10.machineName = "3D Printer";
		machine10.type = "Additive Manufacturing";
		machine10.powerConsumption = 3.5;
		machine10.isAutomated = true;
		Factory factory10 = new Factory();
		factory10.factoryId = 10;
		factory10.factoryName = "SpaceX Parts Factory";
		factory10.location = "Hawthorne, CA";
		factory10.workers = 200;
		factory10.productionCapacity = 500.0;
		factory10.machine = machine10;
		factory10.getFactoryDetails();

		Machine machine11 = new Machine();
		machine11.machineId = 11;
		machine11.machineName = "Laser Cutter";
		machine11.type = "Precision Cutting";
		machine11.powerConsumption = 20.0;
		machine11.isAutomated = true;
		Factory factory11 = new Factory();
		factory11.factoryId = 11;
		factory11.factoryName = "BHEL Turbine Plant";
		factory11.location = "Haridwar";
		factory11.workers = 1500;
		factory11.productionCapacity = 300.0;
		factory11.machine = machine11;
		factory11.getFactoryDetails();

		Machine machine12 = new Machine();
		machine12.machineId = 12;
		machine12.machineName = "Extrusion Machine";
		machine12.type = "Plastic Extrusion";
		machine12.powerConsumption = 25.0;
		machine12.isAutomated = false;
		Factory factory12 = new Factory();
		factory12.factoryId = 12;
		factory12.factoryName = "Pidilite Chemical Plant";
		factory12.location = "Vapi";
		factory12.workers = 420;
		factory12.productionCapacity = 18000.0;
		factory12.machine = machine12;
		factory12.getFactoryDetails();

		Machine machine13 = new Machine();
		machine13.machineId = 13;
		machine13.machineName = "Die Casting Machine";
		machine13.type = "Metal Casting";
		machine13.powerConsumption = 35.0;
		machine13.isAutomated = true;
		Factory factory13 = new Factory();
		factory13.factoryId = 13;
		factory13.factoryName = "Hero MotoCorp Plant";
		factory13.location = "Dharuhera";
		factory13.workers = 1100;
		factory13.productionCapacity = 40000.0;
		factory13.machine = machine13;
		factory13.getFactoryDetails();

		Machine machine14 = new Machine();
		machine14.machineId = 14;
		machine14.machineName = "Freeze Dryer";
		machine14.type = "Food Processing";
		machine14.powerConsumption = 14.0;
		machine14.isAutomated = true;
		Factory factory14 = new Factory();
		factory14.factoryId = 14;
		factory14.factoryName = "Amul Dairy Plant";
		factory14.location = "Anand";
		factory14.workers = 600;
		factory14.productionCapacity = 60000.0;
		factory14.machine = machine14;
		factory14.getFactoryDetails();

		Machine machine15 = new Machine();
		machine15.machineId = 15;
		machine15.machineName = "Turbine Generator";
		machine15.type = "Power Generation";
		machine15.powerConsumption = 500.0;
		machine15.isAutomated = true;
		Factory factory15 = new Factory();
		factory15.factoryId = 15;
		factory15.factoryName = "NTPC Power Plant";
		factory15.location = "Korba";
		factory15.workers = 2000;
		factory15.productionCapacity = 100000.0;
		factory15.machine = machine15;
		factory15.getFactoryDetails();

		Machine machine16 = new Machine();
		machine16.machineId = 16;
		machine16.machineName = "Rotary Kiln";
		machine16.type = "Calcination";
		machine16.powerConsumption = 80.0;
		machine16.isAutomated = false;
		Factory factory16 = new Factory();
		factory16.factoryId = 16;
		factory16.factoryName = "ACC Cement Plant";
		factory16.location = "Wadi";
		factory16.workers = 550;
		factory16.productionCapacity = 22000.0;
		factory16.machine = machine16;
		factory16.getFactoryDetails();

		Machine machine17 = new Machine();
		machine17.machineId = 17;
		machine17.machineName = "Blow Moulding";
		machine17.type = "Plastic Bottle Making";
		machine17.powerConsumption = 16.0;
		machine17.isAutomated = true;
		Factory factory17 = new Factory();
		factory17.factoryId = 17;
		factory17.factoryName = "Bisleri Water Plant";
		factory17.location = "Mumbai";
		factory17.workers = 280;
		factory17.productionCapacity = 80000.0;
		factory17.machine = machine17;
		factory17.getFactoryDetails();

		Machine machine18 = new Machine();
		machine18.machineId = 18;
		machine18.machineName = "SMT Machine";
		machine18.type = "PCB Assembly";
		machine18.powerConsumption = 9.0;
		machine18.isAutomated = true;
		Factory factory18 = new Factory();
		factory18.factoryId = 18;
		factory18.factoryName = "Foxconn India Plant";
		factory18.location = "Chennai";
		factory18.workers = 1800;
		factory18.productionCapacity = 200000.0;
		factory18.machine = machine18;
		factory18.getFactoryDetails();

		Machine machine19 = new Machine();
		machine19.machineId = 19;
		machine19.machineName = "Autoclave";
		machine19.type = "Sterilization";
		machine19.powerConsumption = 7.5;
		machine19.isAutomated = true;
		Factory factory19 = new Factory();
		factory19.factoryId = 19;
		factory19.factoryName = "Cipla Pharma Plant";
		factory19.location = "Goa";
		factory19.workers = 450;
		factory19.productionCapacity = 5000.0;
		factory19.machine = machine19;
		factory19.getFactoryDetails();

		Machine machine20 = new Machine();
		machine20.machineId = 20;
		machine20.machineName = "Wind Turbine";
		machine20.type = "Renewable Energy";
		machine20.powerConsumption = 0.0;
		machine20.isAutomated = true;
		Factory factory20 = new Factory();
		factory20.factoryId = 20;
		factory20.factoryName = "Suzlon Wind Farm";
		factory20.location = "Rajkot";
		factory20.workers = 150;
		factory20.productionCapacity = 75000.0;
		factory20.machine = machine20;
		factory20.getFactoryDetails(); */


		Machine machine1 = new Machine(1, "CNC Lathe", "Metal Cutting", 15.5, true);
		Factory factory1 = new Factory(1, "Tata Steel Plant", "Jamshedpur", 500, 10000.0, machine1);
		factory1.getFactoryDetails();

		Machine machine2 = new Machine(2, "Hydraulic Press", "Metal Forming", 22.0, false);
		Factory factory2 = new Factory(2, "Mahindra Auto Plant", "Pune", 800, 5000.0, machine2);
		factory2.getFactoryDetails();

		Machine machine3 = new Machine(3, "Injection Moulding", "Plastic Forming", 18.0, true);
		Factory factory3 = new Factory(3, "Reliance Polymer Plant", "Hazira", 350, 8000.0, machine3);
		factory3.getFactoryDetails();

		Machine machine4 = new Machine(4, "Robotic Welder", "Welding", 30.0, true);
		Factory factory4 = new Factory(4, "Maruti Suzuki Plant", "Manesar", 1200, 15000.0, machine4);
		factory4.getFactoryDetails();

		Machine machine5 = new Machine(5, "Conveyor Belt", "Material Handling", 8.5, true);
		Factory factory5 = new Factory(5, "Nestle Food Factory", "Moga", 400, 20000.0, machine5);
		factory5.getFactoryDetails();

		Machine machine6 = new Machine(6, "Textile Loom", "Weaving", 5.0, false);
		Factory factory6 = new Factory(6, "Raymond Textile Mill", "Thane", 650, 12000.0, machine6);
		factory6.getFactoryDetails();

		Machine machine7 = new Machine(7, "PCB Soldering Robot", "Electronics Assembly", 12.0, true);
		Factory factory7 = new Factory(7, "Samsung Electronics Plant", "Noida", 900, 30000.0, machine7);
		factory7.getFactoryDetails();

		Machine machine8 = new Machine(8, "Bottling Line", "Packaging", 10.0, true);
		Factory factory8 = new Factory(8, "Coca Cola Bottling Plant", "Bangalore", 300, 50000.0, machine8);
		factory8.getFactoryDetails();

		Machine machine9 = new Machine(9, "Ball Mill", "Grinding", 40.0, false);
		Factory factory9 = new Factory(9, "UltraTech Cement Plant", "Rajasthan", 700, 25000.0, machine9);
		factory9.getFactoryDetails();

		Machine machine10 = new Machine(10, "3D Printer", "Additive Manufacturing", 3.5, true);
		Factory factory10 = new Factory(10, "SpaceX Parts Factory", "Hawthorne CA", 200, 500.0, machine10);
		factory10.getFactoryDetails();

		Machine machine11 = new Machine(11, "Laser Cutter", "Precision Cutting", 20.0, true);
		Factory factory11 = new Factory(11, "BHEL Turbine Plant", "Haridwar", 1500, 300.0, machine11);
		factory11.getFactoryDetails();

		Machine machine12 = new Machine(12, "Extrusion Machine", "Plastic Extrusion", 25.0, false);
		Factory factory12 = new Factory(12, "Pidilite Chemical Plant", "Vapi", 420, 18000.0, machine12);
		factory12.getFactoryDetails();

		Machine machine13 = new Machine(13, "Die Casting Machine", "Metal Casting", 35.0, true);
		Factory factory13 = new Factory(13, "Hero MotoCorp Plant", "Dharuhera", 1100, 40000.0, machine13);
		factory13.getFactoryDetails();

		Machine machine14 = new Machine(14, "Freeze Dryer", "Food Processing", 14.0, true);
		Factory factory14 = new Factory(14, "Amul Dairy Plant", "Anand", 600, 60000.0, machine14);
		factory14.getFactoryDetails();

		Machine machine15 = new Machine(15, "Turbine Generator", "Power Generation", 500.0, true);
		Factory factory15 = new Factory(15, "NTPC Power Plant", "Korba", 2000, 100000.0, machine15);
		factory15.getFactoryDetails();

		Machine machine16 = new Machine(16, "Rotary Kiln", "Calcination", 80.0, false);
		Factory factory16 = new Factory(16, "ACC Cement Plant", "Wadi", 550, 22000.0, machine16);
		factory16.getFactoryDetails();

		Machine machine17 = new Machine(17, "Blow Moulding", "Plastic Bottle Making", 16.0, true);
		Factory factory17 = new Factory(17, "Bisleri Water Plant", "Mumbai", 280, 80000.0, machine17);
		factory17.getFactoryDetails();

		Machine machine18 = new Machine(18, "SMT Machine", "PCB Assembly", 9.0, true);
		Factory factory18 = new Factory(18, "Foxconn India Plant", "Chennai", 1800, 200000.0, machine18);
		factory18.getFactoryDetails();

		Machine machine19 = new Machine(19, "Autoclave", "Sterilization", 7.5, true);
		Factory factory19 = new Factory(19, "Cipla Pharma Plant", "Goa", 450, 5000.0, machine19);
		factory19.getFactoryDetails();

		Machine machine20 = new Machine(20, "Wind Turbine", "Renewable Energy", 0.0, true);
		Factory factory20 = new Factory(20, "Suzlon Wind Farm", "Rajkot", 150, 75000.0, machine20);
		factory20.getFactoryDetails();


	}
}