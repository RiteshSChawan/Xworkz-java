public class PoliticianDetails {  // Encapsulation

    private int politicianId;
    private String politicianName;
    private String party;
    private String constituency;
    private String position;
    private String electedOn;
    private String state;

    public void setPoliticianId(int politicianId) {
        this.politicianId = politicianId;
    }
    public int getPoliticianId() {
        return this.politicianId;
    }

    public void setPoliticianName(String politicianName) {
        this.politicianName = politicianName;
    }
    public String getPoliticianName() {
        return this.politicianName;
    }

    public void setParty(String party) {
        this.party = party;
    }
    public String getParty() {
        return this.party;
    }

    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }
    public String getConstituency() {
        return this.constituency;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return this.position;
    }

    public void setElectedOn(String electedOn) {
        this.electedOn = electedOn;
    }
    public String getElectedOn() {
        return this.electedOn;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return this.state;
    }

}
