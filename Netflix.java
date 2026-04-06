public class Netflix {
    public String webSeries[] = new String[18];
    int index;
    public boolean addWebSeries(String webSerie) {
        boolean isAdded = false;
        if (index < webSeries.length) {
            if (webSerie != null && !webSerie.isEmpty()) {
                webSeries[index++] = webSerie;
                isAdded = true;
            } else System.out.println(webSerie + " is invalid");
        } else
            System.out.println("webSeries index is full");
        return isAdded;
    }
    public void getWebSeriesDetails() {
        System.out.println("The web series are : \n");
        for (String item : webSeries)
            if (item != null) System.out.println(item);
    }
    public String getWebSeriesByIndex(int index) {
        String webSerie = null;
        if (index < webSeries.length)
            webSerie = webSeries[index];
        else
            System.out.println("Invalid index value: " + index);
        return webSerie;
    }
    public int getIndexByWebSeries(String webSerie) {
        int index = 0;
        if (webSerie != null) {
            for (String item : webSeries) {
                if (item != null && item.equals(webSerie)) {
                    return index;
                }
                index++;
            }
        } else System.out.println("web series name not found: " + webSerie);
        return index;
    }
    public boolean updateWebSeries(String existingName, String updateName) {
        boolean isUpdated = false;
        int index = 0;
        if (updateName != null && !updateName.isEmpty()) {
            for (String name : webSeries) {
                if (existingName.equals(name)) {
                    webSeries[index] = updateName;
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
    public boolean deleteWebSeries(String deleteName) {
        boolean isDeleted = false;
        int index = 0;
        if (deleteName != null && !deleteName.isEmpty()) {
            for (String name : webSeries) {
                if (deleteName.equals(name)) {
                    webSeries[index] = null;
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