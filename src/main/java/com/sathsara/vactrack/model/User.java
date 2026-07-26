package com.sathsara.vactrack.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Enumerated(EnumType.STRING)
    private IdType idType;

    @Column(unique = true)
    private String idNumber;

    @Column(unique = true)
    private String username;

    private String name;
    private String email;
    private String phone;
    private String address;
    private java.time.LocalDate dateOfBirth;
    private String disabilities;

    @Column(nullable = false)
    private String passwordHash;

    private boolean mustChangePassword = false;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String district;

    private Long hospitalId;

    @Enumerated(EnumType.STRING)
    private Status status = Status.ACTIVE;

    private java.time.LocalDateTime createdAt = java.time.LocalDateTime.now();

    public enum IdType {
        NIC, BIRTH_CERTIFICATE
    }

    public enum Role {
        SUPER_ADMIN, SUB_ADMIN, INVENTORY_MANAGER, NURSE, PATIENT
    }

    public enum Status {
        ACTIVE, INACTIVE, SUSPENDED
    }

    // Getters and Setters
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public IdType getIdType() { return idType; }
    public void setIdType(IdType idType) { this.idType = idType; }

    public String getIdNumber() { return idNumber; }
    public void setIdNumber(String idNumber) { this.idNumber = idNumber; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public java.time.LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(java.time.LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getDisabilities() { return disabilities; }
    public void setDisabilities(String disabilities) { this.disabilities = disabilities; }

    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }

    public boolean isMustChangePassword() { return mustChangePassword; }
    public void setMustChangePassword(boolean mustChangePassword) { this.mustChangePassword = mustChangePassword; }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }

    public String getDistrict() { return district; }
    public void setDistrict(String district) { this.district = district; }

    public Long getHospitalId() { return hospitalId; }
    public void setHospitalId(Long hospitalId) { this.hospitalId = hospitalId; }

    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }

    public java.time.LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(java.time.LocalDateTime createdAt) { this.createdAt = createdAt; }
}