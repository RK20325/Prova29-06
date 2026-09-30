package org.example;

class CheckoutFactoryPT implements CheckoutFactory {
    private String NIF;

    CheckoutFactoryPT(String NIF) {
        this.NIF = NIF;
    }

    public Pagamento criarPagamento() {
        return new PagamentoPT();
    }

    public Voucher criarVoucher() {
        return new VoucherPT(NIF);
    }
}
