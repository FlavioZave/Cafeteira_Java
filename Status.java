package status;

public enum Status {
    PRONTO("Pronto!"),
    LIGADA("ligada!"),
    REPOR_AGUA("Precisa de Agua!"),
    REPOR_CAFE("Precisa de Café!"),
    DESLIGADA("Desligada!");

    private String nome;

    private Status(String nome) {
        this.nome = nome;
    }

    private Status()
    {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
