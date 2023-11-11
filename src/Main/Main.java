package Main;

import Graph.Vertice;
import Graph.Grafo;
import Graph.WelshPowell;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        Grafo grafo = new Grafo(7);
        WelshPowell wp = new WelshPowell();
        grafo.adicionarAresta(0, 1);
        grafo.adicionarAresta(1, 2);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(1, 4);
        grafo.adicionarAresta(3, 5);
        grafo.adicionarAresta(5, 6);
        grafo.adicionarAresta(4, 6);
        wp.kColoracao(grafo);
        Vertice[] result = grafo.getVertices();
        for (int i = 0; i < grafo.numVertices; i++) {
            System.out.println("V:" + i + " | " + result[i].getColor());
        }
    }
}