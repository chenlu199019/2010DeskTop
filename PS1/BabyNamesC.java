import java.util.*;

public class BabyNameTree{
  public static void main(String[] args){
    BabyNameTree ps1 = new BabyNameTree();
    ps1.run();
  }

  private nameNode root;

  public BabyNameTree(){
    root=null;
  }

  private int compare(String str1,String str2){
    return str1.compareTo(str2);
  }

  private int height(nameNode T){
    return T==null? -1:T.height;
  }
  
  private int max(int a,int b){
    return a>b? a:b;
  }

  private int balanceFactor(nameNode T){
   return height(T.left)-height(T.right);
  }

  private nameNode addBabyName(nameNode T,String name,int gender){
    if(T==null)
      return new nameNode(name,gender);
    if(compare(T.getKey(),name)>0){
      T.setLeft(addBabyName(T.getLeft(),name,gender));
      /////check balance
      if(balanceFactor(T)==2){
        if(compare(T.getLeft().getKey(),name)>0)
          rotateRight(T);
        else
          rotateLeftRight(T);
      }
    }/////
    else if(compare(T.getKey(),name)<0){
      T.setRight(addBabyName(T.getRight(),name,gender));
      if(balanceFactor==-2){
        if(compare(T.getRight().getKey(),name)<0)
          rotateLeft(T);
        else
          rotateRightLeft(T);
      }
    }//////////
    else if(compare(T.getKey(),name)==0){
      T.addKey(name);
      T.addGender(gender);
    }

    T.height = max(height(T.left),height(T.right))+1;
  }//////  end of add

  private int Query(nameNode T,String START, String END, int genderPreference){
    int ans=0;
    /////////find the start nodeinorder tranversal
    String tempName="";
    int tempGender=0;
    nameNode startNode=T;
    nameNode endNode=T;
    if(T!=null{
     while( T.getLeft()!=null && compare(T.getLeft().getKey(),START)>=0){
          startNode=T.getLeft();
     }

     while(T.getRight()!=null && compare(T.getRight(),END)<0){
      endNode=T.getRight();
     }
      ans=inOrder(T,StartNode,endNode,genderPreference);
    }
      return ans;
  }


  private int inOrder(nameNode root,nameNode start,nameNode end, int toFind){
    int count=0;
    start.setLeft=null;
    end.setRight=null;

    if(toFind==0){
      while()

    }
  }
}//// end of whole class



private class nameNode{
  private nameNode parent,left,right;
  private  ArrayList<String> key;
  private  ArrayList<Integer> gender;
  private int height;

}