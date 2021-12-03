package lagoa;

public class Pato {
    private String nome;
    public static int totalPatos;

    // CONSTRUTORES
    public Pato() {
        totalPatos++;
    }

    public Pato(String nome) {
        this.nome = nome;
        totalPatos++;
    }

    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    // MÈTODOS
    public void grasnar() {
        System.out.print("Pato " + nome + " gransnando");
    }

    public String toString() {
        return nome;
    }
}
