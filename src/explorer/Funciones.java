/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package explorer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Funciones {
    private File mifile=null;
    
    public void setFile(String direccion){
        mifile=new File(direccion);
    }
    
    public void crearFile()throws IOException{
        mifile.createNewFile();
    }

    public void crearFolder(){
        mifile.mkdirs();
    }
    
    public void cambiarNombre(File nombre){
        if(mifile.exists()){
            mifile.renameTo(nombre);
        }else{
            JOptionPane.showMessageDialog(null, "Este file no existe.");
        }
    }
    
    public void registrarDatos(String datos)throws IOException{
        if(mifile.exists()){
            if(!mifile.isDirectory()){
                FileWriter file=new FileWriter(mifile);
                file.write(datos);
                file.close();
            }else{
                JOptionPane.showMessageDialog(null, "Este no es un archivo.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Este file no existe.");
        }
    }
}