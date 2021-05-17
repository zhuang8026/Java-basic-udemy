package onedimensionalarray;

public class ArrayOperate6 {

  public static void main(String[] args) {
    double[] myList = {1, 2, 3, 4, 5};

    for (int i = 0; i < myList.length; i++) {
      int j = (int) (Math.random() * (myList.length)); // 隨機index

      // 假設：
      // i=0, j=2
      // myList[i]=1 ; myList[j]=2
      // 想要進行互換，需要先保存原始值，在進行互換
      double temp = myList[i]; // 先保存資料 0~5
      myList[i] = myList[j]; // 資料交換
      myList[j] = temp;
    }

    // 寫法一
    for (int i = 0; i < myList.length; i++) {
      System.out.print(myList[i] + " ");
    }

//    寫法二
//    for(double ls : myList){
//      System.out.print(myList[i] + " ");
//    }
  }

}
