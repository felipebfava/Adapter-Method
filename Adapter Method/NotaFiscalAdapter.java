public class NotaFiscalAdapter implements NotaFiscal {
    private NotaFiscalXML notaFiscalXML;
    private NotaFiscalJSON notaFiscalJSON;
    private BancoDeDados bancoDeDados;

    public NotaFiscalAdapter(NotaFiscalJSON notaFiscalJSON, BancoDeDados bancoDeDados) {
        System.out.println("Transferindo de XML para JSON...");
        this.notaFiscalJSON = notaFiscalJSON;
        this.bancoDeDados = bancoDeDados;
    }

    @Override
    public String getNomeEmpresa() {
        return notaFiscalXML.getNomeEmpresa();
    }

    @Override
    public String getCnpj() {
        return notaFiscalXML.getCnpj();
    }

    @Override
    public double getValor() {
        return notaFiscalXML.getValor();
    }

    public void salvarNotaNoBanco() {
        String dados = "Nome Empresa: " + getNomeEmpresa() + ", CNPJ: " + getCnpj() + ", Valor: " + getValor();

        //Inserindo no Banco de Dados
        bancoDeDados.inserirNotaFiscal(dados);
    }
}