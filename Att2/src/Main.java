package org.example;

public class Main {
    public static void main(String[] args) {
        Checkout brasil = new Checkout(new CheckoutFactoryBR(false, "PIX", "01311-000"));
        System.out.println(brasil.finalizarPedido(200.00));
        System.out.println();

        Checkout eua = new Checkout(new CheckoutFactoryUS("California", "94103-1234"));
        System.out.println(eua.finalizarPedido(150.00));
        System.out.println();

        Checkout alemanha = new Checkout(new CheckoutFactoryDE(false, "10115"));
        System.out.println(alemanha.finalizarPedido(80.00));
    }
}