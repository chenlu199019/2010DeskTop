class AvlNode{
	public int key;
	public AlvNode left;
	public AlvNode right;
	public AlvNode parent;
	public int height;

	public AlvNode(int v){
		key=v;
		parent = left = right = null;
		height = 0;
	}

	public String toString(){
		return "("+String.valueOf(key)+")";
	}

	

}