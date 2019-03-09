import java.util.Random;
public class Partition{
  public static void main(String[] args){
    int[] data = new int[args.length];
    for (int i = 0; i<args.length; i++){
      data[i] = Integer.parseInt(args[i]);
    }
    System.out.println(partition(data, 1, data.length-1));
  }
  //start = 1 and end = data.length-1
  public static int partition(int[] data, int start, int end){
    Random rng = new Random();
    int pivotInd = rng.nextInt(data.length);
    int pivot = data[pivotInd];
    swap(data, 0, pivotInd);//move pivot to back
    while (start != end){//when you still have left to compare
      if (data[start] > pivot){//compare
        swap(data, start, end);//either move start to end and move end
        end--;
      }else{
        start++;//or don't do anything, move start foward
      }
    }
    if (data[start] < pivot){ //you need to switch the start and pivot
      swap(data, start, 0);
      System.out.println("Final index of " + pivot + " is ");
      return start;
    }else{
      swap(data, start-1, 0);
      System.out.println("Final index of " + pivot + " is ");
      return start-1;
    }
  }
  public static void swap(int[] data, int ind1, int ind2){
    int temp = data[ind1];
    data[ind1] = data[ind2];
    data[ind2] = temp;
  }
}
