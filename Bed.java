class Bed {

    String names[] = new String[10];
    int index;

    public boolean addBedName(String name) {
        boolean isAdded = false;

        if (name != null && !name.isEmpty()) {
            if (index < names.length) {
                names[index++] = name;
                isAdded = true;
            } else {
                System.out.println("The array is full");
            }
        } else {
            System.out.println("Invalid Input");
        }

        return isAdded;
    }
	
	public boolean addBedNames(String[] names){
		boolean isNamesAdded =false;
		if(names.length <= this.names.length){
			this.names=names;
			isNamesAdded=true;
		}else {
            System.out.println("Invalid Input");
        }
		
	return isNamesAdded;
	}

    public void getBedDetails() {
        System.out.println("Name of the beds are");
        for (String name : names) {
            if (name == null) {
                continue;
            } else {
                System.out.println(name);
            }
        }
        System.out.println();
    }

    public boolean searchBed(String searchBedName) {
        boolean isFound = false;

        if (searchBedName != null && !searchBedName.isEmpty()) {
            for (String name : names) {
                if (searchBedName.equals(name)) {
                    System.out.println(searchBedName + " found");
                    isFound = true;
                }else{
                System.out.println("Name not found");
				}
            }
        } else {
            System.out.println("Invalid Input..");
        }

        return isFound;
    }

    public boolean updateBed(String existingName, String updateName) {
        boolean isUpdated = false;
        int index = 0;

        if (updateName != null && !updateName.isEmpty()) {
            for (String name : names) {
                if (existingName.equals(name)) {
                    names[index] = updateName;
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

    public boolean deleteBed(String deleteName) {
        boolean isDeleted = false;
        int index = 0;

        if (deleteName != null && !deleteName.isEmpty()) {
            for (String name : names) {
                if (deleteName.equals(name)) {
                    names[index] = null;
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