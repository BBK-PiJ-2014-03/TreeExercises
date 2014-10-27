public class IntegerTreeNodeTest {
    public static void main(String[] args) {
        
        IntegerTreeNode treeRoot = new IntegerTreeNode(5);
        
        treeRoot.add(7);
        treeRoot.add(4);
        treeRoot.add(10);
        
        treeRoot.add(104);
        treeRoot.add(1);
        
        System.out.println(treeRoot.getMin());
        System.out.println(treeRoot.getMax());
    }
}