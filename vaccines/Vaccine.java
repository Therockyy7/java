// package pro192_vaccine;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vaccine implements Serializable {

    private String code;
    private String name;
    private int quantity;
    private Date expirationDate;
    private double price;
    private Date lastInjectedDate;

    public Vaccine(String code) {
        this.code = code;
    }

    
    public Vaccine(String code, String name, int quantity, Date expirationDate,
           double price, Date lastInjectedDate) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.price = price;
        this.lastInjectedDate = lastInjectedDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Date getLastInjectedDate() {
        return lastInjectedDate;
    }

    public void setLastInjectedDate(Date lastInjectedDate) {
        this.lastInjectedDate = lastInjectedDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "code=" + code
                + ", name=" + name
                + ", quantity=" + quantity
                + ", expirationDate=" + dateFormat.format(expirationDate)
                + ", price=" + price
                + ", lastInjectedDate=" + dateFormat.format(lastInjectedDate);
    }

    @Override
    public boolean equals(Object obj) {
        Vaccine that =(Vaccine) obj;
       return this.code.equalsIgnoreCase(that.code) ;
    }
}
