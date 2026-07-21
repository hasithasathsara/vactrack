package com.sathsara.vactrack.model;

import jakarta.persistence.*;

@Entity
@Table(name = "hospitals")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hospitalId;

    private String name;
    private String district;
    private int dailyCapacity;

    @Enumerated(EnumType.STRING)
    private Status status = Status.ACTIVE;

    public enum Status { ACTIVE, INACTIVE }

    public Long getHospitalId() { return hospitalId; }
    public void setHospitalId(Long hospitalId) { this.hospitalId = hospitalId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDistrict() { return district; }
    public void setDistrict(String district) { this.district = district; }

    public int getDailyCapacity() { return dailyCapacity; }
    public void setDailyCapacity(int dailyCapacity) { this.dailyCapacity = dailyCapacity; }

    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }
}