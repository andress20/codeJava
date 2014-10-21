package Control;

import Model.Matriz;
import Model.MultiplicaMatriz;
import View.InOut;

public class Controler {
	
	public Controler(int opc){
		InOut io = new InOut();
		switch (opc){
		case 1:
			io.mostrarInf("Matriz A");
			Matriz A = new Matriz();
			A.llenarMatriz();
			io.mostrarInf("Matriz B");
			Matriz B = new Matriz();
			B.llenarMatriz();
			MultiplicaMatriz multi = new MultiplicaMatriz();
			if(!multi.sonMultiplicables(A, B)){
				io.mostrarInf("Numero de columnas de A no es igual al numero de Filas de B");
				break;
			}else{
				multi.ejecutaMultiplicacion(A, B);
				io.mostrarInf(multi.recorreMatrizProducto());
			}
			break;
			
		}
	}

}
