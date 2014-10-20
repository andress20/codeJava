package Controler;

import Model.Matriz;
import View.InOut;

import java.util.regex.*;

public class Ejecutar {
	
	
	
	public static void main(String[] args){
		InOut io = new InOut();
		int opc = io.mostrarMenu();
//		Matriz matriz = new Matriz();
		if(opc==11){
			System.exit(0);
		}
		while (io.validarOpcionMenu(String.valueOf(opc))){
			if(opc==0||opc>11){
				io.mostrarInf("opción no válida");
				opc = io.mostrarMenu();
			}else if (opc==11){
				System.exit(0);
			}else{
				Controler controler = new Controler(opc);
				opc = io.mostrarMenu();
			}
		}
		System.exit(0);
		
		
	}
	
	
	
	

}
