public class PlayList {
    public String songNames[] = new String[15];
    int index;
    public boolean addSongName(String songName) {
        boolean isAdded = false;
        if (index < songNames.length) {
            if (songName != null && !songName.isEmpty()) {
                songNames[index++] = songName;
                isAdded = true;
            } else System.out.println(songName + " is invalid");
        } else
            System.out.println("songNames index is full");
        return isAdded;
    }
    public void getSongDetails() {
        System.out.println("The songs are : \n");
        for (String item : songNames)
            if (item != null) System.out.println(item);
    }
    public String getSongByIndex(int index) {
        String songName = null;
        if (index < songNames.length)
            songName = songNames[index];
        else
            System.out.println("Invalid index value: " + index);
        return songName;
    }
    public int getIndexBySong(String songName) {
        int index = 0;
        if (songName != null) {
            for (String item : songNames) {
                if (item != null && item.equals(songName)) {
                    return index;
                }
                index++;
            }
        } else System.out.println("song name not found: " + songName);
        return index;
    }
    public boolean updateSong(String existingName, String updateName) {
        boolean isUpdated = false;
        int index = 0;
        if (updateName != null && !updateName.isEmpty()) {
            for (String name : songNames) {
                if (existingName.equals(name)) {
                    songNames[index] = updateName;
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
    public boolean deleteSong(String deleteName) {
        boolean isDeleted = false;
        int index = 0;
        if (deleteName != null && !deleteName.isEmpty()) {
            for (String name : songNames) {
                if (deleteName.equals(name)) {
                    songNames[index] = null;
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
 