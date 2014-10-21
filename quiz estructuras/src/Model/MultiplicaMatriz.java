package Model;

//import View.InOut;
import Model.Matriz;

public class MultiplicaMatriz {
	
	private int[][] matrizProducto;
	
	public MultiplicaMatriz(){
		
	}
	
	public void ejecutaMultiplicacion(Matriz a, Matriz b){
		matrizProducto = new int[a.getTamanoMatrizN()][b.getTamanoMatrizM()];
		int valor = 0;
		for(int i=0;i<a.getTamanoMatrizN();i++){
			for(int j=0;j<a.getTamanoMatrizN();j++){
				for(int k=0;k<a.getTamanoMatrizN();k++){
					valor = valor + (a.traerElemento(i, k))*(b.traerElemento(k, j));
				}
				matrizProducto[i][j]=valor;
				valor=0;
			}
			
		}
	}
	
	public boolean sonMultiplicables(Matriz a, Matriz b){
		if(a.getTamanoMatrizM() == b.getTamanoMatrizN()){
			return true; 
		}
		return false;
	}
	
	public String recorreMatrizProducto(){
		String resultado = "";
		for(int i=0; i<matrizProducto.length;i++){
			for(int j=0;j<matrizProducto[i].length;j++){
				resultado = resultado + "[" + matrizProducto[i][j] + "]  ";
			}
			resultado = resultado + "\n";
		}
		return resultado;
	}

	public int[][] getMatrizProducto() {
		return matrizProducto;
	}

	public void setMatrizProducto(int[][] matrizProducto) {
		this.matrizProducto = matrizProducto;
	}

}
