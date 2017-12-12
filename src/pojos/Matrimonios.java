/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "matrimonios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Matrimonios.findAll", query = "SELECT m FROM Matrimonios m")
    , @NamedQuery(name = "Matrimonios.findByIdmatri", query = "SELECT m FROM Matrimonios m WHERE m.idmatri = :idmatri")
    , @NamedQuery(name = "Matrimonios.findByNombre", query = "SELECT m FROM Matrimonios m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "Matrimonios.findByLibro", query = "SELECT m FROM Matrimonios m WHERE m.libro = :libro")
    , @NamedQuery(name = "Matrimonios.findByPagina", query = "SELECT m FROM Matrimonios m WHERE m.pagina = :pagina")})
public class Matrimonios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmatri")
    private Integer idmatri;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "libro")
    private BigInteger libro;
    @Column(name = "pagina")
    private BigInteger pagina;

    public Matrimonios() {
    }

    public Matrimonios(Integer idmatri) {
        this.idmatri = idmatri;
    }

    public Integer getIdmatri() {
        return idmatri;
    }

    public void setIdmatri(Integer idmatri) {
        this.idmatri = idmatri;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigInteger getLibro() {
        return libro;
    }

    public void setLibro(BigInteger libro) {
        this.libro = libro;
    }

    public BigInteger getPagina() {
        return pagina;
    }

    public void setPagina(BigInteger pagina) {
        this.pagina = pagina;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmatri != null ? idmatri.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matrimonios)) {
            return false;
        }
        Matrimonios other = (Matrimonios) object;
        if ((this.idmatri == null && other.idmatri != null) || (this.idmatri != null && !this.idmatri.equals(other.idmatri))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pojos.Matrimonios[ idmatri=" + idmatri + " ]";
    }
    
}
