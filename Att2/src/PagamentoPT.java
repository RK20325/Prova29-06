package org.example;

class PagamentoUS implements Pagamento {
    public String processar(double valor) {
        return "Pagamento Cartão de Crédito | AVS aprovado | valor: " + valor;
    }
}
