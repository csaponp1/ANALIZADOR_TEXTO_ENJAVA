/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejo_cadenas;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Sapón Pérez
 */
public class Analizar_texto {
    
    
    char c;
    int num=0;
    int cantidad_palabras;
    String str="";
    
    
    
        
    //constructor
     Analizar_texto(){};

    //metodo1
    public int palabras_longitud(String s){
        int cant=0;
        cant = s.length();
        return cant;
    }
     
    //metodo2
    public int palabras_numero(String s){
        String aux;
        
        int cant=0;
        
        for(int i =0; i<s.length();i++){
            if(s.charAt(i)==' '){
                cant++;
            }
        }
        this.cantidad_palabras=cant;
        return cant+1;
    };
    
    //metodo3
    public char caracter_primera(String s){
        
        char primera;
        primera = s.charAt(0);
        return primera;
    }
    
    //metodo4
    public char caracter_ultima(String s){
        char ultima;
        ultima =s.charAt(s.length()-1);
        return ultima;
    }
    
    //metodo5
    public char caracter_central(String s){
        char aux;
        if(s.length()%2==1){
            aux=s.charAt((s.length()/2));
        }
        else{
            aux='x';
        }
        return aux;
    }
    
    //metodo6
    public String palabra_primera(String s){
        String aux="";
        for(int i = 0; i<=s.length();i++){
            if(s.charAt(i)==' ') {
                break;
                
            }
            
            aux+= s.charAt(i);
        }
         return aux;
    }
    
    //metodo7 
    public String palabra_central(String s){
        int contadorfinal=0;
        int contadorfinal2=0;
        String resultado;
        StringBuilder p = new StringBuilder(s);
        
       
            
                for(int j = 0; j < p.length()/2;j++ ){
                    if(p.charAt(j)!=' ' ){
                        contadorfinal++;
                        
                    }
                    else{
                        p.delete(0, contadorfinal+1);
                        contadorfinal++;

                    }
            }
        

           
        for(int i = 0 ; i < p.length();i++){
            if(p.charAt(i)!=' '){
                contadorfinal2++;
            }
            else break;
        }
        resultado = p.substring(0, contadorfinal2);
        return resultado;
        
        
    };
    

    //metodo8
    public String palabra_ultima(String s){
        String aux="";
         String resultado="";
        for(int i = s.length()-1;i>0;i--){
            if(s.charAt(i)==' ') {
                break;
            }
            
            aux+=s.charAt(i);
            
        }
        
        //ordenamos la palabra
       
        for(int i = aux.length()-1;i>=0;i--){
            resultado+=aux.charAt(i);
        }
        return resultado;
    }
    
    //metodo 9
    public int numero_vocal_a(String s){
        
        int contador=0;
        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='a' || s.charAt(i)=='á'){
                contador++;
            }
        }
        return contador;
    }
    
    //metodo 10
    public int numero_vocal_e(String s){
        
        int contador=0;
        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i)=='E' || s.charAt(i)=='e' || s.charAt(i)=='é'){
                contador++;
            }
        }
        return contador;
    }
    
    //metodo 11
    public int numero_vocal_i(String s){
        
        int contador=0;
        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i)=='I' || s.charAt(i)=='i' || s.charAt(i)=='í'){
                contador++;
            }
        }
        return contador;
    }
    
    //metodo 12
    public int numero_vocal_o(String s){
        
        int contador=0;
        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i)=='O' || s.charAt(i)=='o' || s.charAt(i)=='ó'){
                contador++;
            }
        }
        return contador;
    }
    
    //metodo 13
    public int numero_vocal_u(String s){
        
        int contador=0;
        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i)=='U' || s.charAt(i)=='u' || s.charAt(i)=='ú'){
                contador++;
            }
        }
        return contador;
    }
    
    //metodo 14
    public String murcielago (String s){
        String res;
        StringBuilder str = new StringBuilder(s);
        
        for(int i = 0 ; i<str.length();i++){
            char aux = str.charAt(i);
            
            switch (aux){
                case 'm':
                    str.setCharAt(i,'0');
                break;
                
                case 'M':
                    str.setCharAt(i,'0');
                break;
                
                case 'u':
                    str.setCharAt(i,'1');
                break;
                
                case 'U':
                    str.setCharAt(i,'1');
                break;
                
                case 'r':
                    str.setCharAt(i,'2');
                break;
                
                case 'R':
                    str.setCharAt(i,'2');
                break;
                
                case 'c':
                    str.setCharAt(i,'3');
                break;
                
                case 'C':
                    str.setCharAt(i,'3');
                break;
                
                case 'i':
                    str.setCharAt(i,'4');
                break;
                
                case 'I':
                    str.setCharAt(i,'4');
                break;
                
                case 'e':
                    str.setCharAt(i,'5');
                break;
                
                case 'E':
                    str.setCharAt(i,'5');
                break;
                
                case 'l':
                    str.setCharAt(i,'6');
                break;
                
                case 'L':
                    str.setCharAt(i,'6');
                break;
                
                case 'a':
                    str.setCharAt(i,'7');
                break;
                
                case 'A':
                    str.setCharAt(i,'7');
                break;
                
                case 'g':
                    str.setCharAt(i,'8');
                break;
                
                case 'G':
                    str.setCharAt(i,'8');
                break;
                
                case 'o':
                    str.setCharAt(i,'9');
                    break;
                
                case 'O':
                    str.setCharAt(i,'9');
                break;              
            }
        }
        res= str.toString();
        return res;
    }
    
    //metodo 15
    public int palabras_pares(String s){
        int contador=0;
        
        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i)==' '){
                if(i%2==0){
                    contador++;
                     i++;
                }
               
            }
        }
        return contador;
    }
    
    //metodo 16
     public int palabras_impares(String s){
        int contador=0;
        
        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i)==' '){
                if(i%2==1){
                    contador++;
                    i++;
                }
                
            }
        }
        return contador;
    }
    
    /*** public void palabra_buscar(String s){
        ventana2.setVisible(true);// abrimos el dialog
        this.str=ventana2.getPalabra();

        int posicion=0;
        
        for(int i = 0; i<s.length();i++){
            
            posicion = s.indexOf(str, i);
            if(posicion!= -1){
                System.out.println(posicion);
            }
            
            
        }
        
     }
     **
     */
   
    
 
   
}
