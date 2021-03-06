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
	
	public Matriz(){
		InOut io = new InOut();
		String nTemp = io.pedirInf("Tama�o de la matriz en filas.");
		while(!validarTamanioMatriz(nTemp)){
			io.mostrarInf("debes digitar un numero entre 1 y 20");
			nTemp = io.pedirInf("Tama�o de la matriz en filas.");
		}
		int n = Integer.parseInt(nTemp);
		String mTemp = io.pedirInf("Tama�o de la matriz en columnas.");
		while(!validarTamanioMatriz(mTemp)){
			io.mostrarInf("debes digitar un numero entre 1 y 20");
			mTemp = io.pedirInf("Tama�o de la matriz en columnas.");
		}
		int m = Integer.parseInt(mTemp);
		this.matriz = new int [n][m];
		this.tamanoMatrizN = n;
		this.tamanoMatrizM = m;
	}
	public Matriz(int a, int b){
		matriz = new int [a][b];
		tamanoMatrizN = a;
		tamanoMatrizM = b;
	}
	
	public void llenarMatriz(){
		InOut io = new InOut();
		io.mostrarInf("Ingrese valores para la matriz (por filas)");
		for(int i=0; i<matriz.length;i++){
			for(int j=0; j<matriz[i].length;j++){
				String numeroIn = io.pedirInf("ingrese valor " + i + j +" :");
					while(!validarElementosMatriz(numeroIn)){
						io.mostrarInf("Debe ingresar n�meros de 2 digitos unicamente!");
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
	
	public boolean validarElementosUnSoloDigito(String criterio){
		Pattern pat = Pattern.compile("[0-9]");
		Matcher mat = pat.matcher(criterio);
		if(mat.matches()){
			return true;
		}else{
			return false;
		}
	}
	public boolean validarTamanioMatriz(String criterio){
		Pattern pat = Pattern.compile("[1-9]|[1][0-9]|[2][0]");
		Matcher mat = pat.matcher(criterio);
		if(mat.matches()){
			return true;
		}else{
			return false;
		}
	}
	public int traerElemento(int a, int b){
		return matriz[a][b];
	}

	public int getTamanoMatrizN() {
		return tamanoMatrizN;
	}

	public void setTamanoMatrizN(int tamanoMatrizN) {
		this.tamanoMatrizN = tamanoMatrizN;
	}

	public int getTamanoMatrizM() {
		return tamanoMatrizM;
	}

	public void setTamanoMatrizM(int tamanoMatrizM) {
		this.tamanoMatrizM = tamanoMatrizM;
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}
	
	
}
