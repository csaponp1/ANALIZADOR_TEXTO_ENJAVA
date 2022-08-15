/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejo_cadenas;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Sapón Pérez
 */
public class Fichero {
    final String fich="C:\\Users\\willy\\Documents\\NetBeansProjects\\Manejo_Cadenas\\fichero.txt";
    
    String aux="";
    public void leer(){
        if(!(new File(fich)).exists())
        {
            System.out.println("No he encontrado fichero.txt");
            return;
        }
        
        System.out.println("Leyendo fichero de texto...");
        
        try{
            BufferedReader ficheroEntrada = new BufferedReader(
                    
            new FileReader(new File(fich)));
            
            String linea = null;
            while ((linea=ficheroEntrada.readLine()) != null) {
                System.out.println(linea);
                aux += linea+"\n";
            }
 
            ficheroEntrada.close();
        }
        catch (IOException errorDeFichero)
        {
            System.out.println(
                "Ha habido problemas: " +
                errorDeFichero.getMessage() );
        }
    }

    
    public void escribir(double n1, double n2,char a){
    {
        System.out.println("Volcando a fichero de texto...");
        double aux= 0;
 
        try
        {
             String filePath = fich;
            FileWriter fw = new FileWriter(filePath, true); // si le quitamos el true va a sobreescribir
            BufferedWriter ficheroSalida = new BufferedWriter(fw);
            
            
            switch(a){
                case('+'):
                ficheroSalida.write(String.valueOf(n1));
                ficheroSalida.newLine();
                ficheroSalida.write(String.valueOf(n2));
                ficheroSalida.newLine();
                ficheroSalida.write("+");
                aux=n1+n2;
                ficheroSalida.newLine();
                ficheroSalida.write(String.valueOf(aux));
                ficheroSalida.newLine();
                ficheroSalida.write("------------------------\n");
                break;
                
                case('-'):
                ficheroSalida.write(String.valueOf(n1));
                ficheroSalida.newLine();
                ficheroSalida.write(String.valueOf(n2));
                ficheroSalida.newLine();
                ficheroSalida.write("-");
                aux=n1-n2;
                ficheroSalida.newLine();
                ficheroSalida.write(String.valueOf(aux));
                ficheroSalida.newLine();
                ficheroSalida.write("------------------------\n");
                break;
                
                case('*'):
                ficheroSalida.write(String.valueOf(n1));
                ficheroSalida.newLine();
                ficheroSalida.write(String.valueOf(n2));
                ficheroSalida.newLine();
                ficheroSalida.write("*");
                aux=n1*n2;
                ficheroSalida.newLine();
                ficheroSalida.write(String.valueOf(aux));
                ficheroSalida.newLine();
                ficheroSalida.write("------------------------\n");
                break;
                
                case('/'):
                ficheroSalida.write(String.valueOf(n1));
                ficheroSalida.newLine();
                ficheroSalida.write(String.valueOf(n2));
                ficheroSalida.newLine();
                ficheroSalida.write("/");
                aux=n1/n2;
                ficheroSalida.newLine();
                ficheroSalida.write(String.valueOf(aux));
                ficheroSalida.newLine();
                ficheroSalida.write("------------------------\n");
                break;
                
                case('n'):
                    ficheroSalida.newLine();
                    ficheroSalida.write("NUEVO");
                    ficheroSalida.newLine();
                    break;
               
            }
            ficheroSalida.close();
        }
        catch (IOException errorDeFichero)
        {
            System.out.println(
                "Ha habido problemas: " +
                errorDeFichero.getMessage() );
        }
    }
    
    };

   
    
}
