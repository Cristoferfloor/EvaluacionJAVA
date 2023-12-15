package com.clearminds.test;

import com.clearminds.componentes.Celda;

import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarCelda {

    public static void main(String[] args) {
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.agregarCelda("A");
        maquina.agregarCelda("B");
        maquina.agregarCelda("C");

        Celda celdaEncontrada = maquina.buscarCelda("C");
        if (celdaEncontrada != null) {
            System.out.println("Celda encontrada: " + celdaEncontrada.getCodigo());
        } else {
            System.out.println("No existe la celda buscada");
        }

        
        Celda celdaNoEncontrada = maquina.buscarCelda("D");
        if (celdaNoEncontrada != null) {
            System.out.println("Celda encontrada: " + celdaNoEncontrada.getCodigo());
        } else {
            System.out.println("No existe la celda buscada");
        }
    }
    
}
