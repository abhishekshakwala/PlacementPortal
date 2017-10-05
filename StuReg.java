/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author abhishek
 */
@Entity
public class StuReg implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    String greno;
    String address;
    String batch;
    String branch;
    String course;
    String dob;
    String email;
    String fname;
    String lname;
    String mname;
    Long mno;
    String pass;
    Integer resno;
    String type;
    
    
    public String getGreno() {
        return greno;
    }

    public void setGreno(String greno) {
        this.greno = greno;
    }

        public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
        public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

        public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
    
    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Long getMno() {
        return mno;
    }

    public void setMno(Long mno) {
        this.mno = mno;
    }
    
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getResno() {
        return resno;
    }

    public void setResno(Integer resno) {
        this.resno = resno;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (greno != null ? greno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StuReg)) {
            return false;
        }
        StuReg other = (StuReg) object;
        if ((this.greno == null && other.greno != null) || (this.greno != null && !this.greno.equals(other.greno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.StuReg[ id=" + greno + " ]";
    }
    
}
