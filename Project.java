class Project {
	int projectId;
	String projectName;
	String technology;
	int teamSize;
	boolean isCompleted;
	
	public Project(int projectId, String projectName, String technology, int teamSize, boolean isCompleted) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.technology = technology;
		this.teamSize = teamSize;
		this.isCompleted = isCompleted;
	}
	
	public void getProjectDetails() {
		System.out.println("Project Id: " + projectId);
		System.out.println("Project Name: " + projectName);
		System.out.println("Technology: " + technology);
		System.out.println("Team Size: " + teamSize);
		System.out.println("Completed: " + isCompleted);
	}
}