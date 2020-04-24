package hu.flowacademy.java1.FifthPresentation;

public class Owner {
    private String owner;
    private String ownerEmail;

    public Owner(String owner, String ownerEmail) {
        this.owner = owner;
        this.ownerEmail = ownerEmail;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }
}
