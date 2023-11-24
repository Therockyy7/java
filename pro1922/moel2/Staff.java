/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moel2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class Staff {

    String staffID;
    String fullName;
    String department;
    String password;
    Date dob;

    public Staff() {
    }

    
    
    public Staff(String staffID, String password) {
        this.staffID = staffID;
        this.password = password;
    }

    
    
    public Staff(String staffID) {
        this.staffID = staffID;
    }

    public Staff(String staffID, String fullName, String department, String password, Date dob) {
        this.staffID = staffID;
        this.fullName = fullName;
        this.department = department;
        this.password = password;
        this.dob = dob;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean checkChangePassWord(List<Staff> s) {
        System.out.println("Staff ID which you want to change");
        String staffid = Validate.getStringFromInput("staffID");
        Staff staffTest = new Staff(staffid);

        for (Staff id : s) {
            if (id.getStaffID().equals(staffTest.getStaffID())) {
                System.out.print("Your old code:");
                String oldCode = Validate.getStringFromInput("Old Code");

                for (Staff staff : s) {
                    if (staff.getPassword().equals(oldCode)) {
                        
                        System.out.println("Your new passWord");
                        String newPassword = Validate.getStringFromInput("new passWord");
                        
                        staff.setPassword(newPassword);
                        return true;
                    }
                }
            }
        }

        return false;
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.staffID);
        hash = 37 * hash + Objects.hashCode(this.fullName);
        hash = 37 * hash + Objects.hashCode(this.department);
        hash = 37 * hash + Objects.hashCode(this.password);
        hash = 37 * hash + Objects.hashCode(this.dob);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Staff other = (Staff) obj;
        if (!Objects.equals(this.staffID, other.staffID)) {
            return false;
        }
        if (!Objects.equals(this.fullName, other.fullName)) {
            return false;
        }
        if (!Objects.equals(this.department, other.department)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return Objects.equals(this.dob, other.dob);
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Staff{" + "staffID=" + staffID + ", fullName=" + fullName + ", department=" + department + ", password=" + password + ", dob=" + dateFormat.format(dob) + '}';
    }

}
