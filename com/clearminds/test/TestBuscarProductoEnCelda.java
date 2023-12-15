package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProductoEnCelda {
    public static void main(String[] args) {
        MaquinaDulces maquina = new MaquinaDulces();

        
        maquina.agregarCelda("A");
        maquina.agregarCelda("B");

      
        Producto productoPapitas = new Producto("Papitas", 0.85, "KE34");

        maquina.cargarProducto(productoPapitas, "A", 5);

       
        Producto productoEncontrado = maquina.buscarProductoEnCelda("A");
        if (productoEncontrado != null) {
            System.out.println("Producto encontrado: " + productoEncontrado.getNombre());
        } else {
            System.out.println("Producto no encontrado");
        }

        
        Producto productoNoEncontrado = maquina.buscarProductoEnCelda("C");
        if (productoNoEncontrado != null) {
            System.out.println("Producto encontrado: " + productoNoEncontrado.getNombre());
        } else {
            System.out.println("Producto no encontrado");
        }
    }
}
