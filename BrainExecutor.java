class BrainExecutor {

    public static void main(String[] args) {

        Brain brain1 = new Brain(1,"Human","Frontal Lobe",1.4,1260.0,86000000000L,"Left",true,120.0,"O+",25,3.5,true);
        brain1.getDetails();

        Brain brain2 = new Brain(2,"Human","Temporal Lobe",1.35,1250.0,85000000000L,"Right",true,118.0,"A+",26,3.4,true);
        brain2.getDetails();

        Brain brain3 = new Brain(3,"Human","Parietal Lobe",1.42,1275.0,87000000000L,"Left",true,121.0,"B+",27,3.6,true);
        brain3.getDetails();

        Brain brain4 = new Brain(4,"Human","Occipital Lobe",1.30,1240.0,84000000000L,"Right",true,115.0,"AB+",28,3.3,true);
        brain4.getDetails();

        Brain brain5 = new Brain(5,"Human","Cerebellum",1.33,1230.0,83000000000L,"Left",true,117.0,"O-",29,3.2,true);
        brain5.getDetails();

        Brain brain6 = new Brain(6,"Human","Brain Stem",1.31,1225.0,82000000000L,"Right",true,116.0,"A-",30,3.1,true);
        brain6.getDetails();

        Brain brain7 = new Brain(7,"Human","Frontal Cortex",1.45,1280.0,87500000000L,"Left",true,122.0,"B-",31,3.7,true);
        brain7.getDetails();

        Brain brain8 = new Brain(8,"Human","Motor Cortex",1.38,1265.0,86500000000L,"Right",true,119.0,"O+",32,3.4,true);
        brain8.getDetails();

        Brain brain9 = new Brain(9,"Human","Sensory Cortex",1.36,1255.0,85500000000L,"Left",true,118.0,"A+",33,3.5,true);
        brain9.getDetails();

        Brain brain10 = new Brain(10,"Human","Visual Cortex",1.34,1245.0,84500000000L,"Right",true,117.0,"B+",34,3.3,true);
        brain10.getDetails();
    }
}