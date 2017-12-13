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
@Table(name = "fallecidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fallecidos.findAll", query = "SELECT f FROM Fallecidos f")
    , @NamedQuery(name = "Fallecidos.findByIdfa", query = "SELECT f FROM Fallecidos f WHERE f.idfa = :idfa")
    , @NamedQuery(name = "Fallecidos.findByNombre", query = "SELECT f FROM Fallecidos f WHERE f.nombre = :nombre")
    , @NamedQuery(name = "Fallecidos.findByLibro", query = "SELECT f FROM Fallecidos f WHERE f.libro = :libro")
    , @NamedQuery(name = "Fallecidos.findByPagina", query = "SELECT f FROM Fallecidos f WHERE f.pagina = :pagina")})
public class Fallecidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfa")
    private Integer idfa;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "libro")
    private BigInteger libro;
    @Column(name = "pagina")
    private BigInteger pagina;

    public Fallecidos() {
    }

    public Fallecidos(Integer idfa) {
        this.idfa = idfa;
    }

    public Integer getIdfa() {
        return idfa;
    }

    public void setIdfa(Integer idfa) {
        this.idfa = idfa;
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
        hash += (idfa != null ? idfa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fallecidos)) {
            return false;
        }
        Fallecidos other = (Fallecidos) object;
        if ((this.idfa == null && other.idfa != null) || (this.idfa != null && !this.idfa.equals(other.idfa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pojos.Fallecidos[ idfa=" + idfa + " ]";
    }
    
}
