/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cruinventario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author ethan
 */
public class mCliente {
    
    public void insertar(String cadenaArticulo){
        
    try {
       FileWriter archivo = new FileWriter("listado_clientes.txt" , true);
        BufferedWriter buffer = new BufferedWriter(archivo);
            
        buffer.write(cadenaArticulo); 
        buffer.newLine(); 
        buffer.close();

    } catch (IOException e) {
        }
    }
    
    public ArrayList<String> consultar(){
    ArrayList<String> listaRegistros = new ArrayList<>();
        
    try(BufferedReader br = new BufferedReader( new FileReader("listado_clientes.txt"))) {
        String linea;
        while((linea = br.readLine()) != null) {
            String[] datos = linea.split("\\|");
            String datoBonito = "No.Cliente: " + datos[0] + " Nombre: " + datos[1] + " Tipo de Cliente: " + datos[2] + " Razon Social: " + datos[3];
            listaRegistros.add(datoBonito);
        }
        } catch (IOException e) {
        System.out.println("Mensaje de error" + e.getMessage());
        listaRegistros.add("Error al cargar los datos");
    }
     return listaRegistros;
        
    }
}