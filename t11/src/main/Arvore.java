package main;

import java.util.ArrayList;
import java.util.List;

public class Arvore {
	List<Floresta> florestas = new ArrayList<>();
	Folha[] folhas;

	public void adicionarFloresta(Floresta floresta) {
		if (floresta == null) {
	        throw new IllegalArgumentException("Uma árvore deve estar em pelo menos uma floresta");
		}
		
	    florestas.add(floresta);
	}

}