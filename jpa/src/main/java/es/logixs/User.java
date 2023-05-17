package es.logixs;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class User {
    @Id
    private String objectId;
    private String name;
    private String lastName;
    private String email;

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
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

    public User(String objectId, String name, String lastName, String email) {
        this.objectId = objectId;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public User(String objectId) {
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
