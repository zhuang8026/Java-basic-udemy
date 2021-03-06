package objectandclass.equalsdemo;

import java.util.Objects;

public class Student extends Object {

  private String firstName;
  private String lastName;

  private String score;

  public Student(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    // student 是Object的子類, this就會有object methods
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(firstName, student.firstName) &&
        Objects.equals(lastName, student.lastName);
  }

  protected final void m() {

  }

}
