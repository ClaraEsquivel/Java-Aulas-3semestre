package interface_ativ3;

public enum Setor_enum {
    RECURSOS_HUMANOS("Recursos Humanos"),
    FINANCEIRO("Financeiro"),
    OPERACOES("Operações");

    String texto;

    private Setor_enum(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

}
