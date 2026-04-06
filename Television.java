public class Television {
    public String channelNames[] = new String[17];
    int index;
    public boolean addChannelName(String channelName) {
        boolean isAdded = false;
        if (index < channelNames.length) {
            if (channelName != null && !channelName.isEmpty()) {
                channelNames[index++] = channelName;
                isAdded = true;
            } else System.out.println(channelName + " is invalid");
        } else
            System.out.println("channelNames index is full");
        return isAdded;
    }
    public void getChannelDetails() {
        System.out.println("The channels are : \n");
        for (String item : channelNames)
            if (item != null) System.out.println(item);
    }
    public String getChannelByIndex(int index) {
        String channelName = null;
        if (index < channelNames.length)
            channelName = channelNames[index];
        else
            System.out.println("Invalid index value: " + index);
        return channelName;
    }
    public int getIndexByChannel(String channelName) {
        int index = 0;
        if (channelName != null) {
            for (String item : channelNames) {
                if (item != null && item.equals(channelName)) {
                    return index;
                }
                index++;
            }
        } else System.out.println("channel name not found: " + channelName);
        return index;
    }
    public boolean updateChannel(String existingName, String updateName) {
        boolean isUpdated = false;
        int index = 0;
        if (updateName != null && !updateName.isEmpty()) {
            for (String name : channelNames) {
                if (existingName.equals(name)) {
                    channelNames[index] = updateName;
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
    public boolean deleteChannel(String deleteName) {
        boolean isDeleted = false;
        int index = 0;
        if (deleteName != null && !deleteName.isEmpty()) {
            for (String name : channelNames) {
                if (deleteName.equals(name)) {
                    channelNames[index] = null;
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