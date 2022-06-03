package com.example.demo;

import lombok.Data;

@Data
public class Producto {
    private int idProducto;
    private String NombreProducto;
    private String TipoProducto;
    private String MarcaProducto;
    private float PrecioUnitario;
    
	public String getTipoProducto() {
		return TipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		TipoProducto = tipoProducto;
	}
	public float getPrecioUnitario() {
		return PrecioUnitario;
	}
	public void setPrecioUnitario(float precioUnitario) {
		PrecioUnitario = precioUnitario;
	}
	public String getMarcaProducto() {
		return MarcaProducto;
	}
	public void setMarcaProducto(String marcaProducto) {
		MarcaProducto = marcaProducto;
	}
	public String getNombreProducto() {
		return NombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		NombreProducto = nombreProducto;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	
}
