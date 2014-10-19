/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

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
             
        a=a +"1. Sumar y Multiplicar \n";
        a=a +"2. Elementos Mayor y Menor \n";
        a=a +"3. Mayor sumatoria fila y columna \n";
        a=a +"4. Diagonal Secundaria \n";
        a=a +"5. Elementos Positivos y Negativos \n";
        a=a +"6. Cinco numeros en la Matriz \n";
        a=a +"7. Transpuesta \n";
        a=a +"8. Frecuencia Vocal \n";
        a=a +"9. Frase conteo letras \n";
        a=a +"10. Cuadrado Magico \n\n";
        
        return Integer.parseInt(pedirInf(a + "Eliga una opcion"));
    }
    
}
