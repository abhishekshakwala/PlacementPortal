/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author abhishek
 */
@Entity
public class CiriculumV implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    String greno;
    String fname;
    String mname;
    String lname;
    String gender;
    String dob;
    String address;
    Integer resno;
    Long mno;
    String email;
    String objective;
    String name10;
    String year10;
    Float per10;
    String name12;
    String year12;
    Float per12;
    Float cgpa;
    String projects;
    String pastexp;
    String extra_act;
    String tools;
    String branch;
    String course;
    String lang;
    Float dip_5th;
    Float dip_6th;
    Float dipaggre;
    String database;
    Integer apttest;
    String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    
   

    public String getGreno() {
        return greno;
    }

    public void setGreno(String greno) {
        this.greno = greno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getResno() {
        return resno;
    }

    public void setResno(Integer resno) {
        this.resno = resno;
    }

    public Long getMno() {
        return mno;
    }

    public void setMno(Long mno) {
        this.mno = mno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getName10() {
        return name10;
    }

    public void setName10(String name10) {
        this.name10 = name10;
    }

    public String getYear10() {
        return year10;
    }

    public void setYear10(String year10) {
        this.year10 = year10;
    }

    public Float getPer10() {
        return per10;
    }

    public void setPer10(Float per10) {
        this.per10 = per10;
    }

   

    public String getName12() {
        return name12;
    }

    public void setName12(String name12) {
        this.name12 = name12;
    }

    public String getYear12() {
        return year12;
    }

    public void setYear12(String year12) {
        this.year12 = year12;
    }


    public String getProjects() {
        return projects;
    }

    public void setProjects(String projects) {
        this.projects = projects;
    }

    public String getPastexp() {
        return pastexp;
    }

    public void setPastexp(String pastexp) {
        this.pastexp = pastexp;
    }

    public String getExtra_act() {
        return extra_act;
    }

    public void setExtra_act(String extra_act) {
        this.extra_act = extra_act;
    }

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }


    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public Float getPer12() {
        return per12;
    }

    public void setPer12(Float per12) {
        this.per12 = per12;
    }

    public Float getCgpa() {
        return cgpa;
    }

    public void setCgpa(Float cgpa) {
        this.cgpa = cgpa;
    }

    public Float getDip_5th() {
        return dip_5th;
    }

    public void setDip_5th(Float dip_5th) {
        this.dip_5th = dip_5th;
    }

    public Float getDip_6th() {
        return dip_6th;
    }

    public void setDip_6th(Float dip_6th) {
        this.dip_6th = dip_6th;
    }

    public Float getDipaggre() {
        return dipaggre;
    }

    public void setDipaggre(Float dipaggre) {
        this.dipaggre = dipaggre;
    }

    public Integer getApttest() {
        return apttest;
    }

    public void setApttest(Integer apttest) {
        this.apttest = apttest;
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
        if (!(object instanceof CiriculumV)) {
            return false;
        }
        CiriculumV other = (CiriculumV) object;
        if ((this.greno == null && other.greno != null) || (this.greno != null && !this.greno.equals(other.greno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.CiriculumV[ id=" + greno + " ]";
    }
    
}
