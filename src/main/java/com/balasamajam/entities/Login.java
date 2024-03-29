package com.balasamajam.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class Login {

    @Id
    @Column(name = "uuid", nullable = false)
    private UUID uuid;

    @Column(name = "last_logged_in")
    private Date lastLoggedIn;

    private String token;

    @Column(name = "is_active")
    Boolean isActive;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Admin admin;

    public Login() {}

    public Login(Date lastLoggedIn, String token, Boolean isActive, Admin admin) {
        this.lastLoggedIn = lastLoggedIn;
        this.token = token;
        this.isActive = isActive;
        this.admin = admin;
    }

    public Date getLastLoggedIn() {
        return lastLoggedIn;
    }

    public void setLastLoggedIn(Date lastLoggedIn) {
        this.lastLoggedIn = lastLoggedIn;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Admin getAdmin() {
        return admin;
    }

    @PrePersist
    private void onCreate() {
        String combo = getAdmin().getUsername();
        byte [] comboBytes = combo.getBytes();
        this.uuid = UUID.nameUUIDFromBytes(comboBytes);
    }
}
