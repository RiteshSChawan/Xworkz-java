public class TravelAgency {
    public String places[] = new String[17];
    int index;
    public boolean addPlace(String place) {
        boolean isAdded = false;
        if (index < places.length) {
            if (place != null && !place.isEmpty()) {
                places[index++] = place;
                isAdded = true;
            } else System.out.println(place + " is invalid");
        } else
            System.out.println("places index is full");
        return isAdded;
    }
    public void getPlaceDetails() {
        System.out.println("The places are : \n");
        for (String item : places)
            if (item != null) System.out.println(item);
    }
    public String getPlaceByIndex(int index) {
        String place = null;
        if (index < places.length)
            place = places[index];
        else
            System.out.println("Invalid index value: " + index);
        return place;
    }
    public int getIndexByPlace(String place) {
        int index = 0;
        if (place != null) {
            for (String item : places) {
                if (item != null && item.equals(place)) {
                    return index;
                }
                index++;
            }
        } else System.out.println("place name not found: " + place);
        return index;
    }
    public boolean updatePlace(String existingName, String updateName) {
        boolean isUpdated = false;
        int index = 0;
        if (updateName != null && !updateName.isEmpty()) {
            for (String name : places) {
                if (existingName.equals(name)) {
                    places[index] = updateName;
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
    public boolean deletePlace(String deleteName) {
        boolean isDeleted = false;
        int index = 0;
        if (deleteName != null && !deleteName.isEmpty()) {
            for (String name : places) {
                if (deleteName.equals(name)) {
                    places[index] = null;
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