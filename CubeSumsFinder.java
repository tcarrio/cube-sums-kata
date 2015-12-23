import java.util.ArrayList;

public class CubeSumsFinder
{
  public static boolean hasTwoCubeSums(int n) 
  {
    ArrayList<Integer> cubedList = new ArrayList<>();
    int max = (int)(Math.floor(Math.pow((double)n);   
    ArrayList<Integer> sumPairs = findPair(n,max,0,0);
    if(sumPairs.isEmpty()){
      return false;
    }
    sumPairs.add(findPairs(n,max,sumPairs.get(0),sumPairs.get(1)));
    if(sumPairs.size()!=4){
      return false;
    }
  }
  
  public static ArrayList<Integer> findPair(int n, int m, int a, int b){
    ArrayList<Integer> found = new ArrayList<>()
    for(int c=1; c<m; c++){
      for(int d=1; d<m; d++){
        if(c==d)
          continue;
        if(Math.round(Math.pow(c,3)+Math.pow(d,3))==n
          && c!=a && c!=b && d!=a && d!=b){
          found.add(c);
          found.add(d);
          return found;
        }
      }
    }
    return found;
  }
}
