package pesum_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    String empld;
    String account;
    Date workStartingDate;
    float productivityScore;
    double  monthlyIncome;
    double  rewardSalary;
    int allowance;

    public Employee(String empld, String account, Date workStartingDate, float productivityScore, int allowance) {
        this.empld = empld;
        this.account = account;
        this.workStartingDate = workStartingDate;
        this.productivityScore = productivityScore;
        this.allowance = allowance;
    }
    public Employee(String empld, String account, Date workStartingDate, float productivityScore, double monthlyIncome,
            double rewardSalary, int allowance) {
        this.empld = empld;
        this.account = account;
        this.workStartingDate = workStartingDate;
        this.productivityScore = productivityScore;
        this.monthlyIncome = monthlyIncome;
        this.rewardSalary = rewardSalary;
        this.allowance = allowance;
    }

    public double CalMonthlyIncome(){
        return this.rewardSalary + this.allowance;
    }
    public float CalReward(){
        return this.productivityScore * 3000000;
    }

    
    public String getEmpld() {
        return empld;
    }
    public void setEmpld(String empld) {
        this.empld = empld;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public Date getWorkStartingDate() {
        return workStartingDate;
    }
    public void setWorkStartingDate(Date workStartingDate) {
        this.workStartingDate = workStartingDate;
    }
    public float getProductivityScore() {
        return productivityScore;
    }
    public void setProductivityScore(float productivityScore) {
        this.productivityScore = productivityScore;
    }
    public double getMonthlyIncome() {
        return monthlyIncome;
    }
    public void setMonthlyIncome(int monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }
    public double getRewardSalary() {
        return rewardSalary;
    }
    public void setRewardSalary(int rewardSalary) {
        rewardSalary = rewardSalary;
    }
    public int getAllowance() {
        return allowance;
    }
    public void setAllowance(int allowance) {
        allowance = allowance;
    }
    

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((empld == null) ? 0 : empld.hashCode());
        result = prime * result + ((account == null) ? 0 : account.hashCode());
        result = prime * result + ((workStartingDate == null) ? 0 : workStartingDate.hashCode());
        result = prime * result + Float.floatToIntBits(productivityScore);
        long temp;
        temp = Double.doubleToLongBits(monthlyIncome);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(rewardSalary);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + allowance;
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
        Employee other = (Employee) obj;
        if (empld == null) {
            if (other.empld != null)
                return false;
        } else if (!empld.equals(other.empld))
            return false;
        if (account == null) {
            if (other.account != null)
                return false;
        } else if (!account.equals(other.account))
            return false;
        if (workStartingDate == null) {
            if (other.workStartingDate != null)
                return false;
        } else if (!workStartingDate.equals(other.workStartingDate))
            return false;
        if (Float.floatToIntBits(productivityScore) != Float.floatToIntBits(other.productivityScore))
            return false;
        if (Double.doubleToLongBits(monthlyIncome) != Double.doubleToLongBits(other.monthlyIncome))
            return false;
        if (Double.doubleToLongBits(rewardSalary) != Double.doubleToLongBits(other.rewardSalary))
            return false;
        if (allowance != other.allowance)
            return false;
        return true;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        //  this.monthlyIncome = CalMonthlyIncome();
        //  this.rewardSalary = CalReward();
        return "Employee [empld=" + empld + ", account=" + account + ", workStartingDate=" + dateFormat.format(workStartingDate)
                + ", productivityScore=" + productivityScore + ", monthlyIncome=" + monthlyIncome + ", rewardSalary="
                + rewardSalary + ", allowance=" + allowance + "]";
    }

    public String toString2(){
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

         return "Employee [empld=" + empld + ", account=" + account + ", workStartingDate=" + dateFormat.format(workStartingDate)
                + ", productivityScore=" + productivityScore + ", allowance=" + allowance + "]";
    }
    
}
