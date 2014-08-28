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
   		
   	}
   }






}