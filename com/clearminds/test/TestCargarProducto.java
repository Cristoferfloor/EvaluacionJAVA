package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestCargarProducto {

    public static void main(String[] args) {
         MaquinaDulces maquina = new MaquinaDulces();

       
        maquina.agregarCelda("A");
        maquina.agregarCelda("B");
        maquina.agregarCelda("C");
        maquina.agregarCelda("D");

    
        Producto producto1 = new Producto("KE34", 0.85, "Bolsa de Papitas");
        Producto producto2 = new Producto("BDCR", 2.54, "Barra de Chocolate");

      
        maquina.cargarProducto(producto1, "B", 4);
        maquina.cargarProducto(producto2, "D", 5);

     
        maquina.mostrarProductos();
    }
    
}
