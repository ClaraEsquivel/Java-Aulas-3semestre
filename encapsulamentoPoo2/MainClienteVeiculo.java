package encapsulamentoPoo2;

public class MainClienteVeiculo {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Marcus", 51, "000.000.000-10", "Terezinha", "71 99111-2222");
        System.out.println(cliente1.toString());

        Veiculo veiculo1 = new Veiculo("SJP9658", "Preto", 5, "40L", "180Km/h", "25Km/L");
        System.out.println(veiculo1.toString());
    }

}
