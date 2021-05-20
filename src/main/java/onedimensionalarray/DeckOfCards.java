package onedimensionalarray;

/**
 * 功能：
 * 隨即生成4種花色庫克牌
 * */
public class DeckOfCards {
  public static void main(String[] args) {
    int[] deck = new int[52];
    String[] suits = {"黑桃", "愛心", "方塊", "梅花"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                      "Jack", "Queen", "King"};

    // Initialize cards
    for (int i = 0; i < deck.length; i++) {
      deck[i] = i; // 0 ~ 51
    }

    // Shuffle the cards 洗牌
    for (int i = 0; i < deck.length; i++) {
      // Generate an index randomly
      int index = (int) (Math.random() * deck.length);

      // 以下為 交換的概念
      int temp = deck[i]; // 保存 第一張
      deck[i] = deck[index]; // 賦值 第X張
      deck[index] = temp; // 在將 第X張 賦值 第一張
    }

    // Display the first four cards
    // 因為上面已經deck已經是亂數了,所以直接迴圈4張即可
    for (int i = 0; i < 4; i++) {
      String suit = suits[deck[i] / 13]; // 一種花色13張 / 13 26 39 52
      String rank = ranks[deck[i] % 13]; // 卡片內容
      System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
    }
  }
}