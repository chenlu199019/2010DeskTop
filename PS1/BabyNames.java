import java.util.*;
import java.io.*;

// write your matric number here:A0112599X
// write your name here:Chen Lu
// write list of collaborators here (reading someone's post in Facebook group and using the idea is counted as collaborating):

class BabyNames {
  // if needed, declare a private data structure here that
  // is accessible to all methods in this class

  // --------------------------------------------
  private ArrayList<String> nameList;
  private ArrayList<Integer> genderList;
  private boolean test = false;

  // --------------------------------------------

  public BabyNames() {
    nameList = new ArrayList<String>();
    genderList = new ArrayList<Integer>();
  }

  void AddSuggestion(String babyName, int genderSuitability) {
    nameList.add(babyName);
    genderList.add(genderSuitability);
  }

  int Query(String START, String END, int genderPreference) {
    int ans = 0;
    String tempName = "";
    //String tempprefix="";
    int tempGender=0;

    // You have to answer how many baby names starts
    // with prefix that is inside query interval [START..END)
    //
    // write your answer here

    // --------------------------------------------
      for(int i=0;i<nameList.size();i++){
        tempName = nameList.get(i);
        //tempprefix=tempName.substring(0,1);
        
        tempGender = genderList.get(i);
        if(test)System.out.println(" temp gender is "+tempGender);
        if(test)System.out.println("temp name "+ tempName+" compare to start " + START+ " is "+ tempName.compareTo(START));
        if(test)System.out.println(" compare to end " + END+ " is "+ tempName.compareTo(END));
        if(genderPreference!=0){
           if(tempName.compareTo(START)>=0 && tempName.compareTo(END)<0 && genderPreference==tempGender)
          ans++;
        }
        else{
          if(tempName.compareTo(START)>=0 && tempName.compareTo(END)<0)
            ans++;
        }
        if(test)System.out.println("Ans is "+ans);
      }

    // --------------------------------------------

    return ans;
  }

  void run() throws Exception {
    // do not alter this method to avoid unnecessary errors with the automated judging
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int command = Integer.parseInt(st.nextToken());
      if (command == 0) // end of input
        break;
      else if (command == 1) // Add Suggestion
        AddSuggestion(st.nextToken(), Integer.parseInt(st.nextToken()));
      else // if (command == 2) // Query
        pr.println(Query(st.nextToken(),      // START
                         st.nextToken(),      // END
                         Integer.parseInt(st.nextToken()))); // GENDER
    }
    pr.close();
  }

  public static void main(String[] args) throws Exception {
    // do not alter this method to avoid unnecessary errors with the automated judging
    BabyNames ps1 = new BabyNames();
    ps1.run();
  }
}
