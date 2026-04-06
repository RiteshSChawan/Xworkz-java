public class Government {
    public String competitiveExamNames[] = new String[9];
    int index;
    public boolean addCompetitiveExamName(String competitiveExamName) {
        boolean isAdded = false;
        if (index < competitiveExamNames.length) {
            if (competitiveExamName != null && !competitiveExamName.isEmpty()) {
                competitiveExamNames[index++] = competitiveExamName;
                isAdded = true;
            } else System.out.println(competitiveExamName + " is invalid");
        } else
            System.out.println("competitiveExamNames index is full");
        return isAdded;
    }
    public void getCompetitiveExamDetails() {
        System.out.println("The competitive exams are : \n");
        for (String item : competitiveExamNames)
            if (item != null) System.out.println(item);
    }
    public String getCompetitiveExamByIndex(int index) {
        String competitiveExamName = null;
        if (index < competitiveExamNames.length)
            competitiveExamName = competitiveExamNames[index];
        else
            System.out.println("Invalid index value: " + index);
        return competitiveExamName;
    }
    public int getIndexByCompetitiveExam(String competitiveExamName) {
        int index = 0;
        if (competitiveExamName != null) {
            for (String item : competitiveExamNames) {
                if (item != null && item.equals(competitiveExamName)) {
                    return index;
                }
                index++;
            }
        } else System.out.println("competitive exam name not found: " + competitiveExamName);
        return index;
    }
    public boolean updateCompetitiveExam(String existingName, String updateName) {
        boolean isUpdated = false;
        int index = 0;
        if (updateName != null && !updateName.isEmpty()) {
            for (String name : competitiveExamNames) {
                if (existingName.equals(name)) {
                    competitiveExamNames[index] = updateName;
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
    public boolean deleteCompetitiveExam(String deleteName) {
        boolean isDeleted = false;
        int index = 0;
        if (deleteName != null && !deleteName.isEmpty()) {
            for (String name : competitiveExamNames) {
                if (deleteName.equals(name)) {
                    competitiveExamNames[index] = null;
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