package at.fh.ima.swengs.destinations.model;

import javax.persistence.*;




@Entity
//@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")

public class Sightseeing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String sightseeingName;

    private String sightseeingDescription;

    private String sightseeingDriveway;

    private String sightseeingPhotoLink;

    private String sightseeingMap;

    @ManyToOne
    private User user;

    @ManyToOne
    private City city;

    public Sightseeing() {

    }

    public Sightseeing(String sightseeingName, String sightseeingDescription, String sightseeingDriveway, String sightseeingPhotoLink, String sightseeingMap) {
        this.sightseeingName = sightseeingName;
        this.sightseeingDescription = sightseeingDescription;
        this.sightseeingDriveway = sightseeingDriveway;
        this.sightseeingPhotoLink = sightseeingPhotoLink;
        this.sightseeingMap = sightseeingMap;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSightseeingName() {
        return sightseeingName;
    }

    public void setSightseeingName(String sightseeingName) {
        this.sightseeingName = sightseeingName;
    }

    public String getSightseeingDescription() {
        return sightseeingDescription;
    }

    public void setSightseeingDescription(String sightseeingDescription) {
        this.sightseeingDescription = sightseeingDescription;
    }

    public String getSightseeingDriveway() {
        return sightseeingDriveway;
    }

    public void setSightseeingDriveway(String sightseeingDriveway) {
        this.sightseeingDriveway = sightseeingDriveway;
    }

    public String getSightseeingPhotoLink() {
        return sightseeingPhotoLink;
    }

    public void setSightseeingPhotoLink(String sightseeingPhotoLink) {
        this.sightseeingPhotoLink = sightseeingPhotoLink;
    }

    public String getSightseeingMap() {
        return sightseeingMap;
    }

    public void setSightseeingMap(String sightseeingMap) {
        this.sightseeingMap = sightseeingMap;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
