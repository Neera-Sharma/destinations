package at.fh.ima.swengs.destinations.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstname;

    private String lastname;

    private String email;

    private int status; //1=user without crud, 2 = user with crud, 3 = admin (sees all users)

    @JsonIgnore
    private String password;

    @OneToMany(mappedBy = "user",orphanRemoval = true)
    private List<Sightseeing> sightseeing;

    @OneToMany(mappedBy = "user",orphanRemoval = true)
    private List<City> city;

    @Version
    private long version;


    public User() {
    }

    public User(int id, String firstname, String lastname, String email, int status) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() { return status; }

    public void setStatus(int status) { this.status = status; }

    public List<Sightseeing> getSightseeing() {
        return sightseeing;
    }

    public void setSightseeing(List<Sightseeing> sightseeing) {
        this.sightseeing = sightseeing;
    }
}
