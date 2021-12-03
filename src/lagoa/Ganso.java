package lagoa;

public class Ganso {
    private String nome;
    public static int totalGansos;

    // CONSTRUTORES
    public Ganso() {
        totalGansos++;
    }

    public Ganso(String nome) {
        this.nome = nome;
        totalGansos++;
    }

    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    // MÉTODOS
    public void grasnar() {
        System.out.print("Ganso " + nome + " gransnando");
    }

    public String toString() {
        return nome;
    }
}
