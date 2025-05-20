  public class Customer {
    //メンバー変数
	private String customerName;
	private ShoppingBag shoppingBag;

  // 引数なしのコンストラクタ
    public Customer() {
    }
    // 引数ありのコンストラクタ
    public Customer(String customerName) {
        this.customerName = customerName;
    }
    //* 買い物かごを作成します。
    //* すでに買い物かごが作成されている場合は新たに作成しません。
    public void createBag(int money) {
        if (this.shoppingBag == null) {
            this.shoppingBag = new ShoppingBag(money);
        }
    }
    // 顧客情報の表示
    //* 買い物かごが作成されていない場合はその旨を表示します。
    public void printCustomer() {
    	System.out.println("（Customer) "+ customerName + "さんの買い物かご");
        	try {
        		shoppingBag.printShoppingBag();
        	} catch (Exception message) {
        		System.out.println(message.getMessage());
        }
    }

    //  * 店舗情報を問い合わせます。

    public void queryShop(Shop shop) {
    	System.out.println();
    	System.out.println("(Customer) " +customerName + " 「この店何店ですか?」");
        shop.printShop();
  }
   // 商品購入アクション

        public void buyGoods(Shop shop, String goodName) {
        System.out.println("(Customer) " + customerName + "「" + goodName + "をください。」");
        shop.saleGoods(goodName, this.shoppingBag);
    }

    //Getter and Setter
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ShoppingBag getShoppingBag() {
        return shoppingBag;
    }

    public void setShoppingBag(ShoppingBag shoppingBag) {
        this.shoppingBag = shoppingBag;
    }

}
