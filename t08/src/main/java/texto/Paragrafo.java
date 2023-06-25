package texto;

import java.util.ArrayList;

public class Paragrafo {
	ArrayList <Sentenca> sentencas = new ArrayList<>();
	
	public Paragrafo(Sentenca s) {
		sentencas.add(s);
	}
	
    public void addSentenca(Sentenca s) {
        sentencas.add(s);
    }
}