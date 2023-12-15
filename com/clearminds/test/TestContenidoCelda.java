package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class TestContenidoCelda {

    public static void main(String[] args) {
        Producto producto = new Producto("Papitas", 0.85, "KE34");

       
        Celda celda = new Celda(producto, 5, "A1");

       
        System.out.println("CELDA:" + celda.getCodigo());
        System.out.println("*************************************");
        System.out.println("Nombre Producto: " + celda.getProducto().getNombre());
        System.out.println("Precio Producto: " + celda.getProducto().getPrecio());
        System.out.println("Código Producto: " + celda.getProducto().getCodigo());
        System.out.println("STOCK: " + celda.getStock());
    }
    
}
