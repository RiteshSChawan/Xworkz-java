public class CricBuz {
    public String teamNames[] = new String[8];
    int index;
    public boolean addTeamName(String teamName) {
        boolean isAdded = false;
        if (index < teamNames.length) {
            if (teamName != null && !teamName.isEmpty()) {
                teamNames[index++] = teamName;
                isAdded = true;
            } else System.out.println(teamName + " is invalid");
        } else
            System.out.println("teamNames index is full");
        return isAdded;
    }
    public void getTeamDetails() {
        System.out.println("The teams are : \n");
        for (String item : teamNames)
            if (item != null) System.out.println(item);
    }
    public String getTeamByIndex(int index) {
        String teamName = null;
        if (index < teamNames.length)
            teamName = teamNames[index];
        else
            System.out.println("Invalid index value: " + index);
        return teamName;
    }
    public int getIndexByTeam(String teamName) {
        int index = 0;
        if (teamName != null) {
            for (String item : teamNames) {
                if (item != null && item.equals(teamName)) {
                    return index;
                }
                index++;
            }
        } else System.out.println("team name not found: " + teamName);
        return index;
    }
    public boolean updateTeam(String existingName, String updateName) {
        boolean isUpdated = false;
        int index = 0;
        if (updateName != null && !updateName.isEmpty()) {
            for (String name : teamNames) {
                if (existingName.equals(name)) {
                    teamNames[index] = updateName;
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
    public boolean deleteTeam(String deleteName) {
        boolean isDeleted = false;
        int index = 0;
        if (deleteName != null && !deleteName.isEmpty()) {
            for (String name : teamNames) {
                if (deleteName.equals(name)) {
                    teamNames[index] = null;
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