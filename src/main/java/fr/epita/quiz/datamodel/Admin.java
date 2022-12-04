package fr.epita.quiz.datamodel;

public class Admin {
    private String firstName;
    private String lastName;
    private String email;
    private Long contact;
    private String password;
    private String conformationPassword;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConformationPassword() {
        return conformationPassword;
    }

    public void setConformationPassword(String conformationPassword) {
        this.conformationPassword = conformationPassword;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", contact=" + contact +
                ", password='" + password + '\'' +
                ", conformationPassword='" + conformationPassword + '\'' +
                '}';
    }
}
