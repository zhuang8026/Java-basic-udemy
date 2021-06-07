package exception.userdefineexception;

public class CheckAccount {
    private double amount;

    // constructor
    public CheckAccount(double amount) { // 用戶的存款
        this.amount = amount;
    }

    // 用戶想取多少錢？(number)
    public double withdrawMoney(double number) throws Exception {
//    public double withdrawMoney(double number) throws InsufficientFundsException {
        if (number > this.amount) {
            throw new InsufficientFundsException(number - amount); // 輸入的參數比存款多，差多少
        } else {
            return amount - number;
        }
    }
}
