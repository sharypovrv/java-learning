package algorithms.homework004;

/**
 * Класс Бинарное дерево
 *
 * @автор Sharypov Roman
 * @версия 1.0
 * @от 2023-09-19
 */

public class BinaryTree {

    private Node root;
    private int quantity;

    public BinaryTree() {
        quantity = 0;
    }

    /**
     * @return - корень дерева
     */
    public Node getRoot() {
        return root;
    }

    /**
     * Метод добавления узла
     *
     * @param value - значение узла
     */
    public void add(int value) {
        root = addRecursive(root, value);
    }

    /**
     * Рекурсивный метод добавления узла
     *
     * @param current - узел, в ветку которого добавляется значение
     * @param value   - значение
     * @return - узел
     */
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            quantity++;
            return new Node(value);
        }

        if (value < current.getValue()) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.getValue()) {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }

    /**
     * Метод проверки наличия значения в дереве
     *
     * @param value - искомое значение
     */
    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    /**
     * Рекурсивный метод проверки наличия значения в ветке
     *
     * @param current - узел, в ветке которого ищется значение
     * @param value   - искомое значение
     */
    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        } else if (value == current.getValue()) {
            return true;
        } else if (value < current.getValue()) {
            return containsNodeRecursive(current.left, value);
        } else {
            return containsNodeRecursive(current.right, value);
        }
    }

    /**
     * Метод удаления узла
     *
     * @param value - удаляемое значение
     */
    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    /**
     * Рекурсивный метод удаления узла
     *
     * @param current - узел, в ветке которого удаляется значение
     * @param value   - удаляемое значение
     * @return - удаляемый узел
     */
    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value < current.getValue()) {
            current.left = deleteRecursive(current.left, value);
            return current;
        } else if (value > current.getValue()) {
            current.right = deleteRecursive(current.right, value);
            return current;
        }

        if (value == current.getValue()) {
            if (current.left == null && current.right == null) {
                quantity--;
                return null;
            } else if (current.right == null) {
                quantity--;
                return current.left;
            } else if (current.left == null) {
                quantity--;
                return current.right;
            } else {
                int smallestRightValue = findSmallestValue(current.right);
                current.setValue(smallestRightValue);
                current.right = deleteRecursive(current.right, smallestRightValue);
                return current;
            }
        }
        return current;
    }

    /**
     * Рекурсивный метод нахождения минимального значения в ветке
     *
     * @param root - узел, в ветке которого ищется минимальное значение
     * @return - минимальное значение ветки
     */
    private int findSmallestValue(Node root) {

        if (root.left == null) {
            return root.getValue();
        }

        return findSmallestValue(root.left);
    }

    /**
     * Вывод на печать всего дерева "в глубину"
     */
    public void printInOrder() {
        printInOrder(root);
    }

    /**
     * Рекурсивный метод печати ветки дерева "в глубину"
     *
     * @param node - узел, ветка которого печатается
     */
    private void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.getValue() + " ");
            printInOrder(node.right);
        }
    }

    /**
     * @return - количество узлов дерева
     */
    public int getQuantity() {
        return quantity;
    }

}
