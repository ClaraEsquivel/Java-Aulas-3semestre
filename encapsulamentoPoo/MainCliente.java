public class MainCliente {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Maria", "Maria@gmail.com", "123456");
    
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Senha: " + cliente.getSenha());

    }
}

