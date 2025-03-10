package heranca_ativ5;

public class Main {
    public static void main(String[] args) {
        Engenheiro engenheiro1 = new Engenheiro("Ediberto", "beto.engenheiro@gmail.com", 7500, 
        new Endereco("Artêmia", "123", "Casa", "40722-963", "Feira de Santana"), 
        "C-789");

        System.out.println(engenheiro1.toString());

        Medico medico1 = new Medico("Gervásio", "gel.nutricionista@gmail.com", 5500,
         new Endereco("Artêmia", "159", "Casa", "45798-639", "Feira de Santana"),
          "C-9684");

          System.out.println(medico1.toString());
    }


}
