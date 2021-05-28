package objectandclass;

import java.util.Date;

public class TestStudentDemo {

  public static void main(String[] args) {
    StudentDemo studentDemo = new StudentDemo(111111, "Andrew");
    Date dateCreated = studentDemo.getDateCreated(); // 取得Date參數
    dateCreated.setTime(2000); // 使用 Date 實例的方法setTime，改變參數

  }

}

class StudentDemo {

  private int id;
  private String name;
  private Date dateCreated;

  public StudentDemo(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  // 這不是一個 不可變方法
  // 因為 dateCreated 本身是 Date 實例的方法，就算類中不給 set，外面一樣可以進行修改，可參考9 10 行
  public Date getDateCreated() {
    return dateCreated;
  }
}
