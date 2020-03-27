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
        inventario = new String[100][8];
    }

    public void setNewItem(String marca,String tipo,Double precio,int cantidad,String fechaVencimiento){
        int newid = getNextID();
        inventario[newid][0] = String.valueOf(newid);   // Llave Identificadora
        inventario[newid][1] = marca;                   // Marca
        inventario[newid][2] = tipo;                    // Tipo de Producto
        inventario[newid][3] = String.valueOf(precio);  // Precio
        inventario[newid][4] = String.valueOf(cantidad);// Cantidad que Ingreso
        inventario[newid][5] = fechaVencimiento;        // Fecha de Vencimiento
        inventario[newid][6] = "N";                     // Hay Stock
        inventario[newid][7] = String.valueOf(cantidad);// Cantidad Disponible
    }
    
    public int getNextID(){
        return id++;
    }
    
    public String[][] getArray(){
        return inventario;
    }
    
    public void deleteProducto(String datoPorBuscar){
       for(int i=0;i<inventario.length;i++){
             for(int j=0;j<inventario[i].length;j++){
                 if(inventario[i][j]==datoPorBuscar){
                      inventario[i][6] = "Y";
                      inventario[i][7] = "0";
                    
                 }
                
             }
         }
    }
    public void updateProducto(String datoPorBuscar,int cantidad){
       for(int i=0;i<inventario.length;i++){
             for(int j=0;j<inventario[i].length;j++){
                 if(inventario[i][j]==datoPorBuscar){
                     inventario[i][7] = String.valueOf(cantidad);
                        if(cantidad == 0){
                            inventario[i][6] = "Y";
                        }
                 }
                
             }
         }
    }
    
    
}
