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
public class Login implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
     String greno;
    String pass;
    String type;

    public String getGreno() {
        return greno;
    }

    public void setGreno(String greno) {
        this.greno = greno;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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
        hash += (greno!= null ? greno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Login)) {
            return false;
        }
        Login other = (Login) object;
        if ((this.greno == null && other.greno != null) || (this.greno != null && !this.greno.equals(other.greno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Login[ id=" + greno + " ]";
    }
    
}
