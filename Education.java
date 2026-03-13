class Education {

    int educationId;
    String institutionName;
    String type;
    String city;
    String state;
    int foundedYear;
    double annualFee;
    int studentCount;
    int facultyCount;
    boolean isAccredited;
    String affiliation;
    String medium;
    boolean isResidential;
    String grade;
    int courseCount;
    String country;
    double campusArea;
    boolean isOnline;
    boolean isGovt;
    String[] courses;

    public Education(int educationId, String institutionName, String type, String city, String state, int foundedYear, double annualFee, int studentCount, int facultyCount, boolean isAccredited, String affiliation, String medium, boolean isResidential, String grade, int courseCount, String country, double campusArea, boolean isOnline, boolean isGovt, String[] courses) {
        this.educationId = educationId;
        this.institutionName = institutionName;
        this.type = type;
        this.city = city;
        this.state = state;
        this.foundedYear = foundedYear;
        this.annualFee = annualFee;
        this.studentCount = studentCount;
        this.facultyCount = facultyCount;
        this.isAccredited = isAccredited;
        this.affiliation = affiliation;
        this.medium = medium;
        this.isResidential = isResidential;
        this.grade = grade;
        this.courseCount = courseCount;
        this.country = country;
        this.campusArea = campusArea;
        this.isOnline = isOnline;
        this.isGovt = isGovt;
        this.courses = courses;
    }

    public void getDetails() {
        System.out.println("EducationId : " + this.educationId);
        System.out.println("InstitutionName : " + this.institutionName);
        System.out.println("Type : " + this.type);
        System.out.println("City : " + this.city);
        System.out.println("State : " + this.state);
        System.out.println("FoundedYear : " + this.foundedYear);
        System.out.println("AnnualFee : " + this.annualFee);
        System.out.println("StudentCount : " + this.studentCount);
        System.out.println("FacultyCount : " + this.facultyCount);
        System.out.println("IsAccredited : " + this.isAccredited);
        System.out.println("Affiliation : " + this.affiliation);
        System.out.println("Medium : " + this.medium);
        System.out.println("IsResidential : " + this.isResidential);
        System.out.println("Grade : " + this.grade);
        System.out.println("CourseCount : " + this.courseCount);
        System.out.println("Country : " + this.country);
        System.out.println("CampusArea : " + this.campusArea);
        System.out.println("IsOnline : " + this.isOnline);
        System.out.println("IsGovt : " + this.isGovt);
        System.out.println("Courses :");
        for (String item : this.courses)
            System.out.println("  " + item);
        System.out.println("----------------");
    }
}