/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/**
 *
 * @author ingenieria
 */
public class InOut {
    
    public InOut(){
		
	}
	
	public String pedirInf(String str){
		return JOptionPane.showInputDialog(str);
	}
	public void mostrarInf(String mostrar){
		JOptionPane.showMessageDialog(null, mostrar); 
	}
	
	public int mostrarMenu(){
		//EstudianteEstrella e = new EstudianteEstrella();
        String a="";
             
        a=a +"1. Multiplicar Matrices \n";
        a=a +"2. Salir \n\n";
        
        String opc = pedirInf(a + "Eliga una opcion");
        while (!validarOpcionMenu(opc)){
        	mostrarInf("Solo puedes ingresar numeros en el rango de opciones");
        	opc = pedirInf(a + "Eliga una opcion");
        }
        return Integer.parseInt(opc);
    }
	public static boolean validarOpcionMenu(String criterio){
		Pattern pat = Pattern.compile("[0-2]");
		Matcher mat = pat.matcher(criterio);
		if(mat.matches()){
			return true;
		}else{
			return false;
		}
	}
    
}
