package com.github.aaaaline.poo_2023_01.t21;

import java.util.Set;

public class NotaFiscal {

    private Set<Pedido> contempla;

    private Set<Pagamento> pagamentos;

    public Preco total() {
        Preco soma = Preco.reais(0);
        for (Pagamento pagamento : pagamentos) {
            soma = soma.adiciona(pagamento.valor());
        }

        return soma;
    }
}