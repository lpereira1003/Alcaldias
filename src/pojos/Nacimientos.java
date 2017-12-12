/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Master-Pc
 */
@Entity
@Table(name = "nacimientos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nacimientos.findAll", query = "SELECT n FROM Nacimientos n")
    , @NamedQuery(name = "Nacimientos.findByIdpda", query = "SELECT n FROM Nacimientos n WHERE n.idpda = :idpda")
    , @NamedQuery(name = "Nacimientos.findByNombre", query = "SELECT n FROM Nacimientos n WHERE n.nombre = :nombre")
    , @NamedQuery(name = "Nacimientos.findByLibro", query = "SELECT n FROM Nacimientos n WHERE n.libro = :libro")
    , @NamedQuery(name = "Nacimientos.findByPagina", query = "SELECT n FROM Nacimientos n WHERE n.pagina = :pagina")})
public class Nacimientos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpda")
    private Integer idpda;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "libro")
    private BigInteger libro;
    @Column(name = "pagina")
    private BigInteger pagina;

    public Nacimientos() {
    }

    public Nacimientos(Integer idpda) {
        this.idpda = idpda;
    }

    public Integer getIdpda() {
        return idpda;
    }

    public void setIdpda(Integer idpda) {
        Integer oldIdpda = this.idpda;
        this.idpda = idpda;
        changeSupport.firePropertyChange("idpda", oldIdpda, idpda);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public BigInteger getLibro() {
        return libro;
    }

    public void setLibro(BigInteger libro) {
        BigInteger oldLibro = this.libro;
        this.libro = libro;
        changeSupport.firePropertyChange("libro", oldLibro, libro);
    }

    public BigInteger getPagina() {
        return pagina;
    }

    public void setPagina(BigInteger pagina) {
        BigInteger oldPagina = this.pagina;
        this.pagina = pagina;
        changeSupport.firePropertyChange("pagina", oldPagina, pagina);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpda != null ? idpda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nacimientos)) {
            return false;
        }
        Nacimientos other = (Nacimientos) object;
        if ((this.idpda == null && other.idpda != null) || (this.idpda != null && !this.idpda.equals(other.idpda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pojos.Nacimientos[ idpda=" + idpda + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
