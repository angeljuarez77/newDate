package dev.newdate.users.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "user_settings")
public class UserSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Boolean isAgeDisplayed;

    @Column
    private Boolean isDating;

    @Column
    private Boolean isGroupProgramming;

    @Column
    private Boolean isCompanyDisplayed;

    @JsonIgnore
    @OneToOne(mappedBy = "userSettings", cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    })
    private User user;

    public UserSettings() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getAgeDisplayed() {
        return isAgeDisplayed;
    }

    public void setAgeDisplayed(Boolean ageDisplayed) {
        isAgeDisplayed = ageDisplayed;
    }

    public Boolean getDating() {
        return isDating;
    }

    public void setDating(Boolean dating) {
        isDating = dating;
    }

    public Boolean getGroupProgramming() {
        return isGroupProgramming;
    }

    public void setGroupProgramming(Boolean groupProgramming) {
        isGroupProgramming = groupProgramming;
    }

    public Boolean getCompanyDisplayed() {
        return isCompanyDisplayed;
    }

    public void setCompanyDisplayed(Boolean companyDisplayed) {
        isCompanyDisplayed = companyDisplayed;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
