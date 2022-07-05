package AbstractEx.shop;

public class ShopMain {

	public static void main(String[] args) {
		
		HeadShop shop1 = new Shop1();
		shop1.sellDoenjangjjigae();
		shop1.sellKimchijjigae();
		shop1.sellBibimBap();
		System.out.println("=======================");
		
		HeadShop shop2 = new Shop2();
		shop2.sellDoenjangjjigae();
		shop2.sellKimchijjigae();
		shop2.sellBibimBap();
		System.out.println("=======================");
	}

}
