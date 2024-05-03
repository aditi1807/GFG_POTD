class Tree
{
     // Recursive function to print right view of a binary tree.
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          // Your code here
          Queue<Node>q=new LinkedList<>();
          Queue<Node>nxt=new LinkedList<>();
          ArrayList<Integer>ans=new ArrayList<>();
          q.add(root);
          if(k==0)
          {
              ans.add(root.data);
              return ans;
          }
          while(!q.isEmpty())
          {
              if(k==0)
              {
                  while(!q.isEmpty())
                  ans.add(q.remove().data);
                  return ans;
              }
              while(!q.isEmpty())
              {
                  Node curr=q.remove();
                  if(curr.left!=null)
                  nxt.add(curr.left);
                  if(curr.right!=null)
                  nxt.add(curr.right);
              }
              q=new LinkedList<>(nxt);
              nxt=new LinkedList<>();
              k--;
          }
          return ans;
     }
}