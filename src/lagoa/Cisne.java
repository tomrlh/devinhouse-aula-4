package lagoa;

public class Cisne {
    private String nome;
    public static int totalCisnes;

    // CONSTRUTORES
    public Cisne() {
        totalCisnes++;
    }

    public Cisne(String nome) {
        this.nome = nome;
        totalCisnes++;
    }

    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    // MÉTODOS
    public void grasnar() {
        System.out.print("Cisne " + nome + " gransnando");
    }

    public String toString() {
        return nome;
    }
}
