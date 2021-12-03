package lagoa;

import java.util.ArrayList;

public class Lagoa {
    private ArrayList<Pato> patos = new ArrayList<Pato>();
    private ArrayList<Cisne> cisnes = new ArrayList<Cisne>();
    private ArrayList<Ganso> gansos = new ArrayList<Ganso>();
    public static int totalAves;

    // BLOCO DE INSTÂNCIA
    {
        for(int i = 0; i < 100; i++) {
            Pato pato = new Pato();
            pato.setNome("Pato " + (i+1));
            patos.add(pato);

            Ganso ganso = new Ganso();
            ganso.setNome("Ganso " + (i+1));
            gansos.add(ganso);

            Cisne cisne = new Cisne();
            cisne.setNome("Cisne " + (i+1));
            cisnes.add(cisne);
        }
        totalAves = patos.size() + cisnes.size() + gansos.size();

        // TIVEMOS DE IMPLEMENTAR O TOSTRING()
        System.out.println(patos);
        System.out.println(cisnes);
        System.out.println(gansos);
    }

    public void populandoDeFormaResumida() {
        for(int i = 0; i < 3; i++) {
            patos.add(new Pato("Pato " + (i+1)));
            cisnes.add(new Cisne("Cisne " + (i+1)));
            gansos.add(new Ganso("Ganso " + (i+1)));
        }
    }

    public static void main(String[] args) {
        new Lagoa();
    }
}
