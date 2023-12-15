package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestVenderConCambio {
    public static void main(String[] args) {
        MaquinaDulces maquina = new MaquinaDulces();

    
        maquina.cargarProducto(new Producto("DRTS", 0.7, "Doritos"), "A1", 6);
        maquina.cargarProducto(new Producto("PPTS", 0.85, "Papitas"), "B1", 3);

        
        System.out.println("------------Estado inicial-------------");
        maquina.mostrarProductos();

        
        double cambio = maquina.venderConCambio("A1", 0.85);

       
        System.out.println("-------Después de realizar la venta con cambio--------");
        maquina.mostrarProductos();
        System.out.println("Cambio entregado al cliente: " + cambio);
    }
}
