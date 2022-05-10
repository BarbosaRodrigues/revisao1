package atv1.atv2;

public class App {
    public static void main(String[] args) {
        //criar um objeto de produto
        Produto prod1 = new Produto(111, 1200.00, "PC da Positivo");
        //criar um objeto de ItemPedido
        ItemPedido itemProd1 = new ItemPedido(5, prod1);
        //Imprimir dados do Produto que 
        //está em ItemPedido
        System.out.println(
            "Descricao: "+itemProd1.getProduto().getDesc()
        );
        System.out.println(
            "Valor total: "+(itemProd1.getProduto().getValor() * itemProd1.getQuantidade())
        );
        //criar um objeto do tipo pedido
        Pedido pedido = new Pedido();

        //Add um item ao Pedido
        pedido.addItem(itemProd1);

        //Imprimir um valor total
        System.out.println("Valor total: "+pedido.obterTotal());
    } 
}
