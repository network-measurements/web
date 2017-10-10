package com.klimalakamil.aurora.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalTime;

/**
 * Created by Kamil Klimala on 2017-10-10.
 * klimalakamil@gmail.com
 */

@Entity(name = "Measurement")
public class Measurement {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "created_at")
    private LocalTime createdAt;

    @Column(name = "lat")
    private float latitude;

    @Column(name = "lon")
    private float longitude;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
        this.createdAt = createdAt;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
