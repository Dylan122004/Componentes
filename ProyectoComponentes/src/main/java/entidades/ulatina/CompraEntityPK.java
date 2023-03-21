package entidades.ulatina;

import java.io.Serializable;

/**
 * ID class for entity: CompraEntity
 *
 */ 
public class CompraEntityPK  implements Serializable {   
   
	         
	private int idCompra;         
	private int idCliente;
	private static final long serialVersionUID = 1L;

	public CompraEntityPK() {}

	

	public int getIdCompra() {
		return this.idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}
	

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
   
	/*
	 * @see java.lang.Object#equals(Object)
	 */	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof CompraEntityPK)) {
			return false;
		}
		CompraEntityPK other = (CompraEntityPK) o;
		return true
			&& getIdCompra() == other.getIdCompra()
			&& getIdCliente() == other.getIdCliente();
	}
	
	/*	 
	 * @see java.lang.Object#hashCode()
	 */	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getIdCompra();
		result = prime * result + getIdCliente();
		return result;
	}
   
   
}
