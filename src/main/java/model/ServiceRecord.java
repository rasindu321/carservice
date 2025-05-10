package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ServiceRecord {
    private int recordId;
    private int userId;
    private int vehicleId;
    private int serviceId;
    private LocalDate serviceDate;
    private double cost;
    private int mileage;
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE;

    public ServiceRecord() {
    }

    public ServiceRecord(int recordId, int userId, int vehicleId, int serviceId, LocalDate serviceDate, double cost, int mileage) {
        this.recordId = recordId;
        this.userId = userId;
        this.vehicleId = vehicleId;
        this.serviceId = serviceId;
        this.serviceDate = serviceDate;
        this.cost = cost;
        this.mileage = mileage;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public LocalDate getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(LocalDate serviceDate) {
        this.serviceDate = serviceDate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return recordId + "," + userId + "," + vehicleId + "," + serviceId + "," + serviceDate + "," + cost + "," + mileage;
    }
}