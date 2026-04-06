public class Goa {
    public String beachNames[] = new String[19];
    int index;
    public boolean addBeachName(String beachName) {
        boolean isAdded = false;
        if (index < beachNames.length) {
            if (beachName != null && !beachName.isEmpty()) {
                beachNames[index++] = beachName;
                isAdded = true;
            } else System.out.println(beachName + " is invalid");
        } else
            System.out.println("beachNames index is full");
        return isAdded;
    }
    public void getBeachDetails() {
        System.out.println("The beaches are : \n");
        for (String item : beachNames)
            if (item != null) System.out.println(item);
    }
    public String getBeachByIndex(int index) {
        String beachName = null;
        if (index < beachNames.length)
            beachName = beachNames[index];
        else
            System.out.println("Invalid index value: " + index);
        return beachName;
    }
    public int getIndexByBeach(String beachName) {
        int index = 0;
        if (beachName != null) {
            for (String item : beachNames) {
                if (item != null && item.equals(beachName)) {
                    return index;
                }
                index++;
            }
        } else System.out.println("beach name not found: " + beachName);
        return index;
    }
    public boolean updateBeach(String existingName, String updateName) {
        boolean isUpdated = false;
        int index = 0;
        if (updateName != null && !updateName.isEmpty()) {
            for (String name : beachNames) {
                if (existingName.equals(name)) {
                    beachNames[index] = updateName;
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
    public boolean deleteBeach(String deleteName) {
        boolean isDeleted = false;
        int index = 0;
        if (deleteName != null && !deleteName.isEmpty()) {
            for (String name : beachNames) {
                if (deleteName.equals(name)) {
                    beachNames[index] = null;
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