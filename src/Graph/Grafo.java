package Graph;

public class Grafo {
    public int numVertices;
    public Vertice[] vertices;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        vertices = new Vertice[numVertices];
        for (int i = 0; i < numVertices; i++) {
            vertices[i] = new Vertice(i);
        }
    }

    public void adicionarAresta(int v, int w) { // adiciona em ambos vertices os adjacentes (grafo deve ser nao
                                                // direcionado

        Vertice a = vertices[v];
        Vertice b = vertices[w];
        a.addAdj(w);
        b.addAdj(v);
    }

    public void print() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("\n" + i + ": ");
            for (Vertice j : vertices) {
                System.out.println(j);
            }
        }
    }

    public Vertice[] getVertices() {
        return vertices;
    }

    public Vertice getVertice(int idx) {
        return vertices[idx];
    }
}
