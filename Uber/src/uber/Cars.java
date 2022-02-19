/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uber;

import java.util.Date;

/**
 *
 * @author Sarvesh
 */
public class Cars {
    private String carname;
    private String carcompany;
    private int year;
    private int seatno;
    private String serialno;
    private String modelno;
    private String manufacturer;
    private String city;
    private boolean maintainencevalid;
    private boolean availability;
    private String dateTime;
    private Date date;

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getCarcompany() {
        return carcompany;
    }

    public void setCarcompany(String carcompany) {
        this.carcompany = carcompany;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeatno() {
        return seatno;
    }

    public void setSeatno(int seatno) {
        this.seatno = seatno;
    }

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    public String getModelno() {
        return modelno;
    }

    public void setModelno(String modelno) {
        this.modelno = modelno;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isMaintainencevalid() {
        return maintainencevalid;
    }

    public void setMaintainencevalid(boolean maintainencevalid) {
        this.maintainencevalid = maintainencevalid;
    }
    
    @Override
    public String toString(){
        return carname;
    }
    
    
}
