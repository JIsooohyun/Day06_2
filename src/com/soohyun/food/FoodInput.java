package com.soohyun.food;

import java.util.Scanner;

public class FoodInput {
	//음식정보입력
	public Food [] insert() {
		Scanner sc = new Scanner(System.in);


		int count=0;
		System.out.println("메뉴개수를 입력해주세요");
		count = sc.nextInt();

		Food [] foods = new Food[count];
		for(int i=0; i<foods.length;i++) {
			Food food = new Food();
			System.out.println("메뉴를 입력하세요");
			food.menu = sc.next();

			System.out.println("가격입력");
			food.price = sc.nextInt();

			System.out.println("재고수량 ");
			food.stack = sc.nextInt();

			System.out.println("판매수량");
			food.sell = sc.nextInt();

			foods[i] = food;	
		}

		FoodMenu foodMenu = new FoodMenu();
		foodMenu.select(foods);

		return foods;
	}


}

