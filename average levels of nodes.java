class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> l=new ArrayList<>();
        if(root==null){
            return l;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            
             int c=q.size();
             long sum=0;
             for(int i=0;i<c;i++){
               TreeNode temp=q.poll();
                sum+=temp.val;
             
             if(temp.left!=null){
                q.add(temp.left);
             }
             if(temp.right!=null){
                q.add(temp.right);
             }
             }
            double y=(sum*1.0)/c;
            l.add(y);

        }
        return l;
    }
}