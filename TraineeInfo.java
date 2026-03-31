public class TraineeInfo {  // Encapsulation

    private int traineeId;
    private String traineeName;
    private String course;
    private String trainer;
    private String enrolledOn;
    private String completedOn;
    private String grade;

    public void setTraineeId(int traineeId) {
        this.traineeId = traineeId;
    }
    public int getTraineeId() {
        return this.traineeId;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }
    public String getTraineeName() {
        return this.traineeName;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public String getCourse() {
        return this.course;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }
    public String getTrainer() {
        return this.trainer;
    }

    public void setEnrolledOn(String enrolledOn) {
        this.enrolledOn = enrolledOn;
    }
    public String getEnrolledOn() {
        return this.enrolledOn;
    }

    public void setCompletedOn(String completedOn) {
        this.completedOn = completedOn;
    }
    public String getCompletedOn() {
        return this.completedOn;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getGrade() {
        return this.grade;
    }

}
