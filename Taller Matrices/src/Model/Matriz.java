package Model;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import View.InOut;

public class Matriz {
	
//	ATRIBUTOS
	
	private int tamanoMatrizN;
	private int tamanoMatrizM;
	private int[][] matriz;
	
	
//	Constructor por defecto
	public Matriz(){
		
	}
	
//	Constructor con parametros
	public Matriz(int n, int m){
		this.matriz = new int [n][m];
		this.tamanoMatrizN = n;
		this.tamanoMatrizM = m;
	}
	
	public void llenarMatriz(){
		InOut io = new InOut();
		io.mostrarInf("Ingrese valores para la matriz (por filas)");
		for(int i=0; i<matriz.length;i++){
			for(int j=0; j<matriz[i].length;j++){
				String numeroIn = io.pedirInf("ingrese valor " + i + j +" :");
					while(!validarElementosMatriz(numeroIn)){
						io.mostrarInf("Debe ingresar números de 2 digitos unicamente!");
						numeroIn = io.pedirInf("ingrese valor " + i + j +" :");
					}
				matriz[i][j]= Integer.parseInt(numeroIn);
				}
				
			}
	}
	
	public void llenarMatrizRandom(){
		Random r = new Random();
		InOut io = new InOut();
		io.mostrarInf("Se ingresaran valores aleatorios en la matriz.");
		for(int i=0; i<matriz.length;i++){
			for(int j=0; j<matriz[i].length;j++){
				matriz[i][j]= r.nextInt(20);
			}
		}
	}
	
	
	public void mostrarMatriz(){
		InOut io = new InOut();
		String strMatriz = new String("");
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				strMatriz = strMatriz + "[" + matriz[i][j] + "]   "; 
			}
			strMatriz = strMatriz + "\n";
		}
		io.mostrarInf(strMatriz);
	}
	
	public int sumarElementos(){
		int resultado =0;
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				resultado = resultado + matriz[i][j];
			}
		}
		return resultado;
	}
	
	public long multiplicaElementos(){
		long resultado=1;
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				resultado = (resultado * matriz[i][j]);
			}
		}
		return resultado;
	}
	
	public boolean validarElementosMatriz(String criterio){
		Pattern pat = Pattern.compile("[0-9]|[0-9][0-9]");
		Matcher mat = pat.matcher(criterio);
		if(mat.matches()){
			return true;
		}else{
			return false;
		}
	}
	
	public int elementoMayor(){
		int mayor =0;
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				if(matriz[i][j]>mayor){
					mayor = matriz[i][j]; 
				}
			}
		}
		return mayor;	
	}
	public int elementoMenor(){
		int menor=20;
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				if(matriz[i][j]<menor){
					menor = matriz[i][j]; 
				}
			}
		}
		return menor;
	}
	public void mayorSumatoriaFilasyColumnas(){
		InOut io = new InOut();
		int sumatoriaFila =0;
		int sumatoriaColumna =0;
		int[] filas = new int[tamanoMatrizN];
		int[] columnas = new int[tamanoMatrizM];
		
//		Hago sumatorias por filas
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				filas[i]+= matriz[i][j];
				columnas[j] += matriz[i][j];
				
			}
		}
////    determino cual es la mayor de las sumatorias
		for(int i=0;i<filas.length;i++){
			if(filas[i]>sumatoriaFila){
				sumatoriaFila = filas[i];
			}
		}
		for (int i = 0; i < columnas.length; i++) {
			if (columnas[i] > sumatoriaColumna) {
				sumatoriaColumna = columnas[i];
			}
		}
		io.mostrarInf("El mayor elemento de las filas es " + sumatoriaFila + " y el de columnas es: " + sumatoriaColumna);
	}
	
}
