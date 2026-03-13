class Office {

    int officeId;
    String companyName;
    String city;
    String state;
    int floorCount;
    int employeeCapacity;
    double rentPerMonth;
    boolean isOwned;
    boolean isSmartOffice;
    String parkingFacility;
    String internetSpeed;
    boolean is24x7;
    String openingTime;
    String closingTime;
    int meetingRooms;
    String country;
    double areaSqFt;
    String buildingType;
    boolean isEcoFriendly;
    String[] facilities;

    public Office(int officeId, String companyName, String city, String state, int floorCount, int employeeCapacity, double rentPerMonth, boolean isOwned, boolean isSmartOffice, String parkingFacility, String internetSpeed, boolean is24x7, String openingTime, String closingTime, int meetingRooms, String country, double areaSqFt, String buildingType, boolean isEcoFriendly, String[] facilities) {
        this.officeId = officeId;
        this.companyName = companyName;
        this.city = city;
        this.state = state;
        this.floorCount = floorCount;
        this.employeeCapacity = employeeCapacity;
        this.rentPerMonth = rentPerMonth;
        this.isOwned = isOwned;
        this.isSmartOffice = isSmartOffice;
        this.parkingFacility = parkingFacility;
        this.internetSpeed = internetSpeed;
        this.is24x7 = is24x7;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.meetingRooms = meetingRooms;
        this.country = country;
        this.areaSqFt = areaSqFt;
        this.buildingType = buildingType;
        this.isEcoFriendly = isEcoFriendly;
        this.facilities = facilities;
    }

    public void getDetails() {
        System.out.println("OfficeId : " + this.officeId);
        System.out.println("CompanyName : " + this.companyName);
        System.out.println("City : " + this.city);
        System.out.println("State : " + this.state);
        System.out.println("FloorCount : " + this.floorCount);
        System.out.println("EmployeeCapacity : " + this.employeeCapacity);
        System.out.println("RentPerMonth : " + this.rentPerMonth);
        System.out.println("IsOwned : " + this.isOwned);
        System.out.println("IsSmartOffice : " + this.isSmartOffice);
        System.out.println("ParkingFacility : " + this.parkingFacility);
        System.out.println("InternetSpeed : " + this.internetSpeed);
        System.out.println("Is24x7 : " + this.is24x7);
        System.out.println("OpeningTime : " + this.openingTime);
        System.out.println("ClosingTime : " + this.closingTime);
        System.out.println("MeetingRooms : " + this.meetingRooms);
        System.out.println("Country : " + this.country);
        System.out.println("AreaSqFt : " + this.areaSqFt);
        System.out.println("BuildingType : " + this.buildingType);
        System.out.println("IsEcoFriendly : " + this.isEcoFriendly);
        System.out.println("Facilities :");
        for (String item : this.facilities)
            System.out.println("  " + item);
        System.out.println("----------------");
    }
}