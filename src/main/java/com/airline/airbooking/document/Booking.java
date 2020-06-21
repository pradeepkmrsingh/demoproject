package com.airline.airbooking.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Booking {
    @Id
    private String loginemail;
    private String flightName;
    private Integer flightnumber;
    private String departuredate;
    private String returndate;
    private Integer price;
    private String clas;

    public String getLoginemail() {
        return loginemail;
    }

    public void setLoginemail(String loginemail) {
        this.loginemail = loginemail;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public Integer getFlightnumber() {
        return flightnumber;
    }

    public void setFlightnumber(Integer flightnumber) {
        this.flightnumber = flightnumber;
    }

    public String getDeparturedate() {
        return departuredate;
    }

    public void setDeparturedate(String departuredate) {
        this.departuredate = departuredate;
    }

    public String getReturndate() {
        return returndate;
    }

    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((clas == null) ? 0 : clas.hashCode());
        result = prime * result + ((departuredate == null) ? 0 : departuredate.hashCode());
        result = prime * result + ((flightName == null) ? 0 : flightName.hashCode());
        result = prime * result + ((flightnumber == null) ? 0 : flightnumber.hashCode());
        result = prime * result + ((loginemail == null) ? 0 : loginemail.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result + ((returndate == null) ? 0 : returndate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Booking other = (Booking) obj;
        if (clas == null) {
            if (other.clas != null)
                return false;
        } else if (!clas.equals(other.clas))
            return false;
        if (departuredate == null) {
            if (other.departuredate != null)
                return false;
        } else if (!departuredate.equals(other.departuredate))
            return false;
        if (flightName == null) {
            if (other.flightName != null)
                return false;
        } else if (!flightName.equals(other.flightName))
            return false;
        if (flightnumber == null) {
            if (other.flightnumber != null)
                return false;
        } else if (!flightnumber.equals(other.flightnumber))
            return false;
        if (loginemail == null) {
            if (other.loginemail != null)
                return false;
        } else if (!loginemail.equals(other.loginemail))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        } else if (!price.equals(other.price))
            return false;
        if (returndate == null) {
            if (other.returndate != null)
                return false;
        } else if (!returndate.equals(other.returndate))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Booking [clas=" + clas + ", departuredate=" + departuredate + ", flightName=" + flightName
                + ", flightnumber=" + flightnumber + ", loginemail=" + loginemail + ", price=" + price + ", returndate="
                + returndate + "]";
    }

    public Booking(String loginemail, String flightName, Integer flightnumber, String departuredate, String returndate,
            Integer price, String clas) {
        this.loginemail = loginemail;
        this.flightName = flightName;
        this.flightnumber = flightnumber;
        this.departuredate = departuredate;
        this.returndate = returndate;
        this.price = price;
        this.clas = clas;
    }
}