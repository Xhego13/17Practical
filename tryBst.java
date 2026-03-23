public class tryBst{
  public void insert(tNode n) {
    if (root == null) {
      root = n;
      root.setParent(null);
    }else{
      root.insert(n);
    }
  public void insert(tNode n){
    if (n.key < key){ 
      if (left == null){
        n.parent = this;
        left = n;
      }else{
        left.insert(n);}
    }else{ 
      if (right == null) {
         n.parent = this;
         right = n;
      }else{
        right.insert(n);}
    } 
}

  
public tNode() {
  key = 0;
  data = ””;
  parent = null;
  left = null;
  right = null; } 
  public tNode(long k, String d) {
    key = k;
    data = d;
    parent = null;
    left = null;
    right = null;
  public static void main(String[] args){
      int n = 15; // Example size (2^4 - 1)
      int repetitions = 30;
      long[] populateTimes = new long[repetitions];
      long[] deleteTimes = new long[repetitions];
      for (int i = 0; i < repetitions; i++) {
            BST tree = new BST();
            long startPopulate = System.currentTimeMillis();
            buildBalanced(tree, 1, n);
            long endPopulate = System.currentTimeMillis();
            populateTimes[i] = endPopulate - startPopulate;

            long startDelete = System.currentTimeMillis();
            tree.deleteEvens();
            long endDelete = System.currentTimeMillis();
            deleteTimes[i] = endDelete - startDelete;
      }

        printStats("Populate tree", n, populateTimes);
        printStats("Remove evens from the tree", n, deleteTimes);
  }
  Static void buildBalanced(BST tree, int start, int end) {
        if (start > end) return;
        int mid = (start + end) / 2;
        tree.insert(mid);
        buildBalanced(tree, start, mid - 1);
        buildBalanced(tree, mid + 1, end);
  }

    
  static void printStats(String method, int n, long[] times) {
        double avg = Arrays.stream(times).average().orElse(0);
        double variance = Arrays.stream(times).mapToDouble(t -> Math.pow(t - avg, 2)).sum() / times.length;
        double stdDev = Math.sqrt(variance);
        System.out.printf("%-25s %-15d %-20.2f %-20.2f%n",method, n, avg, stdDev);
  }
} 
  public long getKey() {return key;}
  public void setKey(long k) {key = k;}
  public String getData() {return data;}
  public void setData(String d) {data = d;} 
  public tNode getLeft() {return left;}
  public void setLeft(tNode n) {left = n;}
  public tNode getRight() {return right; }
  public void setRight(tNode n) {right = n;}
  public tNode getParent() {return parent; }
  public void setParent(tNode n) {parent = n;}
}
boolean isBST(tNode node, int min, int max) {//CO-PILOT GENERATED
    if (node == null) return true;
    if (node.key <= min || node.key >= max) return false;
    return isBST(node.left, min, node.key) && isBST(node.right, node.key, max);
}


















