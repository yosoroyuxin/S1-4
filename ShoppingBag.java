public class ShoppingBag {

	//メンバー変数
	private int money;
	private Goods goods;

	//method
    // 引数なしのコンストラクタを明示的に定義
    public ShoppingBag() {

    }
    // 引数ありのコンストラクタ
	public ShoppingBag(int money) {
		this.money = money;
	}

    // 例外処理
    public void printShoppingBag() throws Exception {
        System.out.println("（ShoppingBag） 限度価 " + money + "円");
        if (goods == null) {
            throw new Exception("（ShoppingBag）" + " 商品は入っていません。");
        }
        goods.printGoods();
    }

	//Getter and Setter
	public int getMoney() {
		return money;
	}
    public void setMoney(int money) {
	        this.money = money;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

}
