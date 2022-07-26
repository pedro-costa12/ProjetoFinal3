public class Aplicacao {
    public static void main(String[] args) {
        
        // Clientes
        ClientePessoaFisica clientePF = new ClientePessoaFisica("Alice");
        ClientePessoaJuridica clientePJ = new ClientePessoaJuridica("Alice SA");

        // Carros
        CarroPequeno carroP_ABC1234 = new CarroPequeno();
        CarroMédio carroM_ABB1111 = new CarroMédio();
        CarroSUV carroSUV_BAA2234 = new CarroSUV();

        // Aluguéis PF
        Aluguel aluguelPF01 = new Aluguel(carroP_ABC1234, clientePF, 2);
        Aluguel aluguelPF02 = new Aluguel(carroM_ABB1111, clientePF, 6);
        
        // Aluguéis PJ
        Aluguel aluguelPJ01 = new Aluguel(carroP_ABC1234, clientePJ, 2);
        Aluguel aluguelPJ02 = new Aluguel(carroSUV_BAA2234, clientePJ, 6);

        System.out.println(aluguelPF01);
        System.out.println(" ");
        System.out.println(aluguelPF02);
        System.out.println(" ");
        System.out.println(aluguelPJ01);
        System.out.println(" ");
        System.out.println(aluguelPJ02);
        System.out.println(" ");


    }
}
