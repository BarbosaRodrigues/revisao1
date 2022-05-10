package atv1.atv2;

public class Produto {
    private int codigo;
    private double valor;
    private String desc;



    public Produto(int codigo, double valor, String desc) {
        this.codigo = codigo;
        this.valor = valor;
        this.desc = desc;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    
}
