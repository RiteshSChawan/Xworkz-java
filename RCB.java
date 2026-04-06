public class RCB {
    public String playerNames[] = new String[15];
    int index;
    public boolean addPlayerName(String playerName) {
        boolean isAdded = false;
        if (index < playerNames.length) {
            if (playerName != null && !playerName.isEmpty()) {
                playerNames[index++] = playerName;
                isAdded = true;
            } else System.out.println(playerName + " is invalid");
        } else
            System.out.println("playerNames index is full");
        return isAdded;
    }
    public void getPlayerDetails() {
        System.out.println("The players are : \n");
        for (String item : playerNames)
            if (item != null) System.out.println(item);
    }
    public String getPlayerByIndex(int index) {
        String playerName = null;
        if (index < playerNames.length)
            playerName = playerNames[index];
        else
            System.out.println("Invalid index value: " + index);
        return playerName;
    }
    public int getIndexByPlayer(String playerName) {
        int index = 0;
        if (playerName != null) {
            for (String item : playerNames) {
                if (item != null && item.equals(playerName)) {
                    return index;
                }
                index++;
            }
        } else System.out.println("player name not found: " + playerName);
        return index;
    }
    public boolean updatePlayer(String existingName, String updateName) {
        boolean isUpdated = false;
        int index = 0;
        if (updateName != null && !updateName.isEmpty()) {
            for (String name : playerNames) {
                if (existingName.equals(name)) {
                    playerNames[index] = updateName;
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
    public boolean deletePlayer(String deleteName) {
        boolean isDeleted = false;
        int index = 0;
        if (deleteName != null && !deleteName.isEmpty()) {
            for (String name : playerNames) {
                if (deleteName.equals(name)) {
                    playerNames[index] = null;
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