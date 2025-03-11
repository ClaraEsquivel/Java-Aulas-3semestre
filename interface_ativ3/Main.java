package interface_ativ3;

public class Main {
    public static void main(String[] args) {
        Diretor diretor = new Diretor("João", "01/01/2000", Sexo_enum.MASCULINO, Setor_enum.FINANCEIRO, 10000);
        System.out.println(diretor);

        Motoboy motoboy = new Motoboy("Pedro", "20/09/2006", Sexo_enum.MASCULINO, Setor_enum.OPERACOES, 3500, "123456789");
        System.out.println(motoboy);
        

        diretor.admitirFuncionario(motoboy);
        
        
    }

}
