package main;

import java.util.ArrayList;
import java.util.List;

public class Frase {
	List<Palavra> palavras = new ArrayList<>();

	public void adicionarPalavra(Palavra palavra) {
	    if (palavra == null) {
	        throw new IllegalArgumentException("Uma frase deve ter no mínimo uma palavra.");
	    }
	        palavras.add(palavra);
	}
	
}