package pais;

public class PaisCapital {
	private String nomePais;
    private Cidade capital;

	public PaisCapital(String nomePais, Cidade capital) {
		this.nomePais = nomePais;
        this.capital = capital;
	}
	
	public String getNome() {
        return nomePais;
    }

    public Cidade getCapital() {
        return capital;
    }

    public void setCapital(Cidade capital) {
        this.capital = capital;
    }

}
