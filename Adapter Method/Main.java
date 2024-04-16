public class Main {
    public static void main(String[] args) {
        NotaFiscalXML notaXML = new NotaFiscalXML("Empresa do Kleber", "123", 3775.0);

        BancoDeDados bancoDeDados = new BancoDeDadosImp();

        NotaFiscalAdapter adaptada = new NotaFiscalAdapter(
            new NotaFiscalJSON(notaXML.getNomeEmpresa(), notaXML.getCnpj(),
            notaXML.getValor()), bancoDeDados
        );

        //Salvando a nota no Banco de Dados
        adaptada.salvarNotaNoBanco();
    }
}
