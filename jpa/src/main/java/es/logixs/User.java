package es.logixs;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Objects;
import java.util.UUID;

@Entity
public class User {
    @Id
    @Type(type="uuid-char")
    private UUID objectId;
    private String name;
    private String lastName;
    private String email;
   @ManyToOne
   @JoinColumn(name="company_objectid")
    private Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }



    public UUID getObjectId() {
        return objectId;
    }

    public void setObjectId(UUID objectId) {
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public User( String name, String lastName, String email) {
        this.objectId = UUID.randomUUID();;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public User(UUID objectId) {
        this.objectId = objectId;
    }

    public User() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(objectId, user.objectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId);
    }
}
