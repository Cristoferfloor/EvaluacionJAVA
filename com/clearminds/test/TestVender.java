package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestVender {

    public static void main(String[] args) {
        MaquinaDulces maquina = new MaquinaDulces();

       
        maquina.cargarProducto(new Producto("DRTS", 0.7, "Doritos"), "A1", 5);
        maquina.cargarProducto(new Producto("PPTS", 0.85, "Papitas"), "B1", 3);

        
        System.out.println("------------Estado inicial-------------");
        maquina.mostrarProductos();

       
        maquina.vender("A1");
        maquina.vender("A2"); 
        maquina.vender("B1");
        maquina.vender("B2"); 

       
        System.out.println("-------Después de realizar ventas--------");
        maquina.mostrarProductos();
    }
    
}
