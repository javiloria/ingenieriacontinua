/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingenieria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 Dao
 */
public class BDJson implements Archivo{

    File archivo = new File ("/home/jorge/Documentos/ssssssssssssssssssssssssss/ingenieria/src/ingenieria/archivo.txt");
    @Override
    public void escribir(Cliente c) {
       
    
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("/home/jorge/Documentos/ssssssssssssssssssssssssss/ingenieria/src/ingenieria/archivo.txt");
            pw = new PrintWriter(fichero);

            pw.println("cedula:"+c.getCedula());
            pw.println("id:"+c.getId());
            pw.println("nombre:"+c.getNombre());
            pw.println("apellido:"+c.getApellido());
            pw.println("fecha:"+c.getFecha());
            pw.println("ultimaCompra:"+c.getUltimaCompra());
            pw.println("usuario");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    
    }

    @Override
    public Cliente leer( long id) {
         Cliente c=null;
     File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      String total="";
     long id2;
       String[] separador;
 
boolean guardo=false;
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("/home/jorge/Documentos/ssssssssssssssssssssssssss/ingenieria/src/ingenieria/archivo.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         
         while((linea=br.readLine())!=null){

            
         if(linea.equals("usuario")){
             String[] parts = total.split(" ");
             for(int i=1; i<7; i++){
                 //System.out.println(parts[i]);
              
                      separador = parts[i].split(":");
                 if(i==1){
                     id2=Long.valueOf(separador[1]).longValue();
                      if(id2==id){
                          guardo=true;
                          c = new Cliente();
                          c.setCedula(Long.valueOf(separador[1]).longValue());
                      }
                 }
                      
                     if((i==2 )&& (guardo== true)){
                          c.setId( Integer.parseInt(separador[1]));
                          
                 }
                  
                     if((i==3) && (guardo== true)){
                          c.setNombre(separador[1]);
                 }
                  
                     if(i==4 && guardo== true){
                          c.setApellido(separador[1]);
                 }
                 
                     if(i==5 && guardo== true){
                          c.setFecha(Integer.parseInt(separador[1]));
                 }
               
                     if(i==6 && guardo== true){
                          c.setUltimaCompra(Integer.parseInt(separador[1]));
                 }
                 
                 
                 
             }
                
       
            
         total="";
        if(guardo==true)
              return c;
         }
         else total= total+" "+linea;
         }
          if(linea==null)
          throw new ExcepcionIntervalo("No se encontro");
      }
      catch(ExcepcionIntervalo ex){
           c=new Cliente();
        }
      catch(Exception e){
          
         e.printStackTrace();
         
      }
      finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();
               return c;
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      return c;
   }
}

    
