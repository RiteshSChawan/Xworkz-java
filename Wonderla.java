public class Wonderla {
    public String waterGames[] = new String[20];
    int index;
    public boolean addWaterGame(String waterGame) {
        boolean isAdded = false;
        if (index < waterGames.length) {
            if (waterGame != null && !waterGame.isEmpty()) {
                waterGames[index++] = waterGame;
                isAdded = true;
            } else System.out.println(waterGame + " is invalid");
        } else
            System.out.println("waterGames index is full");
        return isAdded;
    }
    public void getWaterGameDetails() {
        System.out.println("The water games are : \n");
        for (String item : waterGames)
            if (item != null) System.out.println(item);
    }
    public String getWaterGameByIndex(int index) {
        String waterGame = null;
        if (index < waterGames.length)
            waterGame = waterGames[index];
        else
            System.out.println("Invalid index value: " + index);
        return waterGame;
    }
    public int getIndexByWaterGame(String waterGame) {
        int index = 0;
        if (waterGame != null) {
            for (String item : waterGames) {
                if (item != null && item.equals(waterGame)) {
                    return index;
                }
                index++;
            }
        } else System.out.println("water game name not found: " + waterGame);
        return index;
    }
    public boolean updateWaterGame(String existingName, String updateName) {
        boolean isUpdated = false;
        int index = 0;
        if (updateName != null && !updateName.isEmpty()) {
            for (String name : waterGames) {
                if (existingName.equals(name)) {
                    waterGames[index] = updateName;
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
    public boolean deleteWaterGame(String deleteName) {
        boolean isDeleted = false;
        int index = 0;
        if (deleteName != null && !deleteName.isEmpty()) {
            for (String name : waterGames) {
                if (deleteName.equals(name)) {
                    waterGames[index] = null;
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