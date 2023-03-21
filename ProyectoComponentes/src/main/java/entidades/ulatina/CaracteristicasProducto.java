package entidades.ulatina;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CaracteristicasProducto
 *
 */
@Entity

public class CaracteristicasProducto implements Serializable {

	   
	@Id
    @Column(name = "id")
	private int Id;
	@OneToOne(mappedBy = "caracteristicas")
	private Producto producto;
	private String Tamano;
	private String Talla;
	private String Color;
	private static final long serialVersionUID = 1L;

	public CaracteristicasProducto() {
		super();
	}   
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	public String getTamano() {
		return this.Tamano;
	}

	public void setTamano(String Tamano) {
		this.Tamano = Tamano;
	}   
	public String getTalla() {
		return this.Talla;
	}

	public void setTalla(String Talla) {
		this.Talla = Talla;
	}   
	public String getColor() {
		return this.Color;
	}

	public void setColor(String Color) {
		this.Color = Color;
	}   
	
	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
   
}
