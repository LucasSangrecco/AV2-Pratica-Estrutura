import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArvoreAVL arvore = new ArvoreAVL();
        Scanner scanner = new Scanner(new File("C:\\Users\\12114651\\IdeaProjects\\AV2-Pratica\\src\\dados.txt"));
        Scanner ler = new Scanner(System.in);
        ArvoreAVL.Node root = null; // Initialize the root node

        int opcao;
        int value = 0;
        do {

            System.out.println("Escolha uma opção:\n" +
                    "\n<1> Inserir" +
                    "\n<2> Excluir" +
                    "\n<3> Pesquisar" +
                    "\n<4> Caminhamento Pré-Ordem" +
                    "\n<5> Sair");
            opcao = ler.nextInt();

            switch (opcao) {

                case 1: {
                    while (scanner.hasNextLine()) {
                        int val = Integer.parseInt(scanner.nextLine());
                        root = arvore.insert(root, val);
                    }
                    System.out.println("Dados inseridos com sucesso!");
                    break;
                }
                case 2: {
                    System.out.println("Digite o valor a ser excluído:");
                    value = ler.nextInt();
                    root = arvore.deleteNode(root, value);
                    System.out.println("Número Excluído Com Sucesso!!!");
                    System.out.println("Árvore Atualizada: ");
                    arvore.print(root);
                    break;
                }
                case 3: {
                    System.out.println("Digite o valor a ser pesquisado:");
                    value = ler.nextInt();
                    
                    break;
                }
                case 4: {
                    System.out.println("Árvore Pré Ordem :");
                    arvore.preOrder(root);
                    break;
                }
                case 5: {
                    break;
                }
                default:
                    System.out.println("Opção Inválida");
            }
        } while (opcao != 5);
    }
}
