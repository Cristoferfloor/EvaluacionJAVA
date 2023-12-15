package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

    public static void main(String[] args) {
         MaquinaDulces maquina = new MaquinaDulces();

      
        maquina.agregarCelda("A1");
        maquina.cargarProducto(new Producto("PPTS", 0.85, "Papitas"), "A1", 5);

        maquina.agregarCelda("A2");
        maquina.cargarProducto(new Producto("DRTS", 0.5, "Doritos"), "A2", 3);

        maquina.agregarCelda("B1");
        maquina.cargarProducto(new Producto("JET", 0.25, "Jet"), "B1", 7);

        maquina.agregarCelda("B2");
        maquina.cargarProducto(new Producto("DTTO", 0.6, "DeTodito"), "B2", 4);

        
        double limite = 0.9;
        System.out.println("Productos Menores a " + limite + ": " + maquina.buscarMenores(limite));
    }
    
}
