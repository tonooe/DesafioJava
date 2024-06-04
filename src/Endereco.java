public class Endereco {
    private String rua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;

    public Endereco(String rua, String cidade, String estado, String pais, String cep, String numero, String complemento) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getRua() {
        return rua;
    }
    public String getCidade() {
        return cidade;
    }
    public String getEstado() {
        return estado;
    }
    public String getPais() {
        return pais;
    }
    public String getCep() {
        return cep;
    }
    public String getNumero() {
        return numero;
    }
    public String getComplemento() {
        return complemento;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String toString() {
        return "Rua: " + getRua() + ", " + getNumero() + " - " + getCidade() + "\n" +
                getPais() + "\n" +
                "CEP: " + getCep() + "\n" +
                "Complemento: " + getComplemento();
    }

}

