public class Phonepe {
    public String insuranceNames[] = new String[27];
    int index;
    public boolean addInsuranceName(String insuranceName) {
        boolean isAdded = false;
        if (index < insuranceNames.length) {
            if (insuranceName != null && !insuranceName.isEmpty()) {
                insuranceNames[index++] = insuranceName;
                isAdded = true;
            } else System.out.println(insuranceName + " is invalid");
        } else
            System.out.println("insuranceNames index is full");
        return isAdded;
    }
    public void getInsuranceDetails() {
        System.out.println("The insurance names are : \n");
        for (String item : insuranceNames)
            if (item != null) System.out.println(item);
    }
    public String getInsuranceByIndex(int index) {
        String insuranceName = null;
        if (index < insuranceNames.length)
            insuranceName = insuranceNames[index];
        else
            System.out.println("Invalid index value: " + index);
        return insuranceName;
    }
    public int getIndexByInsurance(String insuranceName) {
        int index = 0;
        if (insuranceName != null) {
            for (String item : insuranceNames) {
                if (item != null && item.equals(insuranceName)) {
                    return index;
                }
                index++;
            }
        } else System.out.println("insurance name not found: " + insuranceName);
        return index;
    }
    public boolean updateInsurance(String existingName, String updateName) {
        boolean isUpdated = false;
        int index = 0;
        if (updateName != null && !updateName.isEmpty()) {
            for (String name : insuranceNames) {
                if (existingName.equals(name)) {
                    insuranceNames[index] = updateName;
                    isUpdated = true;
                }
                index++;
            }
            if (!isUpdated) System.out.println("The name is not found");
        } else {
            System.out.println("Invalid Input..");
        }
        return isUpdated;
    }
    public boolean deleteInsurance(String deleteName) {
        boolean isDeleted = false;
        int index = 0;
        if (deleteName != null && !deleteName.isEmpty()) {
            for (String name : insuranceNames) {
                if (deleteName.equals(name)) {
                    insuranceNames[index] = null;
                    isDeleted = true;
                }
                index++;
            }
        } else {
            System.out.println("Invalid Input..");
        }
        return isDeleted;
    }
}