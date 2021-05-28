package objectandclass;

public class Book {

  private String name;
  private String namess;
  private String author;

  public void setName(String name, String namesss) {
    this.name = name; // 變量名一樣，就必須用this 來區隔
    namess = namesss; // this 一般情況可隱藏不寫
  }

  public void setAuthor(String author) {
    this.author = author;
  }
}
