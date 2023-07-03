package main;

import java.util.ArrayList;
import java.util.List;

public class Compartimento {
	List<Livro> livros = new ArrayList<>();
    List<CD> cds = new ArrayList<>();
    
    public void adicionarLivros(Livro livro) {
    	if(livros.size() < 3) {
    		livros.add(livro);
    	} else {
    		System.out.println("Não é possível adicionar mais de três livros em um compartimento.");
    	}
    }
    
    public void adicionarCDs(CD cd) {
    	int qtdCDs = cds.size();
    	
    	if((qtdCDs < 2) || (qtdCDs > 2 && qtdCDs < 4) || (qtdCDs > 4 && qtdCDs < 7)) {
    		throw new IllegalArgumentException("Um compartimento deve guardar 2, 4, 7 ou mais CDs.");
    	} 	
    }
    
}
