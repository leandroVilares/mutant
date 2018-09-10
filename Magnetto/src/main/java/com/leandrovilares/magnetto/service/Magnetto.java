package com.leandrovilares.magnetto.service;
import java.util.ArrayList;

/*
ATGCGA
CAGTGC
TTATGT
AGAAGG
CCCCTA
TCACTG
 */
public class Magnetto {
	public Magnetto() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*public static void main(String[] args) {
		String[] dna = {"ATYCGA","CAGUGC","TTATUT","AGOGGG","CTACTA","TCAUTG"};
		//String[] dna = {"CCCCTA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};
		System.out.println(verificarMutanteLouco(dna));
	}
*/
	public  boolean verificarMutanteLouco(String[] dna ) {

		if(transformLetrasLinha(dna)) {
			return true;
		}
		if(transformLetraDiagonalAtras(dna)) {
			return true;
		}
		if(transformLetraDiagonal(dna)) {
			return true;
		}
		if(transformLetraColuna(dna)) {
			return true;
		}

		return false;

	}

	private  boolean transformLetrasLinha(String[] dna) {
		boolean ismutante = false;
		String[] vetorLetras = null;
		//tranformar cada letra em um vetor 
		int TAM = dna.length;
		for (int x=0 ; x < TAM ; x++) {
			vetorLetras = new String[TAM];
			String palavra = dna[x];
			for(int i=0 ; i< palavra.length();i++) {
				char letra =palavra.charAt(i);
				vetorLetras[i]=letra+"";

			}
			ismutante = verificarVetorLetrasRepetidas(vetorLetras);
			if(ismutante) {
				break;
			}



		}
		return ismutante;
	}

	private  boolean transformLetraDiagonalAtras(String[] dna) {

		//tranformar cada letra em um vetor 
		boolean ismutante = false;
		int verificadorPalavraDiagonalAtras = 0 ;
		int verificadorVetor =0;
		verificadorPalavraDiagonalAtras = dna.length -1;
		String vetorLetras[]= null;
		vetorLetras = new String[dna.length];
		for (int i=dna.length -1 ; i>=0 ;i--) {
			String palavra = dna[i] ;
			char[] letras= palavra.toCharArray();
			
			for(int y=0 ; y< letras.length;y++) {
				if(verificadorPalavraDiagonalAtras == i) {
					char letra =palavra.charAt(i);
					vetorLetras[i] = letra+"";
					System.out.println(letra);
					verificadorPalavraDiagonalAtras = verificadorPalavraDiagonalAtras -1;
				}
			}


		}
		ismutante = verificarVetorLetrasRepetidas(vetorLetras);

		return ismutante;
	}



	private  boolean transformLetraDiagonal(String[] dna) {

		//tranformar cada letra em um vetor 
		boolean ismutante = false;
		String vetorLetras[] =new String[dna.length];
		for (int i=0 ; i< dna.length;i++) {
			String palavra = dna[i] ;
			char[] letras= palavra.toCharArray();

			for(int y=0 ; y< letras.length; y++) {
				if(i == y) {
					char letra =palavra.charAt(y);
					vetorLetras[y] = letra+"";

				}

			}


		}
		ismutante = verificarVetorLetrasRepetidas(vetorLetras);

		return ismutante;
	}

	private  boolean transformLetraColuna(String[] dna) {
		boolean ismutante = false;
		ArrayList<String> vetorColunas = new ArrayList<String>();
		//tranformar cada letra em um vetor 
		int verificadorColuna=0;
		int verificadorPalavra = 0 ;
		verificadorPalavra = 0;
		for (int x =0 ; x<dna.length; x++) {
			String vetorLetras[] = new String[dna.length];

			for (int i=0 ; i< dna.length;i++) {

				String palavra = dna[i] ;
				char[] letras= palavra.toCharArray();
				for(int y=0 ; y< letras.length;y++) {
					if(verificadorPalavra == y) {
						char letra =palavra.charAt(y);
						vetorLetras[i] = letra+"";
						System.out.println(letra);
					}

				}

			}
			verificadorPalavra = verificadorPalavra + 1;
			ismutante = verificarVetorLetrasRepetidas(vetorLetras);
			if(ismutante) {
				break;
			}

		}



		return ismutante;

	}

	public  boolean verificarVetorLetrasRepetidas(String[] vetorLetras){
		int mutante = 1;
		int tamanho = vetorLetras.length;
		for(int i=0 ; i < vetorLetras.length; i++) {


			if( i < tamanho -1 ) {
				String compare = vetorLetras[i] ;
				String compareII =vetorLetras[i+1];
				if(compare.equals(compareII)) {
					mutante =mutante+1;
				}
			}
		}


		if(mutante >= 4) {

			return true;
		}else {
			return false;
		}
	}
}
