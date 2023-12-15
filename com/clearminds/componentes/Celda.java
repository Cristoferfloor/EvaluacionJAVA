package com.clearminds.componentes;

public class Celda {

    private Producto producto;
    private int stock;
    private String codigo;

    public Producto getProducto() {
        return this.producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    public Celda(Producto producto, int stock, String codigo) {
        this.producto = producto;
        this.stock = stock;
        this.codigo = codigo;
    }
    public Celda(String codigo) {
        this.codigo = codigo;
    }

   
    public void ingresarProducto(Producto nuevoProducto, int stockInicial) {
        this.producto = nuevoProducto;
        this.stock = stockInicial;
    }

    
    
}
