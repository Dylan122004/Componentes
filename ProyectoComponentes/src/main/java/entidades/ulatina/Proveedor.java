package entidades.ulatina;

import java.io.Serializable;
import java.lang.String;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Proveedor
 *
 */
@Entity

public class Proveedor implements Serializable {

	   
	@Id
	private int ID;
	private String Nombre;
	
	@ManyToMany(mappedBy = "proveido")
    Set<Producto> provee;
	private static final long serialVersionUID = 1L;

	public Proveedor() {
		super();
	}   
	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}   
	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
   
}
