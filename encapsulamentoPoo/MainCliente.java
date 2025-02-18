public class MainCliente {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();

        cliente.setNome("Clara");
        cliente.setEmail("Clara@gmail.com");
        cliente.setSenha("654321");

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Senha: " + cliente.getSenha());
        
        
        Cliente cliente2 = new Cliente("Maria", "Maria@gmail.com", "123456");
        System.out.println(cliente2.toString());
        
        Cliente cliente3 = new Cliente("Miguel", "Miguel@gmail.com", "987654");
        System.out.println(cliente3.toString());
    }
}

