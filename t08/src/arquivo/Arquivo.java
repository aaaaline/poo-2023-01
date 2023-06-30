package arquivo;

import java.util.ArrayList;
import java.util.List;

public class Arquivo {
	private List<Permissao> permissoes = new ArrayList<>();
	
	public void addPermissao(Permissao permissao) {
        permissoes.add(permissao);
    }
}
