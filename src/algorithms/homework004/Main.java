package algorithms.homework004;

public class Main {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.add(8);
        tree.add(6);
        tree.add(1);
        tree.add(3);
        tree.add(7);
        tree.add(5);

        tree.printInOrder();
        System.out.println();
        System.out.println(tree.getQuantity());
        tree.delete(5);
        tree.delete(8);
        tree.delete(6);
        tree.printInOrder();
        System.out.println();
        System.out.println(tree.getQuantity());
        System.out.println(tree.containsNode(6));
        System.out.println(tree.containsNode(2));
        System.out.println(tree.getRoot().getValue());

    }
}
