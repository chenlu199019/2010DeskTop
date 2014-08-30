import java.util.*;
class AvlTree{
   protected AlvNode root;

   
   protected int height(AlvNode T){
   	return T==null ? -1:T.height;
   }



   protected AlvNode search(AlvNode T,int v){
   	if(T==null)
   		return T;
   	else if (T.key>v)
   		return search(T.left,v);
   	else if(T.key<v)
   		return search(T.right,v);
   	else
   		return T;
   }

   protected int max(int lhs.int rhs){
      return lhs>rhs?lhs:rhs;
   }

   /*protected AlvNode insert(AlvNode T,int v){
   	if(T==null)
   		return new AlvNode(v);
   	else if(T.key>v)
   		return insert(T.left,v);
   	else if(T.key<v)
   		return insert(T.right,v)
   	else
   		return T;
   }*/

   protected AlvNode insert(AlvNode T,int v){	//////return the insertion point
   	if(T==null)
   		return new AlvNode(v);
   	if(T.key>v){
   	  T.left = insert(T.left,v);
        if(height(T.left)-height(T.right)==2)
         if(T.left.key>v)
            T = rotateWithLeftChild(T);
         else
            T = doubleWithLeftChild(T)
   	}
      else if(T.key<v){
         T.right = insert(T.right,v);
         if(height(T.right)-height(T.left)==2)
            if(T.right.key<v)
               T = rotateWithRightChild(T);
            else
               T = doubleWithRightChild(T);
      }
      else
         //////duplicate do nothing
         T.height = max(height(T.left),height(T.right))+1;

      return T;
   }

   protected void inOrder(AvlNode T){
      if(T==null) return;
      if(!T.left=null)
         inOrder(T.left)
      System.out.print(T.toString());
      inOrder(T.right);
   }

   protected int findMin(AlvNode T){
      if(T==null)
         throw new NOSuchElementException("Tree is empty");
      else if(T.left==null)
         return T.key;
      else
         return findMin(T.left);
   }

   protected int findMax(AlvNode T){
      if(T==null) throw new NOSuchElementException("Tree is empty");
      else if(T.right==null)
         return T.key;
      else 
         return findMax(T.right);
   }


   protected int successor(AlvNode T){
      if(T.right!=null)
         return findMin(T.right);
      else{
         AlvNode par = T.parent;
         AlvNode cur = T;
         while((par!=null) && (cur==par.right)){
            cur = par;
            par = par.parent;
         }
         return par==null ? -1:par.key;

      }
   }

   protected int predecessor(AlvNode T){
      if(T.left!=null)
         return findMax(T.left);
      else{
         AlvNode par = T.parent;
         AlvNode cur = T;
         while((par!=null) && (cur==par.left)){
            cur = par;
            par = par.parent;
         }
      return par==null ? -1:par.key;
      }
   }
   
   protected AlvNode delete(AlvNode T,int v){
      if(T==null)
         throw new RuntimeException("cannot delete from empty tree");
      else{
         if(T.key>v){
            T.left = delete(T.left,v);
            if(height(T.right)-height(T.left)==2){
               T = rotateWithRightChild(T);
            }
         }
         else if(T.key<v){
            T.right = delete(T.right,v);
            if(height(T.left)-height(T.right)==2)
               T = rotateWithLeftChild(T);
         }
         else{          //////// T.key=v
            if(T.left==null) return T.right;
            else if(T.right==null) return T.left;
            else{
                T.key=findMax(T.left);
                T.left = delete(T.left,T,key);
            }
         }
      }
   }

  protected AlvNode rotateWithLeftChild(AlvNode T){
   AlvNode pivot = T.left;
   T.left = pivot.right;
   pivot.right = T;
   T.height = max(height(T.left),height(T.right))+1;
   pivot.height = max(height(pivot.left),height(pivot.right))+1;
   return pivot;
  }

  protected AlvNode rotateWithRightChild(AlvNode T){
   AlvNode pivot = T.right;
   T.right = pivot.left;
   pivot.left = T;
   T.height = max(height(T.left),height(T.right))+1;
   pivot.height = max(T.height,height(pivot.right))+1;
   return pivot;
  }

  protected AlvNode doubleWithLeftChild(AlvNode T){
   
  }



   ////////////////////////////////////////////////
   public AlvTree(){
      root= null;
   }

   public int search(int v){
      AlvNode res = search(root,v);
      return res==null? -1:res.key;
   }

   public insert(int v){
      root = insert(root,v);
   }

   public void inOrder(){
      inOrder(root);
      System.out.println();
   }

   public int findMin(){
      return findMin(root);
   }

   public int findMax(){
      return findMax(root);
   }

   public 


   

   



}////// end of AlvTree class