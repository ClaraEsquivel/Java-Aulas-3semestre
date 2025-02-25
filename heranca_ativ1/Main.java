package heranca_ativ1;

public class Main {
    public static void main(String[] args) {
        Memoria memoria1 = new Memoria("Multilaser", "DDR3", "128GB");
        System.out.println(memoria1.toString());

        Processador processador1 = new Processador("Intel", "i7", "4.9GHz");
        System.out.println(processador1.toString());
    
    }
    
}
