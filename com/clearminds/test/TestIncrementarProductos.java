package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestIncrementarProductos {

    public static void main(String[] args) {
         MaquinaDulces maquina = new MaquinaDulces();

        
        maquina.agregarCelda("A");
        maquina.agregarCelda("B");
        maquina.agregarCelda("D");

        maquina.cargarProducto(new Producto("KE34", 0.85, "Papitas"), "B", 4);
        maquina.cargarProducto(new Producto("GTRD", 2.54, "Gatorade"), "D", 5);

       
        System.out.println("------------Estado inicial-------------");
        maquina.mostrarProductos();

    
        maquina.incrementarProductos("B", 6);

        
        System.out.println("---------Luego de incrementar----------");
        maquina.mostrarProductos();
    }
    
}
