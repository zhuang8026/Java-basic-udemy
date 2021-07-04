package reflection;

public class Test01 {

  public static void main(String[] args) throws ClassNotFoundException {
    Class c1 = Class.forName("reflection.User"); // 獲得 User 類對象

    System.out.println(c1); // Class reflection.User
                            // 類型   完成的路徑

    Class c2 = Class.forName("reflection.User");
    Class c3 = Class.forName("reflection.User");
    Class c4 = Class.forName("reflection.User");

    System.out.println(c2.hashCode());
    System.out.println(c3.hashCode());
    System.out.println(c4.hashCode());

    //User user1 = new User();

	  User user2= null;
	  try {
		  user2 = (User) c1.newInstance(); // 使用 newInstance 會拋出必檢異常InstantiationException & IllegalAccessException
	  } catch (InstantiationException e) {
		  e.printStackTrace();
	  } catch (IllegalAccessException e) {
		  e.printStackTrace();
	  }

	  boolean t = user2 instanceof User; // 檢查 user2 是否為 User 的實例 / true

    System.out.println(t);

  }
}


