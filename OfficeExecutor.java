class OfficeExecutor {

    public static void main(String[] args) {

        Office office1 = new Office(1,"TechCorp Pvt Ltd","Bangalore","Karnataka",5,500,250000.0,false,true,"Available");
        office1.getDetails();

        Office office2 = new Office(2,"Innovate Systems","Hyderabad","Telangana",7,800,350000.0,true,true,"Occupied");
        office2.getDetails();

        Office office3 = new Office(3,"NextGen Solutions","Chennai","Tamil Nadu",4,420,200000.0,false,true,"Available");
        office3.getDetails();

        Office office4 = new Office(4,"FutureTech Ltd","Pune","Maharashtra",6,600,300000.0,true,true,"Maintenance");
        office4.getDetails();

        Office office5 = new Office(5,"SmartSoft Pvt Ltd","Delhi","Delhi",8,900,420000.0,false,true,"Available");
        office5.getDetails();

        Office office6 = new Office(6,"DigitalWave","Mumbai","Maharashtra",9,1200,600000.0,true,true,"Occupied");
        office6.getDetails();

        Office office7 = new Office(7,"CodeWorks","Kolkata","West Bengal",3,300,150000.0,false,true,"Available");
        office7.getDetails();

        Office office8 = new Office(8,"CloudEdge","Ahmedabad","Gujarat",6,650,310000.0,true,true,"Occupied");
        office8.getDetails();

        Office office9 = new Office(9,"LogicTech","Jaipur","Rajasthan",5,450,210000.0,false,true,"Available");
        office9.getDetails();

        Office office10 = new Office(10,"AlphaSoft","Bhopal","Madhya Pradesh",4,380,175000.0,true,true,"Occupied");
        office10.getDetails();
    }
}