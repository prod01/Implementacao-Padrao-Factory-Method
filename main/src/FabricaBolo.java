public abstract class FabricaBolo {

    // Método abstrato que será implementado pelas fábricas concretas
    public abstract Bolo criarBolo();

    // Método concreto que segue o processo de fazer o bolo
    public void fazerBolo() {
        Bolo bolo = criarBolo();
        bolo.preparar();
        System.out.println("Bolo pronto!\n");
    }
}