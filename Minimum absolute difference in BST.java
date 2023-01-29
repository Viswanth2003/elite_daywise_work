class Solution {
    List<Integer>lt=new ArrayList<>();
    public void inordertraversal(TreeNode root){
        if(root!=null){
        inordertraversal(root.left);
        lt.add(root.val);
        inordertraversal(root.right);
        }
    }
    public int getMinimumDifference(TreeNode root) {
        inordertraversal(root);
        int min=10000000;
        for(int i=0;i<lt.size()-1;i++){
            int a=Math.abs(lt.get(i)-lt.get(i+1));
            if(a<min){
                min=a;
            }
        }
        return min;

    }
}