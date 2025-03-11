package interface_ativ3;

public enum Sexo_enum {
    FEMININO("Feminino"),
    MASCULINO("Masculino");

    String texto;

    private Sexo_enum(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

}
