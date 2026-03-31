public class Player {  // Encapsulation

    private int playerId;
    private String playerName;
    private String team;
    private String position;
    private String nationality;
    private String dateOfBirth;
    private String jerseyNumber;

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
    public int getPlayerId() {
        return this.playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public String getPlayerName() {
        return this.playerName;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    public String getTeam() {
        return this.team;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return this.position;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getNationality() {
        return this.nationality;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setJerseyNumber(String jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }
    public String getJerseyNumber() {
        return this.jerseyNumber;
    }

}
