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
@Table(name = "divorcios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Divorcios.findAll", query = "SELECT d FROM Divorcios d")
    , @NamedQuery(name = "Divorcios.findByIddiv", query = "SELECT d FROM Divorcios d WHERE d.iddiv = :iddiv")
    , @NamedQuery(name = "Divorcios.findByNombre", query = "SELECT d FROM Divorcios d WHERE d.nombre = :nombre")
    , @NamedQuery(name = "Divorcios.findByLibro", query = "SELECT d FROM Divorcios d WHERE d.libro = :libro")
    , @NamedQuery(name = "Divorcios.findByPagina", query = "SELECT d FROM Divorcios d WHERE d.pagina = :pagina")})
public class Divorcios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddiv")
    private Integer iddiv;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "libro")
    private Integer libro;
    @Column(name = "pagina")
    private Integer pagina;

    public Divorcios() {
    }

    public Divorcios(Integer iddiv) {
        this.iddiv = iddiv;
    }

    public Integer getIddiv() {
        return iddiv;
    }

    public void setIddiv(Integer iddiv) {
        this.iddiv = iddiv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLibro() {
        return libro;
    }

    public void setLibro(Integer libro) {
        this.libro = libro;
    }

    public Integer getPagina() {
        return pagina;
    }

    public void setPagina(Integer pagina) {
        this.pagina = pagina;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddiv != null ? iddiv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Divorcios)) {
            return false;
        }
        Divorcios other = (Divorcios) object;
        if ((this.iddiv == null && other.iddiv != null) || (this.iddiv != null && !this.iddiv.equals(other.iddiv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pojos.Divorcios[ iddiv=" + iddiv + " ]";
    }
    
}
