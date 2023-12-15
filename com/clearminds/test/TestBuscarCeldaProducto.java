package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarCeldaProducto {
    
    public static void main(String[] args) {
        MaquinaDulces maquina = new MaquinaDulces();

        
        maquina.agregarCelda("D");

        
        maquina.cargarProducto(new Producto("BDCR", 2.54, "Barra de Chocolate"), "D", 5);

        
        Celda celdaProducto = maquina.buscarCeldaProducto("BDCR");
        if (celdaProducto != null) {
            System.out.println("Celda: " + celdaProducto.getCodigo() + " Stock: " + celdaProducto.getStock());
        } else {
            System.out.println("No se encontró la celda que contiene el producto.");
        }
    }

}
