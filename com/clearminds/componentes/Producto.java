package com.clearminds.componentes;

public class Producto {
   
    private String nombre;
    private double precio;
    private String codigo;

   
    public Producto(String nombre, double precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }

    public void incrementarPrecio(int porcentajeIncremento) {
        if (porcentajeIncremento > 0) {
            double incremento = this.precio * (porcentajeIncremento / 100.0);
            this.precio += incremento;
        } else {
            System.out.println("El porcentaje de incremento debe ser mayor que cero.");
        }
    }

    
    public void disminuirPrecio(double descuento) {
        if (descuento > 0) {
            this.precio -= descuento;
        } else {
            System.out.println("El valor de descuento debe ser mayor que cero.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCodigo() {
        return codigo;
    }
}
