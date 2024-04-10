package org.example;

import java.util.Date;

public class Vendedor  extends Funcionario{
    private int totalItemVendido;
    private double comicaoPorItem;

    public Vendedor() {
        super();
    }
    public double calculaSalario() {
        return super.getSalario() + this.comicaoPorItem * this.totalItemVendido;
    }

    public int getTotalItemVendido() {
        return totalItemVendido;
    }

    public void setTotalItemVendido(int totalItemVendido) {
        this.totalItemVendido = totalItemVendido;
    }

    public double getComicaoPorItem() {
        return comicaoPorItem;
    }

    public void setComicaoPorItem(double comicaoPorItem) {
        this.comicaoPorItem = comicaoPorItem;
    }
}
