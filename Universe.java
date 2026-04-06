public class Universe {
    public String galaxies[] = new String[17];
    int index;
    public boolean addGalaxy(String galaxy) {
        boolean isAdded = false;
        if (index < galaxies.length) {
            if (galaxy != null && !galaxy.isEmpty()) {
                galaxies[index++] = galaxy;
                isAdded = true;
            } else System.out.println(galaxy + " is invalid");
        } else
            System.out.println("galaxies index is full");
        return isAdded;
    }
    public void getGalaxyDetails() {
        System.out.println("The galaxies are : \n");
        for (String item : galaxies)
            if (item != null) System.out.println(item);
    }
    public String getGalaxyByIndex(int index) {
        String galaxy = null;
        if (index < galaxies.length)
            galaxy = galaxies[index];
        else
            System.out.println("Invalid index value: " + index);
        return galaxy;
    }
    public int getIndexByGalaxy(String galaxy) {
        int index = 0;
        if (galaxy != null) {
            for (String item : galaxies) {
                if (item != null && item.equals(galaxy)) {
                    return index;
                }
                index++;
            }
        } else System.out.println("galaxy name not found: " + galaxy);
        return index;
    }
    public boolean updateGalaxy(String existingName, String updateName) {
        boolean isUpdated = false;
        int index = 0;
        if (updateName != null && !updateName.isEmpty()) {
            for (String name : galaxies) {
                if (existingName.equals(name)) {
                    galaxies[index] = updateName;
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
    public boolean deleteGalaxy(String deleteName) {
        boolean isDeleted = false;
        int index = 0;
        if (deleteName != null && !deleteName.isEmpty()) {
            for (String name : galaxies) {
                if (deleteName.equals(name)) {
                    galaxies[index] = null;
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
 