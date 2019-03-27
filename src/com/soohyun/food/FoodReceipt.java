package com.soohyun.food;

public class FoodReceipt {

	public void receipt(Food [] foods) {
		FoodMenu foodMenu = new FoodMenu();
		Food food = new Food();
		FoodView foodView = new FoodView();

		System.out.println("====영수증====");
		int sw=0;
		for(int i=0; i<foods.length; i++) {
			if(foods[i].sell>=1) {
				System.out.println("주문한 메뉴 : "+foods[i].menu);
				System.out.println("갯수 : "+foods[i].sell);
				System.out.println("가격 : "+foods[i].price*foods[i].sell);
				food.tSell = food.tSell+foods[i].sell;
				foods[i].sell = 0;
			}
		}
		System.out.println("");
		System.out.println(" ");
		
		
	}//receipt 메서드  끝

}
