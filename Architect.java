public class Architect {
    public String interiorDesignNames[] = new String[11];
    int index;
    public boolean addInteriorDesignName(String interiorDesignName) {
        boolean isAdded = false;
        if (index < interiorDesignNames.length) {
            if (interiorDesignName != null && !interiorDesignName.isEmpty()) {
                interiorDesignNames[index++] = interiorDesignName;
                isAdded = true;
            } else System.out.println(interiorDesignName + " is invalid");
        } else
            System.out.println("interiorDesignNames index is full");
        return isAdded;
    }
    public void getInteriorDesignDetails() {
        System.out.println("The interior design names are : \n");
        for (String item : interiorDesignNames)
            if (item != null) System.out.println(item);
    }
    public String getInteriorDesignByIndex(int index) {
        String interiorDesignName = null;
        if (index < interiorDesignNames.length)
            interiorDesignName = interiorDesignNames[index];
        else
            System.out.println("Invalid index value: " + index);
        return interiorDesignName;
    }
    public int getIndexByInteriorDesign(String interiorDesignName) {
        int index = 0;
        if (interiorDesignName != null) {
            for (String item : interiorDesignNames) {
                if (item != null && item.equals(interiorDesignName)) {
                    return index;
                }
                index++;
            }
        } else System.out.println("interior design name not found: " + interiorDesignName);
        return index;
    }
    public boolean updateInteriorDesign(String existingName, String updateName) {
        boolean isUpdated = false;
        int index = 0;
        if (updateName != null && !updateName.isEmpty()) {
            for (String name : interiorDesignNames) {
                if (existingName.equals(name)) {
                    interiorDesignNames[index] = updateName;
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
    public boolean deleteInteriorDesign(String deleteName) {
        boolean isDeleted = false;
        int index = 0;
        if (deleteName != null && !deleteName.isEmpty()) {
            for (String name : interiorDesignNames) {
                if (deleteName.equals(name)) {
                    interiorDesignNames[index] = null;
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