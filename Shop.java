public class Shop {
    private String shopName; // 店名
    private String telNo;    // 電話番号
    private Goods goods;     // ロール


    //引数なしコンストラクタ
    public Shop() {
    }

    // 引数ありコンストラクタ：shopName と telNo を引数として受け取り、それぞれのフィールドに設定します。goods は null に初期化されます。
    public Shop(String shopName, String telNo) {
        this.shopName = shopName;
        this.telNo = telNo;
    }


    // 商品の追加（メソッド）指定された商品名と価格で Goods オブジェクトを生成し、商品情報を設定します。
    public void createGoods(String goodsName, int price) {
        goods = new Goods(goodsName, price);
    }

    // 店舗情報の出力　　* 店舗名、電話番号、および商品情報を出力します。
    public void printShop() {
        System.out.println("(Shop)  " + shopName + "です。 TEL: " + telNo);
        goods.printGoods();

    }
    //saleGoods
    // 商品の販売
    public void saleGoods(String goodName, ShoppingBag shoppingBag) {
        if (goods == null || !goods.getGoodsName().equals(goodName)) {
            System.out.println("(Shop) " + shopName + "「" + goodName + "は取り扱っていません。申し訳ありません。\n");
            return;
        }

        int price = goods.getPrice();
        if (shoppingBag.getMoney() < price) {
            System.out.println("(Shop) " + shopName + "「" + goodName + "は" + price + "円です。お金が足りません。\n");
            return;
        } else {
            int change = shoppingBag.getMoney() - price;
            shoppingBag.setGoods(goods);
            shoppingBag.setMoney(change);
            System.out.println("(Shop) " + shopName + "「" + goodName + "は" + price + "円です。まいどあり！おつりは" + change + "円です。\n");
            return;
        }
    }

    // ゲッターとセッター
    public String getShopName() {
    	return shopName;
    }

    public void setShopName(String shopName) {
    	this.shopName = shopName;
    }

    public String getTelNo() {
    	return telNo;
    }

    public void setTelNo(String telNo) {
    	this.telNo = telNo;
    }

    public Goods getGoods() {
    	return goods;
    }

    public void setGoods(Goods goods) {
    	this.goods = goods;
    }
}
