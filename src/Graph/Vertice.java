package Graph;

import java.util.LinkedList;

public class Vertice {
    private int num;
    private int color = -1;
    private LinkedList<Integer> adj = new LinkedList<>();

    public Vertice(int num) {
        this.num = num;
    }

    public void addAdj(int v) { // adiciona em ambos vertices os adjacentes (grafo deve ser nao direcionado)
        adj.add(v);
    }

    public int getNum() {
        return num;
    }

    public LinkedList<Integer> getAdj() {
        return adj;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
