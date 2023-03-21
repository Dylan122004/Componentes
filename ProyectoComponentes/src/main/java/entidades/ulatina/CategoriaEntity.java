package entidades.ulatina;

import java.io.Serializable;
import java.lang.String;
import java.util.*;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: CategoriaEntity
 *
 */
@Entity

public class CategoriaEntity implements Serializable {

	   
	@Id
	private int Id;
	private String nombreCategoria;
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "categoriaEntity",cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Producto> productos = new ArrayList<>();

	public CategoriaEntity() {
		super();
	}   
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	public String getNombreCategoria() {
		return this.nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}
	
	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}  
	
	public void anadirProducto(Producto producto) {
		productos.add(producto);
		producto.setCategoriaEntity(this);
    }
 
    public void removerProducto(Producto producto) {
    	productos.remove(producto);
    	producto.setCategoriaEntity(null);
    }
   
}
