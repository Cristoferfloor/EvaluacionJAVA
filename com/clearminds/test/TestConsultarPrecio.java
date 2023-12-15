package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestConsultarPrecio {
    public static void main(String[] args) {
        MaquinaDulces maquina = new MaquinaDulces();

        
        maquina.agregarCelda("D");

        
        maquina.cargarProducto(new Producto("BDCR", 2.54, "Barra de Chocolate"), "D", 5);

        
        double precioConsultado = maquina.consultarPrecio("D");
        if (precioConsultado != -1) {
            System.out.println("Precio: " + precioConsultado);
        } else {
            System.out.println("No se pudo consultar el precio.");
        }
    }
}
