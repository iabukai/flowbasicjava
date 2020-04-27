package hu.flowacademy.java1.FifthPresentation;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Owner owner1 = (Owner) o;

        if (owner != null ? !owner.equals(owner1.owner) : owner1.owner != null) return false;
        return ownerEmail != null ? ownerEmail.equals(owner1.ownerEmail) : owner1.ownerEmail == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerEmail,owner);
    }
}
