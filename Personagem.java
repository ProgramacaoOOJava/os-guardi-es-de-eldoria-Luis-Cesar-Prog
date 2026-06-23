public class Personagem {
    // Atributos básicos do herói
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    // CONSTRUTOR: Permite criar o personagem e preencher os dados de uma vez só
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    } // <-- Atenção para fechar a chave do construtor

    // Método para imprimir os status de forma organizada no console
    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
        System.out.println("-----------------------------");
    } // <-- Atenção para fechar a chave do método
} // <-- Atenção para fechar a chave da classe
