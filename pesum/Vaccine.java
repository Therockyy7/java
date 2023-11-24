package pesum;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Vaccine implements Serializable {
    public String name;
    public String code;
    public int quantity;
    public Date exppirationDate;
    public double price;
    public Date lasttInjectedDate;
    
    public Vaccine(String code){
        
    }


  
    public Vaccine( String code, String name, int quantity, Date exppirationDate, double price, Date lasttInjectedDate) {
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.exppirationDate = exppirationDate;
        this.price = price;
        this.lasttInjectedDate = lasttInjectedDate;
    }
    public Vaccine(ArrayList<Date> date, String name2, String code2, int quantity2, Date exppirationDate2,
            double price2, Date lastInjectedDate) {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Date getExppirationDate() {
        return exppirationDate;
    }
    public void setExppirationDate(Date exppirationDate) {
        this.exppirationDate = exppirationDate;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Date getLasttInjectedDate() {
        return lasttInjectedDate;
    }
    public void setLasttInjectedDate(Date lasttInjectedDate) {
        this.lasttInjectedDate = lasttInjectedDate;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        result = prime * result + quantity;
        result = prime * result + ((exppirationDate == null) ? 0 : exppirationDate.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((lasttInjectedDate == null) ? 0 : lasttInjectedDate.hashCode());
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
        Vaccine other = (Vaccine) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        if (quantity != other.quantity)
            return false;
        if (exppirationDate == null) {
            if (other.exppirationDate != null)
                return false;
        } else if (!exppirationDate.equals(other.exppirationDate))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        if (lasttInjectedDate == null) {
            if (other.lasttInjectedDate != null)
                return false;
        } else if (!lasttInjectedDate.equals(other.lasttInjectedDate))
            return false;
        return true;
    }
    @Override
    public String toString() {
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Vaccine [name=" + name + ", code=" + code + ", quantity=" + quantity + ", exppirationDate="
                + dateFormat.format(exppirationDate) + ", price=" + price + ", lasttInjectedDate=" + dateFormat.format(lasttInjectedDate) + "]";
    }


}


   
