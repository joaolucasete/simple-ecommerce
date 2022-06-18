import java.util.Scanner;

public class Main {
    public static void options() {
        System.out.println("1 - Adicionar produto");
        System.out.println("2 - Remover produto");
        System.out.println("3 - Listar produtos");
        System.out.println("4 - Preco total");
        System.out.println("5 - Sair");
    }

    public static void main(String[] args) {
        int opcao;
        var marketCar = new CarrinhoCompras();
        // create a command line with options
        // 1 - add product to cart
        // 2 - show cart
        // 3 - show total
        // 4 - show total with discount
        // 5 - exit
        // 6 - clear cart
        // 7 - add product to cart with discount

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Escolha uma das opcoes disponíveis: ");
            options();
            opcao = teclado.nextInt();
            teclado.skip(".*");
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String nome = teclado.next();
                    System.out.println("Digite o preco do produto: ");
                    double preco = teclado.nextDouble();
                    System.out.println("Digite a quantidade do produto: ");
                    int quantidade = teclado.nextInt();
                    marketCar.addProduto(new Produto(nome, preco, quantidade));
                    System.out.println("Produto adicionado com sucesso!\n");
                    break;
                case 2:
                    System.out.println("Digite o nome do produto: ");
                    nome = teclado.next();
                    marketCar.removeProduto(nome);
                    System.out.println("Produto removido com sucesso!\n");
                    break;
                case 3:
                    marketCar.listarProdutos();
                    break;
                case 4:
                    System.out.print("Preco total: ");
                    System.out.println(marketCar.somaValor());
                    break;
            }
        } while (opcao != 5);

        teclado.close();
    }
}
