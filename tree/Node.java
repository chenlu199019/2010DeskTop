class node{
	private Node parent,left,right;
	private int key;
	private int height;

	public Node(int v){
		parent=left=right=null;
		key=v;
		height=0;
	}

	/////accesser
	public Node getParent(){
		return parent;
	}

	public Node getLeft(){
		return left;
	}
	public Node getRight(){
		return right;
	}

	public int getKey(){
		return key;
	}
	public int getHeight(){
		return height;
	}

	////////mutator

	public void setParent(Node n){
		parent=n;
	}

	public void setLeft(Node n){
		;eft=n;
	}

	public void setRight(Node n){
		right=n;
	}

	public void setKey(int n){
		key=n;
	}

	public void setHeight(int n){
		height=n;
	}

	public boolean isLeaf(){
		return (left==null)&&(right==null);
	}

	public void toString(){
		String str = "";
		str = "("+String.valueOf(key)+")";
		System.out.print(str);
	}

}