package Control;

import View.InOut;
import Control.Controler;

public class Ejecutar {
	
	public static void main(String[] args){
		InOut io = new InOut();
		int opc = io.mostrarMenu();
		while(io.validarOpcionMenu(String.valueOf(opc))){
			if(opc==0||opc>2){
				io.mostrarInf("opcion no valida!");
				opc = io.mostrarMenu();
			}else if(opc==2){
				System.exit(0);
			}else{
				Controler c = new Controler(opc);
				opc = io.mostrarMenu();
			}
		}
	}

}
