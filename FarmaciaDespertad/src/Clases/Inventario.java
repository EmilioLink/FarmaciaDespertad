/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author emili
 */
public class Inventario {
    static int id = 0;
    //String marca, tipo;
    //Double precio;
   // int cantidadDisponible;
    //Date fechaVencimiento,fechaIngreso;
    static String[][] inventario;

    public Inventario() {
        inventario = new String[100][6];
    }

    public void setNewItem(String marca,String tipo,Double precio,int cantidad,String fechaVencimiento){
        int newid = getNextID();
        inventario[newid][0] = String.valueOf(newid);
        inventario[newid][1] = marca;
        inventario[newid][2] = tipo;
        inventario[newid][3] = String.valueOf(precio);
        inventario[newid][4] = String.valueOf(cantidad);
        inventario[newid][5] = fechaVencimiento;
    }
    
    public int getNextID(){
        return id++;
    }
    
    public String[][] getArray(){
        return inventario;
    }
    
    
}
