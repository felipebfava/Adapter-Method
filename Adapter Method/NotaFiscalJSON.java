public class NotaFiscalJSON {
    private String nomeEmpresa;
    private String cnpj;
    private double valor;
    
    public NotaFiscalJSON(String nomeEmpresa, String cnpj, double valor) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.valor = valor;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public double getValor() {
        return valor;
    }
}
