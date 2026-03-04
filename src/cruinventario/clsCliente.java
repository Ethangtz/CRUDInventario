/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cruinventario;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author ethan
 */
public class clsCliente {
    private Integer Nocliente;
    private String Nombre;
    private String Tipo;
    private String Razon;
    
    public clsCliente(Integer nocliente , String nombre, String precio , String razon){
        this.Nocliente = nocliente;
        this.Nombre = nombre;
        this.Tipo = precio;
        this.Razon = razon;
    }
    

public clsCliente(){

    }

 public String aTexto(){
        String cliente = this.Nocliente + "|" + this.Nombre + "|" + this.Tipo + "|" + this.Razon;
        return cliente;
    }
    
    public void guardar() {
        
        mCliente cliente = new mCliente();
        cliente.insertar(this.aTexto());
        
        System.out.println(this.aTexto());
    }
    
    public DefaultListModel<String> LlenarLista(){
    mCliente mClient = new mCliente();
    ArrayList<String> datos = mClient.consultar();
    DefaultListModel<String> modelLista = new DefaultListModel();
    for ( String registro: datos){
        modelLista.addElement(registro);
    }
    return modelLista;
    }
    
}
