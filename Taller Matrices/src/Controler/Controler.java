package Controler;

import View.InOut;
import Model.Matriz;

public class Controler {
	
	public Controler(){
		
	}
	
	public Controler(int opc){
		InOut io = new InOut();
		Matriz m= new Matriz(3,4);
		switch (opc){
			case 1: 
				m.llenarMatriz();
//				m.llenarMatrizRandom();
				m.mostrarMatriz();
				io.mostrarInf("la suma dio: " + m.sumarElementos());
				io.mostrarInf("La multiplicacion dio: "+m.multiplicaElementos());
				break;
			case 2:
				m.llenarMatrizRandom();
//				m.llenarMatriz();
				m.mostrarMatriz();
				io.mostrarInf("El mayor elemento es: " + m.elementoMayor());
				io.mostrarInf("El menor elemento es: "+ m.elementoMenor());
				break;
			case 3: 
				m.llenarMatrizRandom();
//				m.llenarMatriz();
				m.mostrarMatriz();
				m.mayorSumatoriaFilasyColumnas();
				
				
		}
			 
				
	}

}
