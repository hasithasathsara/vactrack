package com.sathsara.vactrack.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentId;

    private Long patientId;
    private Long hospitalId;
    private LocalDate bookingDate;
    private String qrCodeRef;

    @Enumerated(EnumType.STRING)
    private Status status = Status.BOOKED;

    private Long vaccineInventoryId;
    private String staffRemark;

    public enum Status { BOOKED, VACCINATED, FAILED, CANCELLED }

    public Long getAppointmentId() { return appointmentId; }
    public void setAppointmentId(Long appointmentId) { this.appointmentId = appointmentId; }

    public Long getPatientId() { return patientId; }
    public void setPatientId(Long patientId) { this.patientId = patientId; }

    public Long getHospitalId() { return hospitalId; }
    public void setHospitalId(Long hospitalId) { this.hospitalId = hospitalId; }

    public LocalDate getBookingDate() { return bookingDate; }
    public void setBookingDate(LocalDate bookingDate) { this.bookingDate = bookingDate; }

    public String getQrCodeRef() { return qrCodeRef; }
    public void setQrCodeRef(String qrCodeRef) { this.qrCodeRef = qrCodeRef; }

    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }

    public Long getVaccineInventoryId() { return vaccineInventoryId; }
    public void setVaccineInventoryId(Long vaccineInventoryId) { this.vaccineInventoryId = vaccineInventoryId; }

    public String getStaffRemark() { return staffRemark; }
    public void setStaffRemark(String staffRemark) { this.staffRemark = staffRemark; }
}