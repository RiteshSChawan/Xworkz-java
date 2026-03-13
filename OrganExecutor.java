class OrganExecutor {

    public static void main(String[] args) {

        Organ o1 = new Organ(1,"Heart","Cardiovascular","Chest",0.31,12.0,true,"Pumps Blood","Human",true,"Coronary");
        o1.getDetails();

        Organ o2 = new Organ(2,"Lungs","Respiratory","Chest",1.0,20.0,true,"Gas Exchange","Human",true,"Pulmonary");
        o2.getDetails();

        Organ o3 = new Organ(3,"Liver","Digestive","Abdomen",1.5,25.0,true,"Detoxification","Human",true,"Hepatic");
        o3.getDetails();

        Organ o4 = new Organ(4,"Kidney","Excretory","Abdomen",0.15,10.0,true,"Filter Blood","Human",true,"Renal");
        o4.getDetails();

        Organ o5 = new Organ(5,"Brain","Nervous","Head",1.4,15.0,true,"Control Body","Human",true,"Neural");
        o5.getDetails();

        Organ o6 = new Organ(6,"Stomach","Digestive","Abdomen",0.5,18.0,true,"Digest Food","Human",true,"Gastric");
        o6.getDetails();

        Organ o7 = new Organ(7,"Pancreas","Digestive","Abdomen",0.09,9.0,true,"Produce Insulin","Human",true,"Endocrine");
        o7.getDetails();

        Organ o8 = new Organ(8,"Spleen","Immune","Abdomen",0.2,11.0,true,"Filter Blood","Human",true,"Immune");
        o8.getDetails();

        Organ o9 = new Organ(9,"Skin","Integumentary","Body",3.5,30.0,true,"Protection","Human",true,"Dermal");
        o9.getDetails();

        Organ o10 = new Organ(10,"Intestine","Digestive","Abdomen",2.0,28.0,true,"Absorb Nutrients","Human",true,"Digestive");
        o10.getDetails();
    }
}