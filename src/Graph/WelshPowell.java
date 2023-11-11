package Graph;

import java.util.*;

public class WelshPowell {

    public void kColoracao(Grafo grafo) {
        ArrayList<Integer> sorted = new ArrayList<Integer>(sort(grafo));
        System.out.println(sorted.toString());
        int color = 0;
        while (!sorted.isEmpty()) {
            for (int j = 0; j < sorted.size(); j++) {
                Vertice vertice = grafo.getVertice(sorted.get(0));
                LinkedList<Integer> adj = vertice.getAdj();
                boolean shouldPaint = true;
                for (int k = 0; k < adj.size(); k++) {
                    Vertice verticeAdj = grafo.getVertice(adj.get(k));
                    if (verticeAdj.getColor() == color) {
                        shouldPaint = false;
                        break;
                    }
                }
                if (shouldPaint) {
                    vertice.setColor(color);
                    sorted.remove(j);
                }
            }
            color++;
        }

    }

    public void welshPowel(Grafo grafo, ArrayList<Integer> sorted) {

    }

    public List<Integer> sort(Grafo grafo) { // 2 3 2 1 (1,0,2,3)
        List<Integer> grau = new ArrayList<>();
        for (int i = 0; i < grafo.numVertices; i++) {
            grau.add(grafo.vertices[i].getAdj().size());
        }
        List<Integer> sorted = new ArrayList<>();
        for (int i = 0; i < grafo.numVertices; i++) {
            sorted.add(i);
        }
        sorted.sort((a, b) -> Integer.compare(grau.get(b), grau.get(a)));
        return sorted;
    }

}
