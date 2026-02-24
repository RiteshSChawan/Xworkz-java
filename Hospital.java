class Hospital {

    public static String[] findDoctorsBySpecialization(String specialization) {

        System.out.println("invoked findDoctorsBySpecialization");

        if (specialization == "Cardiac Sciences") {

            String[] cardiacSciencesDoctors = {"Dr.Arun","Dr.Vikram","Dr.Rahul","Dr.Kiran","Dr.Suraj",
                    "Dr.Manish","Dr.Ajay","Dr.Karthik","Dr.Rohit","Dr.Harish",
                    "Dr.Naveen","Dr.Samir","Dr.Deepak","Dr.Sanjay","Dr.Prasad"};

            return cardiacSciencesDoctors;
			
        }

        else if (specialization == "Dental Science") {

            String[] dentalScienceDoctors = {"Dr.Ritu","Dr.Pooja","Dr.Nisha","Dr.Smita","Dr.Kavya",
                    "Dr.Abhishek","Dr.Anil","Dr.Varun","Dr.Swati","Dr.Megha",
                    "Dr.Neel","Dr.Ramesh","Dr.Sandeep","Dr.Tanvi","Dr.Yogesh"};

            return dentalScienceDoctors;
        }

        else if (specialization == "Dermatology") {

            String[] dermatologyDoctors = {"Dr.Aditi","Dr.Shruti","Dr.Priyanka","Dr.Ruchi","Dr.Ananya",
                    "Dr.Kunal","Dr.Aman","Dr.Nitin","Dr.Sahil","Dr.Rohit",
                    "Dr.Vikas","Dr.Mohan","Dr.Keshav","Dr.Hemanth","Dr.Raghav"};

            return dermatologyDoctors;
        }

        else if (specialization == "General Surgery") {

            String[] generalSurgeryDoctors = {"Dr.Sachin","Dr.Manoj","Dr.Anil","Dr.Vinod","Dr.Karthik",
                    "Dr.Naveen","Dr.Hari","Dr.Pavan","Dr.Kiran","Dr.Suraj",
                    "Dr.Ajay","Dr.Rohit","Dr.Vishal","Dr.Sandeep","Dr.Mahesh"};

            return generalSurgeryDoctors;
        }

        else if (specialization == "Orthopaedics") {

            String[] orthopaedicsDoctors = {"Dr.Ritesh","Dr.Rajesh","Dr.Manoj","Dr.Sachin","Dr.Anil",
                    "Dr.Vinod","Dr.Karthik","Dr.Naveen","Dr.Hari","Dr.Pavan",
                    "Dr.Kiran","Dr.Suraj","Dr.Ajay","Dr.Rohit","Dr.Vishal"};

            return orthopaedicsDoctors;
        }

        else if (specialization == "Neurology") {

            String[] neurologyDoctors = {"Dr.Amit","Dr.Kapil","Dr.Anurag","Dr.Suraj","Dr.Vikas",
                    "Dr.Neeraj","Dr.Samir","Dr.Raghav","Dr.Aditya","Dr.Hemant",
                    "Dr.Keshav","Dr.Lalit","Dr.Mayank","Dr.Vivek","Dr.Shiv"};

            return neurologyDoctors;
        }

else if (specialization == "Paediatrics") {

            String[] paediatricsDoctors = {"Dr.Kavitha","Dr.Sneha","Dr.Meena","Dr.Rashmi","Dr.Aparna",
                    "Dr.Swathi","Dr.Deepa","Dr.Hema","Dr.Priyanka","Dr.Anusha",
                    "Dr.Latha","Dr.Divya","Dr.Rekha","Dr.Shilpa","Dr.Madhavi"};

            return paediatricsDoctors;
        }
		else if (specialization == "Diabetology/Endocrinology") {

		String[] diabetologyDoctors = {"Dr.Shashank","Dr.Rohini","Dr.Anup","Dr.Kavitha","Dr.Madhav",
            "Dr.Sunil","Dr.Deepa","Dr.Arjun","Dr.Lavanya","Dr.Kiran",
            "Dr.Harsha","Dr.Manjunath","Dr.Priyanka","Dr.Ramesh","Dr.Vidya"};

    return diabetologyDoctors;
}

		else if (specialization == "ENT") {

		String[] entDoctors = {"Dr.Abhay","Dr.Nikhil","Dr.Satish","Dr.Ganesh","Dr.Karthika",
            "Dr.Shilpa","Dr.Rekha","Dr.Pavan","Dr.Hemanth","Dr.Anusha",
            "Dr.Sudhir","Dr.Malini","Dr.Vivek","Dr.Naveena","Dr.Raghu"};

    return entDoctors;
}

		else if (specialization == "Emergency and Trauma") {

    String[] emergencyDoctors = {"Dr.Sameer","Dr.Akshay","Dr.Hari","Dr.Prakash","Dr.Krishna",
            "Dr.Varsha","Dr.Pooja","Dr.Ranjith","Dr.Karthik","Dr.Amitha",
            "Dr.Suresh","Dr.Anand","Dr.Komal","Dr.Divakar","Dr.Sanjana"};

    return emergencyDoctors;
}

else if (specialization == "Foetal Medicine") {

    String[] foetalMedicineDoctors = {"Dr.Swetha","Dr.Lalitha","Dr.Asha","Dr.Manjula","Dr.Kavya",
            "Dr.Meghana","Dr.Anitha","Dr.Reena","Dr.Shruthi","Dr.Pavitra",
            "Dr.Nandini","Dr.Deepthi","Dr.Rajani","Dr.Harini","Dr.Sowmya"};

    return foetalMedicineDoctors;
}

else if (specialization == "Gastroenterology and Hepatobiliary Sciences") {

    String[] gastroDoctors = {"Dr.Raghuram","Dr.Avinash","Dr.Satya","Dr.Kuldeep","Dr.Mayur",
            "Dr.Karthik","Dr.Rohit","Dr.Nitin","Dr.Sameer","Dr.Pradeep",
            "Dr.Arun","Dr.Hemanth","Dr.Lokesh","Dr.Shankar","Dr.Sachin"};

    return gastroDoctors;
}

else if (specialization == "Haematology") {

    String[] haematologyDoctors = {"Dr.Venkat","Dr.Sudheer","Dr.Ravindra","Dr.Mithun","Dr.Kishore",
            "Dr.Naveen","Dr.Adarsh","Dr.Prasanna","Dr.Vikas","Dr.Rajeev",
            "Dr.Anil","Dr.Girish","Dr.Kiran","Dr.Suraj","Dr.Deepak"};

    return haematologyDoctors;
}

else if (specialization == "Infectious Diseases") {

    String[] infectiousDoctors = {"Dr.Sunanda","Dr.Mahesh","Dr.Anuradha","Dr.Shreya","Dr.Vaibhav",
            "Dr.Ritika","Dr.Sharath","Dr.Akila","Dr.Manoj","Dr.Srinivas",
            "Dr.Rupesh","Dr.Aparna","Dr.Darshan","Dr.Abhilash","Dr.Pallavi"};

    return infectiousDoctors;
}

else if (specialization == "Infertility medicine") {

    String[] infertilityDoctors = {"Dr.Nirmala","Dr.Vasudha","Dr.Ashwini","Dr.Snehal","Dr.Kalpana",
            "Dr.Manasa","Dr.Abhigna","Dr.Sandhya","Dr.Chaitra","Dr.Hemalatha",
            "Dr.Pratibha","Dr.Vidhya","Dr.Shalini","Dr.Sujatha","Dr.Revathi"};

    return infertilityDoctors;
}

else if (specialization == "Internal Medicine") {

    String[] internalMedicineDoctors = {"Dr.Ramesh","Dr.Keshav","Dr.Nitin","Dr.Rajesh","Dr.Akash",
            "Dr.Surendra","Dr.Praveen","Dr.Kiran","Dr.Hari","Dr.Sudhir",
            "Dr.Ajay","Dr.Vinay","Dr.Sameer","Dr.Mahendra","Dr.Rohit"};

    return internalMedicineDoctors;
}

else if (specialization == "Mental Health and Behavioural Sciences") {

    String[] mentalHealthDoctors = {"Dr.Shravan","Dr.Pallav","Dr.Kalpesh","Dr.Amrita","Dr.Vidya",
            "Dr.Ritu","Dr.Priyanka","Dr.Karthik","Dr.Nikhil","Dr.Sneha",
            "Dr.Arjun","Dr.Shweta","Dr.Akshay","Dr.Harsha","Dr.Abhishek"};

    return mentalHealthDoctors;
}
		else if (specialization == "Nephrology") {

    String[] nephrologyDoctors = {"Dr.Rajkumar","Dr.Sandeep","Dr.Mohan","Dr.Vishal","Dr.Krishna",
            "Dr.Naveen","Dr.Raghav","Dr.Aditya","Dr.Sunil","Dr.Pradeep",
            "Dr.Harish","Dr.Kiran","Dr.Anil","Dr.Deepak","Dr.Manish"};

    return nephrologyDoctors;
}

else if (specialization == "Neurointerventional Radiology") {

    String[] neuroInterventionalDoctors = {"Dr.Vikram","Dr.Akshay","Dr.Ritesh","Dr.Suraj","Dr.Kuldeep",
            "Dr.Nitin","Dr.Sachin","Dr.Rohit","Dr.Mahesh","Dr.Lokesh",
            "Dr.Avinash","Dr.Karthik","Dr.Samir","Dr.Prasad","Dr.Anurag"};

    return neuroInterventionalDoctors;
}

else if (specialization == "Neurosurgery") {

    String[] neurosurgeryDoctors = {"Dr.Sanjay","Dr.Hemanth","Dr.Keshav","Dr.Adarsh","Dr.Mayank",
            "Dr.Sharath","Dr.Rajeev","Dr.Praveen","Dr.Ajay","Dr.Nikhil",
            "Dr.Vivek","Dr.Sameer","Dr.Girish","Dr.Ravindra","Dr.Shiv"};

    return neurosurgeryDoctors;
}

else if (specialization == "Obstetrics and Gynaecology") {

    String[] obstetricsDoctors = {"Dr.Anitha","Dr.Lavanya","Dr.Swathi","Dr.Pavitra","Dr.Shruthi",
            "Dr.Kavya","Dr.Aparna","Dr.Meghana","Dr.Sandhya","Dr.Rekha",
            "Dr.Manjula","Dr.Nandini","Dr.Deepthi","Dr.Harini","Dr.Sowmya"};

    return obstetricsDoctors;
}

else if (specialization == "Oncology") {

    String[] oncologyDoctors = {"Dr.Raghunath","Dr.Amit","Dr.Surendra","Dr.Vikas","Dr.Neeraj",
            "Dr.Prakash","Dr.Rohit","Dr.Kapil","Dr.Sudhir","Dr.Aditya",
            "Dr.Kunal","Dr.Anurag","Dr.Sachin","Dr.Lalit","Dr.Hemant"};

    return oncologyDoctors;
}

else if (specialization == "Ophthalmology") {

    String[] ophthalmologyDoctors = {"Dr.Pooja","Dr.Ritu","Dr.Nisha","Dr.Kavitha","Dr.Meena",
            "Dr.Smita","Dr.Shilpa","Dr.Rashmi","Dr.Anusha","Dr.Latha",
            "Dr.Divya","Dr.Rekha","Dr.Madhavi","Dr.Priyanka","Dr.Sneha"};

    return ophthalmologyDoctors;
}

else if (specialization == "Organ Transplant") {

    String[] organTransplantDoctors = {"Dr.Vinod","Dr.Suresh","Dr.Rajesh","Dr.Ajay","Dr.Mahendra",
            "Dr.Naveen","Dr.Kiran","Dr.Pradeep","Dr.Anil","Dr.Satish",
            "Dr.Ramesh","Dr.Hari","Dr.Deepak","Dr.Rohit","Dr.Manoj"};

    return organTransplantDoctors;
}

else if (specialization == "Physiotherapy and Rehabilitation") {

    String[] physiotherapyDoctors = {"Dr.Kavitha","Dr.Snehal","Dr.Manasa","Dr.Chaitra","Dr.Shalini",
            "Dr.Vidya","Dr.Pratibha","Dr.Ashwini","Dr.Hemalatha","Dr.Revathi",
            "Dr.Nirmala","Dr.Sujatha","Dr.Kalpana","Dr.Sandhya","Dr.Abhigna"};

    return physiotherapyDoctors;
}

else if (specialization == "Plastic and Reconstructive Surgery") {

    String[] plasticSurgeryDoctors = {"Dr.Ranjith","Dr.Karthik","Dr.Abhay","Dr.Nikhil","Dr.Ganesh",
            "Dr.Satish","Dr.Hemanth","Dr.Varun","Dr.Pavan","Dr.Sudhir",
            "Dr.Anand","Dr.Raghu","Dr.Sameer","Dr.Prakash","Dr.Akshay"};

    return plasticSurgeryDoctors;
}

else if (specialization == "Pulmonology") {

    String[] pulmonologyDoctors = {"Dr.Sharath","Dr.Vaibhav","Dr.Manoj","Dr.Srinivas","Dr.Abhilash",
            "Dr.Pallavi","Dr.Akila","Dr.Ritika","Dr.Mahesh","Dr.Rupesh",
            "Dr.Sunanda","Dr.Darshan","Dr.Anuradha","Dr.Shreya","Dr.Sharan"};

    return pulmonologyDoctors;
}
		else if (specialization == "Radiology") {

    String[] radiologyDoctors = {"Dr.Avinash","Dr.Kiran","Dr.Samir","Dr.Rohit","Dr.Nitin",
            "Dr.Pradeep","Dr.Lokesh","Dr.Sachin","Dr.Mayur","Dr.Raghav",
            "Dr.Aditya","Dr.Sunil","Dr.Manish","Dr.Harish","Dr.Deepak"};

    return radiologyDoctors;
}

else if (specialization == "Rheumatology") {

    String[] rheumatologyDoctors = {"Dr.Kuldeep","Dr.Sharath","Dr.Vikas","Dr.Rajeev","Dr.Anurag",
            "Dr.Kapil","Dr.Hemant","Dr.Lalit","Dr.Amit","Dr.Surendra",
            "Dr.Prakash","Dr.Neeraj","Dr.Kunal","Dr.Sachin","Dr.Rohit"};

    return rheumatologyDoctors;
}

else if (specialization == "Support Specialties") {

    String[] supportSpecialtiesDoctors = {"Dr.Pooja","Dr.Ritu","Dr.Nisha","Dr.Kavitha","Dr.Meena",
            "Dr.Smita","Dr.Shilpa","Dr.Rashmi","Dr.Anusha","Dr.Latha",
            "Dr.Divya","Dr.Rekha","Dr.Madhavi","Dr.Priyanka","Dr.Sneha"};

    return supportSpecialtiesDoctors;
}

else if (specialization == "Thoracic Surgery") {

    String[] thoracicSurgeryDoctors = {"Dr.Vinod","Dr.Suresh","Dr.Rajesh","Dr.Ajay","Dr.Mahendra",
            "Dr.Naveen","Dr.Kiran","Dr.Pradeep","Dr.Anil","Dr.Satish",
            "Dr.Ramesh","Dr.Hari","Dr.Deepak","Dr.Rohit","Dr.Manoj"};

    return thoracicSurgeryDoctors;
}

else if (specialization == "Transfusion Medicine") {

    String[] transfusionMedicineDoctors = {"Dr.Sharan","Dr.Akila","Dr.Ritika","Dr.Mahesh","Dr.Rupesh",
            "Dr.Sunanda","Dr.Darshan","Dr.Anuradha","Dr.Shreya","Dr.Srinivas",
            "Dr.Vaibhav","Dr.Manoj","Dr.Abhilash","Dr.Pallavi","Dr.Sharath"};

    return transfusionMedicineDoctors;
}

else if (specialization == "Urology") {

    String[] urologyDoctors = {"Dr.Ritesh","Dr.Rajesh","Dr.Manoj","Dr.Sachin","Dr.Anil",
            "Dr.Vinod","Dr.Karthik","Dr.Naveen","Dr.Hari","Dr.Pavan",
            "Dr.Kiran","Dr.Suraj","Dr.Ajay","Dr.Rohit","Dr.Vishal"};

    return urologyDoctors;
}

else if (specialization == "Endocrine Surgery") {

    String[] endocrineSurgeryDoctors = {"Dr.Arun","Dr.Vikram","Dr.Rahul","Dr.Kiran","Dr.Suraj",
            "Dr.Manish","Dr.Ajay","Dr.Karthik","Dr.Rohit","Dr.Harish",
            "Dr.Naveen","Dr.Samir","Dr.Deepak","Dr.Sanjay","Dr.Prasad"};

    return endocrineSurgeryDoctors;
}

else if (specialization == "Vascular Surgery") {

    String[] vascularSurgeryDoctors = {"Dr.Sameer","Dr.Akshay","Dr.Hari","Dr.Prakash","Dr.Krishna",
            "Dr.Varsha","Dr.Pooja","Dr.Ranjith","Dr.Karthik","Dr.Amitha",
            "Dr.Suresh","Dr.Anand","Dr.Komal","Dr.Divakar","Dr.Sanjana"};

    return vascularSurgeryDoctors;
}

else if (specialization == "Liver Transplant and Hepatobiliary Sciences") {

    String[] liverTransplantDoctors = {"Dr.Raghuram","Dr.Avinash","Dr.Satya","Dr.Kuldeep","Dr.Mayur",
            "Dr.Karthik","Dr.Rohit","Dr.Nitin","Dr.Sameer","Dr.Pradeep",
            "Dr.Arun","Dr.Hemanth","Dr.Lokesh","Dr.Shankar","Dr.Sachin"};

    return liverTransplantDoctors;
}

else if (specialization == "Palliative Medicine") {

    String[] palliativeMedicineDoctors = {"Dr.Swetha","Dr.Lalitha","Dr.Asha","Dr.Manjula","Dr.Kavya",
            "Dr.Meghana","Dr.Anitha","Dr.Reena","Dr.Shruthi","Dr.Pavitra",
            "Dr.Nandini","Dr.Deepthi","Dr.Rajani","Dr.Harini","Dr.Sowmya"};

    return palliativeMedicineDoctors;
}

else if (specialization == "Medical Genetics") {

    String[] medicalGeneticsDoctors = {"Dr.Shashank","Dr.Rohini","Dr.Anup","Dr.Kavitha","Dr.Madhav",
            "Dr.Sunil","Dr.Deepa","Dr.Arjun","Dr.Lavanya","Dr.Kiran",
            "Dr.Harsha","Dr.Manjunath","Dr.Priyanka","Dr.Ramesh","Dr.Vidya"};

    return medicalGeneticsDoctors;
}

else if (specialization == "Pain and Palliative Medicine") {

    String[] painPalliativeDoctors = {"Dr.Nirmala","Dr.Vasudha","Dr.Ashwini","Dr.Snehal","Dr.Kalpana",
            "Dr.Manasa","Dr.Abhigna","Dr.Sandhya","Dr.Chaitra","Dr.Hemalatha",
            "Dr.Pratibha","Dr.Vidhya","Dr.Shalini","Dr.Sujatha","Dr.Revathi"};

    return painPalliativeDoctors;
}

else if (specialization == "Geriatric Medicine") {

    String[] geriatricMedicineDoctors = {"Dr.Ramesh","Dr.Keshav","Dr.Nitin","Dr.Rajesh","Dr.Akash",
            "Dr.Surendra","Dr.Praveen","Dr.Kiran","Dr.Hari","Dr.Sudhir",
            "Dr.Ajay","Dr.Vinay","Dr.Sameer","Dr.Mahendra","Dr.Rohit"};

    return geriatricMedicineDoctors;
}

else if (specialization == "Critical Care") {

    String[] criticalCareDoctors = {"Dr.Shravan","Dr.Pallav","Dr.Kalpesh","Dr.Amrita","Dr.Vidya",
            "Dr.Ritu","Dr.Priyanka","Dr.Karthik","Dr.Nikhil","Dr.Sneha",
            "Dr.Arjun","Dr.Shweta","Dr.Akshay","Dr.Harsha","Dr.Abhishek"};

    
    return criticalCareDoctors;
}

else if (specialization == "Nuclear Medicine") {

    String[] nuclearMedicineDoctors = {"Dr.Venkat","Dr.Sudheer","Dr.Ravindra","Dr.Mithun","Dr.Kishore",
            "Dr.Naveen","Dr.Adarsh","Dr.Prasanna","Dr.Vikas","Dr.Rajeev",
            "Dr.Anil","Dr.Girish","Dr.Kiran","Dr.Suraj","Dr.Deepak"};

    return nuclearMedicineDoctors;
}


        return null;
    }

    public static void getDoctors(String[] doctors) {

        System.out.println("Fetching doctors..");
            for (String doctor : doctors) {
                System.out.println(doctor);
            }
        System.out.println("Above are doctors list");
		System.out.println("end of findDoctorsBySpecialization");
    }
}
