package pessoa;

 public  class Main {
   public static void main(String[] args) {
    Cliente cliente1 = new Cliente("Maria", "23", "21/08/2024", "Cartão");
    System.out.println(cliente1.toString());

    Funcionario funcionario1 = new Funcionario("João", "30", "123-E", "Sub-Gerente", 6500);
    System.out.println(funcionario1.toString());

   }

}
