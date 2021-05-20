package multidimensionalarray;

public class GradeExam {

  public static void main(String[] args) {
    // Students' answers to the questions
    char[][] answers = {
        {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, // 同學1的答案
        {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'}, // 同學2的答案
        {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'}, // 同學3的答案
        {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'}, // 同學4的答案
        {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, // 同學5的答案
        {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, // 同學6的答案
        {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, // 同學7的答案
        {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}  // 同學8的答案
    };

    // Key to the questions
    // 正確答案
    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

    for (int i = 0; i < answers.length; i++) {  // 第幾個同學（Y 軸）
      int correctCount = 0;
      for (int j = 0; j < answers[i].length; j++) { // 同學答案（X 軸）
        if (answers[i][j] == keys[j]) {
          correctCount++; // 如果答案是對的，就+1
        }
      }
      System.out.println("Student " + i + "'s correct count it:" + correctCount);
    }

  }
}
