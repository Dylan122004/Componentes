package entidades.ulatina;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Inventario
 *
 */
@Entity

public class Inventario implements Serializable {

	   
	@Id
	private int ID;
	@ManyToMany
	@JoinTable(
			  name = "producto", 
			  joinColumns = @JoinColumn(name = "Inventario_ID"), 
			  inverseJoinColumns = @JoinColumn(name = "Producto_ID"))
    Set<Producto> producto;
	private static final long serialVersionUID = 1L;

	public Inventario() {
		super();
	}   
	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}
   
}
