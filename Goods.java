public class Goods {

    private String goodsName; //商品名
    private int price;    //価格
//　　　　引数なしコンストラクタ、Goods オブジェクトを生成します。
    public Goods() {
    }

// 引数のあるコンストラクタ：指定された商品名と価格で Goods オブジェクトを生成します。
    public Goods(String goodName, int price) {
    	this.goodsName = goodName;
    	this.price = price;
    }
// ゲッターとセッター
    public String getGoodsName() {
    	return goodsName;
    }
    public void setGoodsName(String goodsName) {
    	this.goodsName = goodsName;
    }
    public int getPrice() {
    	return price;
    }
    public void setPrice(int price) {
    	this.price = price;
    }

 // 商品情報を出力するメソッド。
    public void printGoods() {
        System.out.println("（Goods） " + goodsName + "　" + price + "円");
    }

}
