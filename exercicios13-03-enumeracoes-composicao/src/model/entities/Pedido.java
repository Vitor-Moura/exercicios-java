package model.entities;

import model.enums.StatusDoPedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private Date momento;

    private StatusDoPedido status;

    private Cliente cliente;
    private List<ItemDoPedido> itens = new ArrayList<>();

    private SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Pedido(Date momento, StatusDoPedido status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusDoPedido getStatus() {
        return status;
    }

    public void setStatus(StatusDoPedido status) {
        this.status = status;
    }

    public List<ItemDoPedido> getItens() {
        return itens;
    }

    public void adicionaItem(ItemDoPedido item) {
        itens.add(item);
    }

    public void removeItem(ItemDoPedido item) {
        itens.remove(item);
    }

    public double total() {
        double soma = 0.0;
        for (ItemDoPedido item : itens) {
            soma += item.subTotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: ");
        sb.append(formatoData.format(momento) + "\n");
        sb.append("Status do pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Itens do pedido:\n");
        for (ItemDoPedido item : itens) {
            sb.append(item + "\n");
        }
        sb.append("Valor total: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
