package com.uniube.vendas;

public class Pedido {
    private int numeroPedido ;
    private String cliente ;
    private String data ;
    private double valorTotal ;
    private String status ;

    public Pedido(int numeroPedido, String cliente, String data, double valorTotal, String status){
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.data = data;
        this.valorTotal = valorTotal;
        this.status = status;
    }

    public void adicionarItem(double valor){
        valorTotal += valor;
    }

    public void removerItem(double valor){
        valorTotal -= valor;
    }

    public void finalizarPedido(){
        status = "Finalizado";
        System.out.println("O pedido foi efetuado com sucesso!");
    }

    public  void cancelarPedido(){
        status = "Cancelado";
        System.out.println("Pedido cancelado com sucesso!");
    }

    public void exibirInfos(){
        System.out.println("Número pedido: " + numeroPedido);
        System.out.println("Cliente: " + cliente);
        System.out.println("Data pedido: " + data);
        System.out.println("Valor total: " + valorTotal);
        System.out.println("Status pedido: " + status);
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
}
