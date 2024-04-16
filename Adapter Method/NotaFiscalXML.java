public class NotaFiscalXML implements NotaFiscal {
    private String nomeEmpresa;
    private String cnpj;
    private double valor;

    //construtor
    public NotaFiscalXML(String nomeEmpresa, String cnpj, double valor) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.valor = valor;
    }

    @Override
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    @Override
    public String getCnpj() {
        return cnpj;
    }

    @Override
    public double getValor() {
        return valor;
    }
}