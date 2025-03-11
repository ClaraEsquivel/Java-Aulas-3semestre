package interface_ativ1;

public class Cachorro implements Animal{

    @Override
    public String emitirSom() {
        return "Au au";
    }

    public String comer() {
        return "Carne";
    }

}
