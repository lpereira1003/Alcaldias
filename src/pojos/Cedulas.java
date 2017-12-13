/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Master-Pc
 */
@Entity
@Table(name = "cedulas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cedulas.findAll", query = "SELECT c FROM Cedulas c")
    , @NamedQuery(name = "Cedulas.findByIdced", query = "SELECT c FROM Cedulas c WHERE c.idced = :idced")
    , @NamedQuery(name = "Cedulas.findByNombre", query = "SELECT c FROM Cedulas c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Cedulas.findByNumcedula", query = "SELECT c FROM Cedulas c WHERE c.numcedula = :numcedula")})
public class Cedulas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idced")
    private Integer idced;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "numcedula")
    private String numcedula;

    public Cedulas() {
    }

    public Cedulas(Integer idced) {
        this.idced = idced;
    }

    public Integer getIdced() {
        return idced;
    }

    public void setIdced(Integer idced) {
        this.idced = idced;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumcedula() {
        return numcedula;
    }

    public void setNumcedula(String numcedula) {
        this.numcedula = numcedula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idced != null ? idced.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cedulas)) {
            return false;
        }
        Cedulas other = (Cedulas) object;
        if ((this.idced == null && other.idced != null) || (this.idced != null && !this.idced.equals(other.idced))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pojos.Cedulas[ idced=" + idced + " ]";
    }
    
}
