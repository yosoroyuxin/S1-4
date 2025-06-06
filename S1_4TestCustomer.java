
public class S1_4TestCustomer {

	public static void main(String[] args) {
		Customer customer;
		String customerName = "山田";
		int money = 2000;
		Goods goods = new Goods("海洋深層水", 1200);
		ShoppingBag shoppingBag = new ShoppingBag(money);
		Shop shop = new Shop("東京店", "03-1234-5678");
		shop.setGoods(goods);
		String test;

		System.out.println();
		System.out.println("** S1_4のCustomerクラスの単体テスト **");

		// Test1:引数のないコンストラクタのテスト
		System.out.println("---");
		test = "NG";
		customer = new Customer();
		if (customer != null) {
			test = "OK";
		}
		System.out.println("Test1:引数のないコンストラクタのテスト = " + test);

		// Test2:その他のコンストラクタとゲッターのテスト
		System.out.println("---");
		test = "NG";
		customer = new Customer(customerName);
		if (customer != null && customerName.equals(customer.getCustomerName())) {
			test = "OK";
		}
		System.out.println("Test2:その他のコンストラクタとゲッターのテスト = " + test);

		// Test3:ゲッター・セッターのテスト
		System.out.println("---");
		test = "NG";
		customer = new Customer();
		customer.setCustomerName(customerName);
		customer.setShoppingBag(shoppingBag);
		if (customerName.equals(customer.getCustomerName()) && shoppingBag.equals(customer.getShoppingBag())) {
			test = "OK";
		}
		System.out.println("Test3:ゲッター・セッターのテスト = " + test);

		// Test4:業務ロジック createBag()のテスト
		System.out.println("---");
		test = "NG";
		customer = new Customer(customerName);
		customer.createBag(money);
		if (money == customer.getShoppingBag().getMoney()) {
			test = "OK";
		}
		System.out.println("Test4:業務ロジック createBag()のテスト = " + test);

		// Test5:業務ロジック printCustomer()のテスト
		System.out.println("---");
		test = "NG";
		customer = new Customer(customerName);
		customer.setShoppingBag(shoppingBag);
		System.out.println("Test5:業務ロジック printCustomer()のテスト");
		System.out.println("↓次の行に、「顧客情報」が表示されていればテストOK");
		customer.printCustomer();

		// Test6:業務ロジック queryShop()のテスト
		System.out.println("---");
		test = "NG";
		customer = new Customer(customerName);
		customer.setShoppingBag(shoppingBag);
		System.out.println("Test6:業務ロジック queryShop()のテスト");
		System.out.println("↓次の行から｢顧客メッセージ｣｢商店情報｣が表示されていればテストOK");
		customer.queryShop(shop);

		// Test7:業務ロジック buyGoods()のテスト
		System.out.println("---");
		test = "NG";
		customer = new Customer(customerName);
		customer.setShoppingBag(shoppingBag);
		System.out.println("Test7:業務ロジック buyGoods()のテスト");
		customer.buyGoods(shop, goods.getGoodsName());
		if (shoppingBag.getGoods().getGoodsName().equals(goods.getGoodsName())) {
			test = "OK";
		}
		System.out.println("「業務ロジック buyGoods()のテスト」" + test);
	}
}
