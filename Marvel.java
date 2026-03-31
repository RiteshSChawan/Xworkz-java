public class Marvel {  // Encapsulation

    private int characterId;
    private String characterName;
    private String realName;
    private String power;
    private String team;
    private String firstAppeared;
    private String actor;

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }
    public int getCharacterId() {
        return this.characterId;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
    public String getCharacterName() {
        return this.characterName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
    public String getRealName() {
        return this.realName;
    }

    public void setPower(String power) {
        this.power = power;
    }
    public String getPower() {
        return this.power;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    public String getTeam() {
        return this.team;
    }

    public void setFirstAppeared(String firstAppeared) {
        this.firstAppeared = firstAppeared;
    }
    public String getFirstAppeared() {
        return this.firstAppeared;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
    public String getActor() {
        return this.actor;
    }

}
