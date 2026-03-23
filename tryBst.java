public class tryBst{
 
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
public void insert(tNode n) {
  if (root == null) {
    root = n;
    root.setParent(null);
  }else
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
void buildBalancedBST(int start, int end) {
    if (start > end) return;
    int mid = (start + end) / 2;
    insert(mid);
    buildBalancedBST(start, mid - 1);
    buildBalancedBST(mid + 1, end);
}  

