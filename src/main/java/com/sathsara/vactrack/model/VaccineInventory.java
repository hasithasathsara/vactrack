package com.sathsara.vactrack.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "vaccine_inventory")
public class VaccineInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inventoryId;

    private Long hospitalId;
    private Long vaccineId;
    private String batchNumber;
    private int quantity;
    private LocalDate expiryDate;

    public Long getInventoryId() { return inventoryId; }
    public void setInventoryId(Long inventoryId) { this.inventoryId = inventoryId; }

    public Long getHospitalId() { return hospitalId; }
    public void setHospitalId(Long hospitalId) { this.hospitalId = hospitalId; }

    public Long getVaccineId() { return vaccineId; }
    public void setVaccineId(Long vaccineId) { this.vaccineId = vaccineId; }

    public String getBatchNumber() { return batchNumber; }
    public void setBatchNumber(String batchNumber) { this.batchNumber = batchNumber; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public LocalDate getExpiryDate() { return expiryDate; }
    public void setExpiryDate(LocalDate expiryDate) { this.expiryDate = expiryDate; }
}