package Override;

public class ShopMain {

	public static void main(String[] args) {
		
		//HeadShop 클래스의 객체 생성
		HeadShop headshop = new HeadShop();
		System.out.println("본점 입니다.");
		headshop.sellDoenjangjjigae();
		headshop.sellKimchijjigae();
		headshop.sellBibimBap();
		
		System.out.println("====================");
		
		//Shop1 클래스의 객체 생성
		Shop1 shop1 = new Shop1();
		
		shop1.sellDoenjangjjigae();
		shop1.sellKimchijjigae();
		shop1.sellBibimBap();
		
		System.out.println("====================");
		
		//Shop2 클래스의 객체 생성
		Shop2 shop2 = new Shop2();
				
		shop2.sellDoenjangjjigae();
		shop2.sellKimchijjigae();
		shop2.sellBibimBap();
				
		
	}

}
