package bootcampdb;

import java.sql.*;


public class dbFunction{
    boolean tableCreateClass(String ccode){
        try{
            Connection con = dbOperations.getConnection();
            Statement  st = con.createStatement();
            String query="create table cl_"+ccode+"(Upload_student varchar2(1000),Upload_teacer varchar2(1000))";
            int result = st.executeUpdate(query);
            con.close();
            System.out.println("Success!    "+result);
            return true;
        }
        catch(Exception e){
            System.out.println("---------->  "+e);
        }
        return false;
    }
    void tableCreateStudent(){
        try{
            Connection con = dbOperations.getConnection();
            Statement  st = con.createStatement();
            String query="create table Student_details(email varchar2(20) primary key,name varchar2(20),phone varchar2(20),reg_no varchar2(20),department varchar2(20),year varchar2(20),password varchar2(20),designation varchar2(20),date_of_birth varchar2(20))";
            int result = st.executeUpdate(query);
            con.close();
            System.out.println("Success!    "+result);
        }
        catch(Exception e){
            System.out.println("---------->  "+e);
        }
    }
    void tableCreateTeacher(){
        try{
            Connection con = dbOperations.getConnection();
            Statement  st = con.createStatement();
            String query="create table Teacher_details(email varchar2(20) primary key,name varchar2(20),phone varchar2(20),reg_no varchar2(20),department varchar2(20),year varchar2(20),password varchar2(20),designation varchar2(20),date_of_birth varchar2(20))";
            int result = st.executeUpdate(query);
            con.close();
            System.out.println("Success!    "+result);
        }
        catch(Exception e){
            System.out.println("---------->  "+e);
        }
    }



    public boolean insertTable(reg_details rd,String Desig){
            try {
                Connection con = dbOperations.getConnection();
                Statement st = con.createStatement();
                String query = String.format("insert into Student_details values('%s','%s','%s','%s','%s','%s','%s','%s','%s')", rd.getEmail(),rd.getName(), rd.getPhone(), rd.getReg_no(),rd.getDepartment(), rd.getYear(), rd.getPassword(), rd.getDesignation(),rd.getDOB());
                st.executeUpdate(query);
                con.setAutoCommit(true);
                con.close();
                return true;
            } catch (Exception e) {
                System.out.println("---------->  " + e);
            }
            return false;


    }
    public boolean insertTableTeacher(reg_details rd,String Desig){
            try {
                Connection con = dbOperations.getConnection();
                Statement st = con.createStatement();
                String query = String.format("insert into Teacher_details values('%s','%s','%s','%s','%s','%s','%s','%s','%s')", rd.getEmail(),rd.getName(), rd.getPhone(), rd.getReg_no(),rd.getDepartment(), rd.getYear(), rd.getPassword(), rd.getDesignation(),rd.getDOB());
                st.executeUpdate(query);
                con.setAutoCommit(true);
                con.close();
                return true;
            } catch (Exception e) {
                System.out.println("---------->  " + e);
            }
            return false;
    }
    public dbFunction(String Desig){
        if(Desig.equals("Student")) {
            if (!checkTable(Desig)) {
                tableCreateStudent();
            }
        }
        if(Desig.equals("Teacher")) {
            if (!checkTable(Desig)) {
                tableCreateTeacher();
            }
        }

    }
    boolean checkTable(String Desig){
        try {
            Connection con = dbOperations.getConnection();
            DatabaseMetaData meta = con.getMetaData();
            ResultSet resultSet = meta.getTables(null, null, Desig+"_details",null);

            return resultSet.next();
        }
        catch(Exception ee){
            System.out.println(ee);
        }
        return  false;
    }
    boolean loginVerify(String usrname,String password,String Desig) throws SQLException {
        if(Desig.equals("Student")) {
            Connection con = dbOperations.getConnection();
            PreparedStatement ps1 = con.prepareStatement("select * from Student_details where email = ?");
            ps1.setString(1, usrname);
            ResultSet rs = ps1.executeQuery();
            if (rs.next()) {
                String r_usr = rs.getString(1);
                String r_pwd = rs.getString(7);
                System.out.println(usrname+"  "+r_usr);
                System.out.println(password+"  "+r_pwd);
                if (usrname.equals(r_usr) && password.equals(r_pwd)) {
                    return true;
                }
            }
        }
        if(Desig.equals("Teacher")){
            Connection con = dbOperations.getConnection();
            PreparedStatement ps1 = con.prepareStatement("select * from Teacher_details where email = ?");
            ps1.setString(1, usrname);
            ResultSet rs = ps1.executeQuery();
            if (rs.next()) {
                String r_usr = rs.getString(1);
                String r_pwd = rs.getString(7);
                System.out.println(usrname+"  "+r_usr);
                System.out.println(password+"  "+r_pwd);
                if (usrname.equals(r_usr) && password.equals(r_pwd)) {
                    return true;
                }
            }
        }
        return false;
    }
    String getUsrname(String usrname,String Desig) throws SQLException {
        if(Desig.equals("Student")) {
            Connection con = dbOperations.getConnection();
            PreparedStatement ps1 = con.prepareStatement("select * from Student_details where email = ?");
            ps1.setString(1, usrname);
            ResultSet rs = ps1.executeQuery();
            if (rs.next()) {
                String r_usr = rs.getString(2);
                return r_usr;
            }
        }
        if(Desig.equals("Teacher")){
            Connection con = dbOperations.getConnection();
            PreparedStatement ps1 = con.prepareStatement("select * from Teacher_details where email = ?");
            ps1.setString(1, usrname);
            ResultSet rs = ps1.executeQuery();
            if (rs.next()) {
                String r_usr = rs.getString(2);
                return r_usr;
            }
        }
        return "";

    }


}

