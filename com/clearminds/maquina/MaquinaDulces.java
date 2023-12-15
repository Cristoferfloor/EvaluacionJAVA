package com.clearminds.maquina;

import java.util.ArrayList;
import java.util.List;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

     private List<Celda> celdas;
     private double saldo;

    
    public MaquinaDulces() {
        this.celdas = new ArrayList<>();
         this.saldo = 0.0;
    }

    
    public void agregarCelda(String codigoCelda) {
        
        Celda nuevaCelda = new Celda(codigoCelda);

        
        this.celdas.add(nuevaCelda);
    }

    public void mostrarConfiguracion() {
        System.out.println("Configuración actual de la máquina:");

        
        for (Celda celda : this.celdas) {
            System.out.println(celda.getCodigo());
        }
    }

    public Celda buscarCelda(String codigoCelda) {
        for (Celda celda : this.celdas) {
            if (celda.getCodigo().equals(codigoCelda)) {
                return celda;
            }
        }
        return null; 
    }

     public void cargarProducto(Producto producto, String codigoCelda, int cantidadInicial) {
        
        Celda celdaRecuperada = buscarCelda(codigoCelda);

        
        if (celdaRecuperada != null) {
           
            celdaRecuperada.ingresarProducto(producto, cantidadInicial);
        } else {
            System.out.println("No se encontró la celda con código: " + codigoCelda);
        }
    }

    
    public void mostrarProductos() {
        System.out.println("Productos en la máquina:");

        for (Celda celda : this.celdas) {
            System.out.println("Celda: " + celda.getCodigo());
            System.out.println("Stock actual: " + celda.getStock());

            Producto productoEnCelda = celda.getProducto();
            if (productoEnCelda != null) {
                System.out.println("Nombre: " + productoEnCelda.getNombre());
                System.out.println("Precio: " + productoEnCelda.getPrecio());
            } else {
                System.out.println("No hay producto en esta celda.");
            }

            System.out.println("------------------------------");
        }
    }

    public Producto buscarProductoEnCelda(String codigoCelda) {
        Celda celda = buscarCelda(codigoCelda);

        if (celda != null) {
            return celda.getProducto();
        } else {
            System.out.println("No existe la celda con código: " + codigoCelda);
            return null;
        }
    }

    public double consultarPrecio(String codigoCelda) {
        Celda celda = buscarCelda(codigoCelda);

        if (celda != null) {
            Producto producto = celda.getProducto();

            if (producto != null) {
                return producto.getPrecio();
            } else {
                System.out.println("La celda " + codigoCelda + " no tiene un producto asignado.");
                
                return -1;
            }
        } else {
            System.out.println("No existe la celda con código: " + codigoCelda);
            
            return -1;
        }
    }

    public Celda buscarCeldaProducto(String codigoProducto) {
        for (Celda celda : celdas) {
            Producto producto = celda.getProducto();
            if (producto != null && producto.getCodigo().equals(codigoProducto)) {
                return celda;
            }
        }
        System.out.println("No se encontró la celda que contiene el producto con código: " + codigoProducto);
        return null;
    }


    public void incrementarProductos(String codigoProducto, int cantidadIncremento) {
        Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);

        if (celdaEncontrada != null) {
            int stockActual = celdaEncontrada.getStock();
            celdaEncontrada.setStock(stockActual + cantidadIncremento);
            System.out.println("Stock incrementado en la celda " + celdaEncontrada.getCodigo() + ": " + celdaEncontrada.getStock());
        } else {
            System.out.println("No se encontró la celda que contiene el producto con código: " + codigoProducto);
        }
    }

   

   
    public void vender(String codigoCelda) {
        Celda celda = buscarCelda(codigoCelda);

        if (celda != null) {
            Producto producto = celda.getProducto();

            if (producto != null && celda.getStock() > 0) {
            
                celda.setStock(celda.getStock() - 1);

               
                double precioProducto = producto.getPrecio();
                saldo += precioProducto;

                System.out.println("Producto vendido en la celda " + codigoCelda + ". Nuevo saldo: " + saldo);
            } else {
                System.out.println("La celda " + codigoCelda + " no tiene stock o no tiene un producto asignado.");
            }
        } else {
            System.out.println("No se encontró la celda con código: " + codigoCelda);
        }
    }



    public double venderConCambio(String codigoCelda, double valorIngresado) {
        Celda celda = buscarCelda(codigoCelda);

        if (celda != null) {
            Producto producto = celda.getProducto();

            if (producto != null && celda.getStock() > 0) {
                
                double precioProducto = producto.getPrecio();

                if (valorIngresado >= precioProducto) {
                    
                    celda.setStock(celda.getStock() - 1);

                  
                    saldo += precioProducto;

                 
                    double cambio = valorIngresado - precioProducto;
                    System.out.println("Producto vendido en la celda " + codigoCelda + ". Cambio entregado: " + cambio);
                    return cambio;
                } else {
                    System.out.println("El valor ingresado no es suficiente para comprar el producto en la celda " + codigoCelda);
                }
            } else {
                System.out.println("La celda " + codigoCelda + " no tiene stock o no tiene un producto asignado.");
            }
        } else {
            System.out.println("No se encontró la celda con código: " + codigoCelda);
        }

        return -1; 
    }

    public List<Producto> buscarMenores(double limite) {
        List<Producto> productosMenores = new ArrayList<>();

        for (Celda celda : celdas) {
            Producto producto = celda.getProducto();

            if (producto != null && producto.getPrecio() <= limite) {
                productosMenores.add(producto);
            }
        }

        return productosMenores;
    }
  

    
}
