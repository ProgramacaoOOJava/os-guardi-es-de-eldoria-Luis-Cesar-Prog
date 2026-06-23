public class Main {
    public static void main(String[] args) {
        
        // Instanciando o primeiro personagem (Guerreiro)
        // Certifique-se de que a linha termina com ";"
        Personagem heroi1 = new Personagem("Thorin", "Guerreiro", 8, 120, 15.4);

        // Instanciando o segundo personagem (Mago)
        // Certifique-se de que a linha termina com ";"
        Personagem heroi2 = new Personagem("Eldrin", "Mago", 12, 65, 24.8);

        // Imprimindo o título e chamando o método de exibição de cada um
        System.out.println("--- STATUS DOS HERÓIS ---\n");
        heroi1.exibirStatus();
        heroi2.exibirStatus();
    }
}
