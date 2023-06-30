package texto;

import java.util.ArrayList;

public class Texto {
	ArrayList <Paragrafo> paragrafos = new ArrayList<>();
	
	public Texto(Paragrafo p) {
		paragrafos.add(p);
	}
	
    public void addParagrafo(Paragrafo p) {
        paragrafos.add(p);
    }
    
}
