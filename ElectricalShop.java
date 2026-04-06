public class ElectricalShop {
    public String appliances[] = new String[20];
    int index;
    public boolean addAppliance(String appliance) {
        boolean isAdded = false;
        if (index < appliances.length) {
            if (appliance != null && !appliance.isEmpty()) {
                appliances[index++] = appliance;
                isAdded = true;
            } else System.out.println(appliance + " is invalid");
        } else
            System.out.println("appliances index is full");
        return isAdded;
    }
    public void getApplianceDetails() {
        System.out.println("The appliances are : \n");
        for (String item : appliances)
            if (item != null) System.out.println(item);
    }
    public String getApplianceByIndex(int index) {
        String appliance = null;
        if (index < appliances.length)
            appliance = appliances[index];
        else
            System.out.println("Invalid index value: " + index);
        return appliance;
    }
    public int getIndexByAppliance(String appliance) {
        int index = 0;
        if (appliance != null) {
            for (String item : appliances) {
                if (item != null && item.equals(appliance)) {
                    return index;
                }
                index++;
            }
        } else System.out.println("appliance name not found: " + appliance);
        return index;
    }
    public boolean updateAppliance(String existingName, String updateName) {
        boolean isUpdated = false;
        int index = 0;
        if (updateName != null && !updateName.isEmpty()) {
            for (String name : appliances) {
                if (existingName.equals(name)) {
                    appliances[index] = updateName;
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
    public boolean deleteAppliance(String deleteName) {
        boolean isDeleted = false;
        int index = 0;
        if (deleteName != null && !deleteName.isEmpty()) {
            for (String name : appliances) {
                if (deleteName.equals(name)) {
                    appliances[index] = null;
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