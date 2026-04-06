public class Gym {
    public String equipments[] = new String[16];
    int index;
    public boolean addEquipment(String equipment) {
        boolean isAdded = false;
        if (index < equipments.length) {
            if (equipment != null && !equipment.isEmpty()) {
                equipments[index++] = equipment;
                isAdded = true;
            } else System.out.println(equipment + " is invalid");
        } else
            System.out.println("equipments index is full");
        return isAdded;
    }
    public void getEquipmentDetails() {
        System.out.println("The equipments are : \n");
        for (String item : equipments)
            if (item != null) System.out.println(item);
    }
    public String getEquipmentByIndex(int index) {
        String equipment = null;
        if (index < equipments.length)
            equipment = equipments[index];
        else
            System.out.println("Invalid index value: " + index);
        return equipment;
    }
    public int getIndexByEquipment(String equipment) {
        int index = 0;
        if (equipment != null) {
            for (String item : equipments) {
                if (item != null && item.equals(equipment)) {
                    return index;
                }
                index++;
            }
        } else System.out.println("equipment name not found: " + equipment);
        return index;
    }
    public boolean updateEquipment(String existingName, String updateName) {
        boolean isUpdated = false;
        int index = 0;
        if (updateName != null && !updateName.isEmpty()) {
            for (String name : equipments) {
                if (existingName.equals(name)) {
                    equipments[index] = updateName;
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
    public boolean deleteEquipment(String deleteName) {
        boolean isDeleted = false;
        int index = 0;
        if (deleteName != null && !deleteName.isEmpty()) {
            for (String name : equipments) {
                if (deleteName.equals(name)) {
                    equipments[index] = null;
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