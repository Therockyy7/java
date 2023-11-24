package billManeger;

import java.util.ArrayList;

public class Bill {
    // ArrayList<Bill> paymentList = new ArrayList<>();

    String customerCode;
    String customerType;
    int oldIndex;
    int newIndex;
    int usedEnergy;
    int norm;//Định mức
    int payment;
    
    public Bill() {
    }

    public Bill(int payment) {
        this.payment = payment;
    }

    
    public Bill(String customerCode) {
        this.customerCode = customerCode;
    }

    public Bill(String customerCode, String customerType, int oldIndex, int newIndex, int usedEnergy, int norm, int payment) {
            
            this.customerCode = customerCode;
            this.customerType = customerType;
            this.oldIndex = oldIndex;
            this.newIndex = newIndex;
            this.usedEnergy = usedEnergy;
            this.norm = norm;
            this.payment = payment;

    }

    public String getCustomerCode() {
        return customerCode;
    }
    
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public int getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }

    public int getUsedEnergy() {
        return usedEnergy;
    }
    
    public void setUsedEnergy(int usedEnergy) {
        this.usedEnergy = usedEnergy;
    }

    public int getNorm() {
        return norm;
    }

    public void setNorm(int norm) {
        this.norm = norm;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }   
     
    public int calculateUsedEnergy(int newIndex, int oldIndex){
        return this.newIndex - this.oldIndex;
    }

    public int calculateNorm(String type){
        if(type.equalsIgnoreCase("NN")){
            return 500;
        }else if(type.equalsIgnoreCase("SX") || type.equalsIgnoreCase("KD")){
            return 400;
        }else{
            return 300;
        }
    }

    public int calculatePayment(int newIndex, int oldIndex, String type){
        int usedEnergy = calculateUsedEnergy(newIndex, oldIndex);
        int normOfType = calculateNorm(type);
        if(usedEnergy <= normOfType){
             
            return usedEnergy * 550;
        }else{
            return usedEnergy * 1100;
        }
    }

    @Override
    public String toString() {
        usedEnergy = calculateUsedEnergy(newIndex, oldIndex);
        payment = calculatePayment(newIndex, oldIndex, customerType);
        return "Bill [customerCode=" + customerCode + ", customerType=" + customerType + ", oldIndex=" + oldIndex
                + ", newIndex=" + newIndex + ", usedEnergy=" + usedEnergy + ", norm=" + norm + ", payment=" + payment
                + "]";
            }
            
            @Override
            public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + ((customerCode == null) ? 0 : customerCode.hashCode());
                result = prime * result + ((customerType == null) ? 0 : customerType.hashCode());
                result = prime * result + oldIndex;
                result = prime * result + newIndex;
                result = prime * result + usedEnergy;
                result = prime * result + norm;
                result = prime * result + payment;
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
                Bill other = (Bill) obj;
                if (customerCode == null) {
                    if (other.customerCode != null)
                        return false;
                } else if (!customerCode.equals(other.customerCode))
                    return false;
                if (customerType == null) {
                    if (other.customerType != null)
                        return false;
                } else if (!customerType.equals(other.customerType))
                    return false;
                if (oldIndex != other.oldIndex)
                    return false;
                if (newIndex != other.newIndex)
                    return false;
                if (usedEnergy != other.usedEnergy)
                    return false;
                if (norm != other.norm)
                    return false;
                if (payment != other.payment)
                    return false;
                return true;
            }
}
