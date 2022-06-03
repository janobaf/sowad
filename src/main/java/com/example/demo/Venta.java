package com.example.demo;

public class Venta {
     private int IDventa;
     private String DNICliente;
     private int IDProducto;
     private int cantidad;
     private float PrecioTotal;
	public float getPrecioTotal() {
		return PrecioTotal;
	}
	public void setPrecioTotal(float precioTotal) {
		PrecioTotal = precioTotal;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getIDProducto() {
		return IDProducto;
	}
	public void setIDProducto(int iDProducto) {
		IDProducto = iDProducto;
	}
	public int getIDventa() {
		return IDventa;
	}
	public void setIDventa(int iDventa) {
		IDventa = iDventa;
	}
	public String getDNICliente() {
		return DNICliente;
	}
	public void setDNICliente(String dNICliente) {
		DNICliente = dNICliente;
	}
     
     
}
