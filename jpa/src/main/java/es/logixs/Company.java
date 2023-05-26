package es.logixs;



import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@NamedQuery(name="Company.findAll",query="select c from Company c")
public class Company {


    @Id
    @Type(type="uuid-char")
    private UUID objectId;
    private String code;
    private String state;
    private String licenseId;
    private int limitUsers;
    public UUID getObjectId() {
        return objectId;
    }
    //oye la relacion onetomany es una relacion que se base en la de company que es la manytoone
    @OneToMany(mappedBy="company" )
    private List<User> users= new ArrayList<User>();



    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> userList) {
        this.users = userList;
    }

    public void setObjectId(UUID objectId) {
        this.objectId = objectId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public int getLimitUsers() {
        return limitUsers;
    }

    public void setLimitUsers(int limitUsers) {
        this.limitUsers = limitUsers;
    }

    public Company(UUID objectId, String code, String state, String licenseId, int limitUsers) {
        this.objectId = objectId;
        this.code = code;
        this.state = state;
        this.licenseId = licenseId;
        this.limitUsers = limitUsers;
    }

    public Company(UUID objectId) {
        this.objectId = objectId;
    }

    public Company() {
    }
}
