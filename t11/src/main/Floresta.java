package main;

import java.util.ArrayList;
import java.util.List;

public class Floresta {
	List<Arvore> arvores = new ArrayList<>();

	public void adicionarArvore(Arvore arvore) {
	    if (arvore == null) {
	        throw new IllegalArgumentException("Uma floresta deve ter no mínimo uma árvore.");
	    }
	    
	    arvores.add(arvore);
	}
}
