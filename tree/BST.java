import java.util.NoSuchElementException;
class BST{
	protected Node root = new Node();

	//*************************
	//     add
	//	   delete
	//     search 
	//     find min/max
	//	   successor/ predessor
	//		inorder
	//		rotate
	//      rostring
	//******************************
	protected Node search(Node T,int v){   //// T is the root
			return T;
		else if(T.getKey()==v)
			return T;
		else if(T.key()>v)
			search(T.getLeft(),v);
		else
			search(T.getRight(),v);
	}

	protected Node insert(Node T,int v){   ///////// T as the current root
		if(T==null)
			return new Node(v);
		else if (T.getKey()>v){
			T.setLeft(insert(T.getLeft(),v));
			T.getLeft(),setParent(T);
		}
		else 
		{
			T.setRight(T.getRight(),v);
			T.getRight().setParent(T);
		}
		return T;   // the updated BST

	}

    protected void inOrder(Node root){
    	if(root==null)
    		return;
    	if(!root.getLeft()=null){
    		inOrder(root.getLeft());
    	}
    	System.out.print(root,getLeft().toString);
    	//System.out.print(root.toString());
    	inOrder(root.getRight());
    }
    
    protected int findMin(Node root){
    	if(root==null) throw new NoSuchElementException("BST is empty");
    	if(root.getLeft()!=null)
    		return findMin(root.getLeft());
    	else
    		return root.getKey();
    }

    protected int findMax(Node root){
    	if(root==null) throw new NoSuchElementException("BST is empty");
    	if(root.getRight()=null)
    		return root.getKey();
    	else
    		return findMax(root.getRight());
    }

    protected int successor(Node T){    ///// inorder successor
    		if(!T.getRight()=null)
    			return findMin(T.getRight());
    		else{
    			Node p = T.getParent();
    			//Node cur = T;
    			Node temp=null;
    			if(T.getKey()>p.getKey()){///// last turn is right
    				while(!p=null && T.getKey()>p.getKey()){
    					temp=p;
    					p=p.getParent();
    					T = temp;
    				}
    				return p.getKey();
    			}
    			else{
    				while(!p=null &&T.getKey()<p.getKey()){
    					temp = p;
    					p=p.getParent();
    					T = temp;
    				}
    				return p.getKey();
    			}
    		}
    }


    protected int predecessor(Node T){
    	Node temp=null;
    	if(!T.getLeft()=null)
    		return findMax(T.getLeft());
    	else{
    		Node p=T.getParent();
    		while(!p=null && p.getKey()>T.getKey()){
    			temp=p;
    			p=p.getParent();
    			T=temp;
    		}
    		return p.getKey();
    	}
    }

   




}
