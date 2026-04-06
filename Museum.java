public class Museum {
    public String historicalMonuments[] = new String[16];
    int index;
    public boolean addHistoricalMonument(String historicalMonument) {
        boolean isAdded = false;
        if (index < historicalMonuments.length) {
            if (historicalMonument != null && !historicalMonument.isEmpty()) {
                historicalMonuments[index++] = historicalMonument;
                isAdded = true;
            } else System.out.println(historicalMonument + " is invalid");
        } else
            System.out.println("historicalMonuments index is full");
        return isAdded;
    }
    public void getHistoricalMonumentDetails() {
        System.out.println("The historical monuments are : \n");
        for (String item : historicalMonuments)
            if (item != null) System.out.println(item);
    }
    public String getHistoricalMonumentByIndex(int index) {
        String historicalMonument = null;
        if (index < historicalMonuments.length)
            historicalMonument = historicalMonuments[index];
        else
            System.out.println("Invalid index value: " + index);
        return historicalMonument;
    }
    public int getIndexByHistoricalMonument(String historicalMonument) {
        int index = 0;
        if (historicalMonument != null) {
            for (String item : historicalMonuments) {
                if (item != null && item.equals(historicalMonument)) {
                    return index;
                }
                index++;
            }
        } else System.out.println("historical monument name not found: " + historicalMonument);
        return index;
    }
    public boolean updateHistoricalMonument(String existingName, String updateName) {
        boolean isUpdated = false;
        int index = 0;
        if (updateName != null && !updateName.isEmpty()) {
            for (String name : historicalMonuments) {
                if (existingName.equals(name)) {
                    historicalMonuments[index] = updateName;
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
    public boolean deleteHistoricalMonument(String deleteName) {
        boolean isDeleted = false;
        int index = 0;
        if (deleteName != null && !deleteName.isEmpty()) {
            for (String name : historicalMonuments) {
                if (deleteName.equals(name)) {
                    historicalMonuments[index] = null;
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
 