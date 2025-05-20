public class StartUp {
	// 商店のオブジェクトを生成
    public static void main(String[] args) {
    	// 店舗と商品を生成します。
        //Goods goods = new Goods("海洋深層水", 1200);
        Shop tokyoShop = new Shop("東京店", "03-1234-5678");
        tokyoShop.createGoods("海洋深層水", 1200);


        // 顧客と買い物かごを生成します
        Customer yamada = new Customer("山田");
        yamada.createBag(2000);

        // 顧客の情報を出力します
        yamada.printCustomer();

        // 該当しない商品
        
        System.out.println("\n(Customer) 山田「アロエはちみつをください。");
        tokyoShop.saleGoods("アロエはちみつ", yamada.getShoppingBag());

        // 商品購入１回目
        System.out.println("(Customer) 山田「海洋深層水をください。");
        tokyoShop.saleGoods("海洋深層水", yamada.getShoppingBag());

        // 商品購入２回目（お金が足りない）
        System.out.println("(Customer) 山田「海洋深層水をください。");
        tokyoShop.saleGoods("海洋深層水", yamada.getShoppingBag());

        // 最終の買い物かご確認
        yamada.printCustomer();

    }
}

