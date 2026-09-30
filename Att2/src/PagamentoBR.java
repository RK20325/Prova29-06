package org.example;

class PagamentoBR implements Pagamento {
    private String forma; // "PIX" ou "BOLETO"

    PagamentoBR(String forma) {
        this.forma = forma;
    }

    public String processar(double valor) {
        if (forma.equals("PIX")) {
            return "Pagamento Pix | valor com 5% de desconto: " + (valor * 0.95);
        }
        return "Pagamento Boleto | compensação em 3 dias úteis | valor: " + valor;
    }
}
