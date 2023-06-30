package interface_usuario;

import java.util.ArrayList;
import java.util.List;

public class JanelaGrafica {
	private List<ElementosDeInteracao> elementos = new ArrayList<>();
	
	public void addElemento(ElementosDeInteracao elemento) {
        elementos.add(elemento);
    }
	
    public void destruir() { 
        for (ElementosDeInteracao elemento : elementos) {
            elemento.destruir();
        }
    }
	
}