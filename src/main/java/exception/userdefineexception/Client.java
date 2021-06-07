package exception.userdefineexception;

public class Client {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(100); // 用戶只有 100 存款
        try {
            checkAccount.withdrawMoney(399); // 準備取 200
        } catch (InsufficientFundsException e) {
            System.out.println("Sorry, you lack " + e.getAmount()); // 告訴調用者 還差多少錢
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
