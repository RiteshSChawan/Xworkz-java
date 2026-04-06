public class PetShop {
    public String petAccessories[] = new String[20];
    int index;
    public boolean addPetAccessory(String petAccessory) {
        boolean isAdded = false;
        if (index < petAccessories.length) {
            if (petAccessory != null && !petAccessory.isEmpty()) {
                petAccessories[index++] = petAccessory;
                isAdded = true;
            } else System.out.println(petAccessory + " is invalid");
        } else
            System.out.println("petAccessories index is full");
        return isAdded;
    }
    public void getPetAccessoryDetails() {
        System.out.println("The pet accessories are : \n");
        for (String item : petAccessories)
            if (item != null) System.out.println(item);
    }
    public String getPetAccessoryByIndex(int index) {
        String petAccessory = null;
        if (index < petAccessories.length)
            petAccessory = petAccessories[index];
        else
            System.out.println("Invalid index value: " + index);
        return petAccessory;
    }
    public int getIndexByPetAccessory(String petAccessory) {
        int index = 0;
        if (petAccessory != null) {
            for (String item : petAccessories) {
                if (item != null && item.equals(petAccessory)) {
                    return index;
                }
                index++;
            }
        } else System.out.println("pet accessory name not found: " + petAccessory);
        return index;
    }
    public boolean updatePetAccessory(String existingName, String updateName) {
        boolean isUpdated = false;
        int index = 0;
        if (updateName != null && !updateName.isEmpty()) {
            for (String name : petAccessories) {
                if (existingName.equals(name)) {
                    petAccessories[index] = updateName;
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
    public boolean deletePetAccessory(String deleteName) {
        boolean isDeleted = false;
        int index = 0;
        if (deleteName != null && !deleteName.isEmpty()) {
            for (String name : petAccessories) {
                if (deleteName.equals(name)) {
                    petAccessories[index] = null;
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