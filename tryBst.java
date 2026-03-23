public class tryBst{
  class tNode {
    int key;
    tNode left, right;
    tNode(int item) {
        key = item;
        left = right = null
    }
  }
  void buildBalancedBST(int start, int end) {
    if (start > end) return;
    int mid = (start + end) / 2;
    insert(mid);
    buildBalancedBST(start, mid - 1);
    buildBalancedBST(mid + 1, end);
  }  
}

