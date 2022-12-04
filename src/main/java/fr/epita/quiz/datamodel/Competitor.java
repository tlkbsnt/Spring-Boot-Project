package fr.epita.quiz.datamodel;

public class Competitor {
    private String competitorFirstName;
    private String competitorLastName;
    private String address;
    private String email;

    public Competitor(String competitorFirstName, String competitorLastName, String address, String email) {
        this.competitorFirstName = competitorFirstName;
        this.competitorLastName = competitorLastName;
        this.address = address;
        this.email = email;
    }

    public String getCompetitorFirstName() {
        return competitorFirstName;
    }

    public void setCompetitorFirstName(String competitorFirstName) {
        this.competitorFirstName = competitorFirstName;
    }

    public String getCompetitorLastName() {
        return competitorLastName;
    }

    public void setCompetitorLastName(String competitorLastName) {
        this.competitorLastName = competitorLastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
