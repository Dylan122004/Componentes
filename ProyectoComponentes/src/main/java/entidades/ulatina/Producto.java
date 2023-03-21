package entidades.ulatina;

import java.io.Serializable;
import java.lang.Double;
import java.lang.String;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Producto
 *
 */
@Entity

public class Producto implements Serializable {

	   
	@Id
    @Column(name = "id")
	private int Id;
	private String Nombre;
	private String Stock;
	private String Marca;
	private Double Precio;
	
	@ManyToMany
	@JoinTable(
			  name = "proveido", 
			  joinColumns = @JoinColumn(name = "Producto_ID"), 
			  inverseJoinColumns = @JoinColumn(name = "Proveedor_ID"))
    Set<Proveedor> proveido;
	
	@ManyToMany(mappedBy = "producto")
    Set<Inventario> inventario;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CaracteristicasProducto_id", referencedColumnName = "id")
	private CaracteristicasProducto caracteristicas;
	
	@ManyToOne(fetch = FetchType.LAZY)
    private CategoriaEntity categoriaEntity;
	private static final long serialVersionUID = 1L;

	public Producto() {
		super();
	}   
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}   
	public String getStock() {
		return this.Stock;
	}

	public void setStock(String Stock) {
		this.Stock = Stock;
	}   
	public String getMarca() {
		return this.Marca;
	}

	public void setMarca(String Marca) {
		this.Marca = Marca;
	}   
	public Double getPrecio() {
		return this.Precio;
	}

	public void setPrecio(Double Precio) {
		this.Precio = Precio;
	}  
	public CategoriaEntity getCategoriaEntity() {
		return this.categoriaEntity;
	}

	public void setCategoriaEntity(CategoriaEntity categoriaEntity) {
		this.categoriaEntity = categoriaEntity;
	}   
	public CaracteristicasProducto getCaracteristicasProducto() {
		return this.caracteristicas;
	}

	public void setCaracteristicasProducto(CaracteristicasProducto caracteristicas) {
		this.caracteristicas = caracteristicas;
	} 
   
}
