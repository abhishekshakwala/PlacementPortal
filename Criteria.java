/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author abhishek
 */
@Entity
public class Criteria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    String compid;
    String compname;
    Float Per10;
    Float Per12;
    Float dipagrre;
    Integer apttest;
    Float cgpa;

    public String getCompid() {
        return compid;
    }

    public void setCompid(String compid) {
        this.compid = compid;
    }

    public String getCompname() {
        return compname;
    }

    public void setCompname(String compname) {
        this.compname = compname;
    }

    public Float getPer10() {
        return Per10;
    }

    public void setPer10(Float Per10) {
        this.Per10 = Per10;
    }

    public Float getPer12() {
        return Per12;
    }

    public void setPer12(Float Per12) {
        this.Per12 = Per12;
    }

    public Float getDipagrre() {
        return dipagrre;
    }

    public void setDipagrre(Float dipagrre) {
        this.dipagrre = dipagrre;
    }

    public Integer getApttest() {
        return apttest;
    }

    public void setApttest(Integer apttest) {
        this.apttest = apttest;
    }

    public Float getCgpa() {
        return cgpa;
    }

    public void setCgpa(Float cgpa) {
        this.cgpa = cgpa;
    }

    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compid != null ? compid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Criteria)) {
            return false;
        }
        Criteria other = (Criteria) object;
        if ((this.compid == null && other.compid != null) || (this.compid != null && !this.compid.equals(other.compid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Criteria[ id=" + compid + " ]";
    }
    
}
