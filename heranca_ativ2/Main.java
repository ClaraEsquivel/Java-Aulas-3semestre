package heranca_ativ2;

public class Main {
    public static void main(String[] args) {
        Memoria memoria1 = new Memoria("Multilaser", "DDR3", "128GB");
        System.out.println(memoria1.toString());

        Processador processador1 = new Processador("Intel", "i7", "4.9GHz");
        System.out.println(processador1.toString());
    
        PlacaMae placamae1 = new PlacaMae("Asus",   "Prime B450M", "AM4");
        System.out.println(placamae1.toString());

        DispositivoArmazenamento dispositivoArmazenamento1 = new DispositivoArmazenamento("Adata", "hard dkiss ", "8TB", "SSD");
        System.out.println(dispositivoArmazenamento1.toString());
    }
    
}
