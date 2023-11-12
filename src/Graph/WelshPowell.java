package Graph;

import java.util.*;

public class WelshPowell {

    public int kColoracao(Grafo grafo) {
        ArrayList<Integer> notPainted = new ArrayList<Integer>(sort(grafo));
        System.out.println(notPainted.toString());
        int color = 0;
        while (!notPainted.isEmpty()) {
            for (int j = 0; j < notPainted.size(); j++) {
                Vertice vertice = grafo.getVertice(notPainted.get(j));
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
                    notPainted.remove(j);
                    j--;
                }
            }
            color++;
        }
        return color;
    }

    public List<Integer> sort(Grafo grafo) {
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
