package Model;

import View.InOut;
import Model.Matriz;

public class MultiplicaMatriz {
	
	private int[][] matrizProducto;
	
	public MultiplicaMatriz(){
		
	}
	
	public MultiplicaMatriz(Matriz a, Matriz b){
		matrizProducto =
	}
	
	public boolean sonMultiplicables(Matriz a, Matriz b){
		if(a.getTamanoMatrizM() == b.getTamanoMatrizN()){
			return true; 
		}
		return false;
	}

}
