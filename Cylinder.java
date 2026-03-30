class Cylinder{
	String names[] = new String[10];
	int index;
	public boolean addName(String name){
		boolean isAdded = false;
		if(name !=null && !name.isEmpty()){
			if(index<names.length){
				names[index++]=name;
				isAdded = true;
			}else{
				System.out.println("The Names array is full");
			}
		}else{
			System.out.println("Invalid Input..");
		}
		
		return isAdded;
	
	}
	
	public void fetchNames(){
		System.out.println("Name of the cylinder are  ");
		for(String name:names){
			if(name == null){
				continue;
			}else{
				System.out.println(name);
			}
			
			
			
		}
		System.out.println(".......................................");
	}
	
	public boolean update(String existingName ,String updateName){
		boolean isUpdate=false;
		int index=0;
		if(updateName !=null && !updateName.isEmpty()){
			for(String name : names){
				if(name == existingName){
					names[index] = updateName;
					isUpdate=true;
				}
				index++;
				
			}
			if(isUpdate == false){
				System.out.println("The nmae is not found ");
			}
		}
		else{
			System.out.println("Invalid Input..");
		}
		
		return isUpdate;
	}
	
	public boolean delete(String deleteName){
		boolean isDelete=false;
		int index=0;
		if(deleteName!=null && !deleteName.isEmpty()){
			for(String name : names){
				if(deleteName == name){
					names[index]=null;
				   isDelete=true;
				}index++;
					
			}
		}else{
			System.out.println("Invalid Input..");
		}
		return isDelete;
	}
}