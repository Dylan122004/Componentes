package entidades.ulatina;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ClienteEntity
 *
 */
@Entity

public class ClienteEntity implements Serializable {

	   
	@Id
	private int id;
	private String nombreCliente;
	private static final long serialVersionUID = 1L;

	public ClienteEntity() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getNombreCliente() {
		return this.nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
   
}
