class ToxicExecutor {

    public static void main(String[] args) {

        Toxic toxic1 = new Toxic(1,"Carbon Monoxide","CO","Gas",0.001,"Colorless","Gas",28.01,true,false,"Extreme","Fatal");
        toxic1.getDetails();

        Toxic toxic2 = new Toxic(2,"Sulfur Dioxide","SO2","Gas",0.002,"Colorless","Gas",64.06,true,false,"High","Harmful");
        toxic2.getDetails();

        Toxic toxic3 = new Toxic(3,"Nitrogen Dioxide","NO2","Gas",0.003,"Brown","Gas",46.00,true,false,"High","Toxic");
        toxic3.getDetails();

        Toxic toxic4 = new Toxic(4,"Hydrogen Sulfide","H2S","Gas",0.004,"Colorless","Gas",34.08,true,false,"Extreme","Deadly");
        toxic4.getDetails();

        Toxic toxic5 = new Toxic(5,"Chlorine","Cl2","Gas",0.005,"Greenish","Gas",70.90,true,false,"Extreme","Poisonous");
        toxic5.getDetails();

        Toxic toxic6 = new Toxic(6,"Ammonia","NH3","Gas",0.006,"Colorless","Gas",17.03,true,false,"Medium","Irritant");
        toxic6.getDetails();

        Toxic toxic7 = new Toxic(7,"Methane","CH4","Gas",0.007,"Colorless","Gas",16.04,false,true,"Low","Flammable");
        toxic7.getDetails();

        Toxic toxic8 = new Toxic(8,"Carbon Dioxide","CO2","Gas",0.008,"Colorless","Gas",44.01,false,true,"Low","Suffocation");
        toxic8.getDetails();

        Toxic toxic9 = new Toxic(9,"Ozone","O3","Gas",0.009,"Blue","Gas",48.00,true,false,"High","Harmful");
        toxic9.getDetails();

        Toxic toxic10 = new Toxic(10,"Formaldehyde","CH2O","Gas",0.010,"Colorless","Gas",30.03,true,false,"High","Toxic");
        toxic10.getDetails();

    }
}