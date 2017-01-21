package at.fh.ima.swengs.destinations.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Elza Karimova on 06.01.2017.
 */

@Entity
//@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class City {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        private String cityName;

        private String country;

        private String cityDescription;

        private String cityDriveway;

        private String cityPhotoLink;

        private String cityMap;

        @Version
        private long version;

        @ManyToOne
        private User user;

        @OneToMany(mappedBy = "city",orphanRemoval = true)
        private List<Sightseeing> sightseeing;

    public City() {

    }

    public City(String cityName, String country, String cityDescription, String cityDriveway, String cityPhotoLink, String cityMap) {
        this.cityName = cityName;
        this.country = country;
        this.cityDescription = cityDescription;
        this.cityDriveway = cityDriveway;
        this.cityPhotoLink = cityPhotoLink;
        this.cityMap = cityMap;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCityDescription() {
        return cityDescription;
    }

    public void setCityDescription(String cityDescription) {
        this.cityDescription = cityDescription;
    }

    public String getCityDriveway() {
        return cityDriveway;
    }

    public void setCityDriveway(String cityDriveway) {
        this.cityDriveway = cityDriveway;
    }

    public String getCityPhotoLink() {
        return cityPhotoLink;
    }

    public void setCityPhotoLink(String cityPhotoLink) {
        this.cityPhotoLink = cityPhotoLink;
    }

    public String getCityMap() {
        return cityMap;
    }

    public void setCityMap(String cityMap) {
        this.cityMap = cityMap;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Sightseeing> getSightseeing() {
        return sightseeing;
    }

    public void setSightseeing(List<Sightseeing> sightseeing) {
        this.sightseeing = sightseeing;
    }
}
