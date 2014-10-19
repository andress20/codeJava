package Controler;

import Model.Matriz;
import View.InOut;
import java.util.regex.*;

public class Ejecutar {
	
	
	
	public static void main(String[] args){
		InOut io = new InOut();
		int opc = io.mostrarMenu();
		Controler controler = new Controler(opc);
		
		
	}
	
	

}
