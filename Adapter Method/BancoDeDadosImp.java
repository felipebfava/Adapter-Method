public class BancoDeDadosImp implements BancoDeDados{
    
    @Override
    public void inserirNotaFiscal(String dados) {
        System.out.println("Inserindo dados da nota fiscal no banco de dados: " + dados);
    }
}
