package bootcampdb;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;

public class reg_details extends OutputStream implements Serializable {
    private String Name;
    private String Phone;
    private String Reg_no;
    private String Year;
    private String Email;
    private String Password;
    private String Designation;
    private String Department;
    private String DOB;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getPhone() {
        return Phone;
    }

    public String getReg_no() {
        return Reg_no;
    }

    public void setReg_no(String reg_no) {
        Reg_no = reg_no;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getYear() {
        return Year;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPassword() {
        return Password;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getDOB() {
        return DOB;
    }

    @Override
    public void write(int b) throws IOException {

    }
}