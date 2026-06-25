import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personagem> equipe = new ArrayList<>();

        equipe.add(new Guerreiro("Arthus", "Guerreiro", 10, 150, 25.0));
        equipe.add(new Mago("Elenara", "Mago", 12, 85, 40.0));

        System.out.println("=== EXIBINDO STATUS DA EQUIPE ===");
        for (Personagem p : equipe) {
            p.exibirStatus();
        }

        System.out.println("\n=== USANDO HABILIDADES ESPECIAIS ===");
        for (Personagem p : equipe) {
            p.usarHabilidadeEspecial();
        }
    }
}
