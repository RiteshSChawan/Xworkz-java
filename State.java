public class State {
    public String highwayNames[] = new String[9];
    int index;
    public boolean addHighwayName(String highwayName) {
        boolean isAdded = false;
        if (index < highwayNames.length) {
            if (highwayName != null && !highwayName.isEmpty()) {
                highwayNames[index++] = highwayName;
                isAdded = true;
            } else System.out.println(highwayName + " is invalid");
        } else
            System.out.println("highwayNames index is full");
        return isAdded;
    }
    public void getHighwayDetails() {
        System.out.println("The highways are : \n");
        for (String item : highwayNames)
            if (item != null) System.out.println(item);
    }
    public String getHighwayByIndex(int index) {
        String highwayName = null;
        if (index < highwayNames.length)
            highwayName = highwayNames[index];
        else
            System.out.println("Invalid index value: " + index);
        return highwayName;
    }
    public int getIndexByHighway(String highwayName) {
        int index = 0;
        if (highwayName != null) {
            for (String item : highwayNames) {
                if (item != null && item.equals(highwayName)) {
                    return index;
                }
                index++;
            }
        } else System.out.println("highway name not found: " + highwayName);
        return index;
    }
    public boolean updateHighway(String existingName, String updateName) {
        boolean isUpdated = false;
        int index = 0;
        if (updateName != null && !updateName.isEmpty()) {
            for (String name : highwayNames) {
                if (existingName.equals(name)) {
                    highwayNames[index] = updateName;
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
    public boolean deleteHighway(String deleteName) {
        boolean isDeleted = false;
        int index = 0;
        if (deleteName != null && !deleteName.isEmpty()) {
            for (String name : highwayNames) {
                if (deleteName.equals(name)) {
                    highwayNames[index] = null;
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
