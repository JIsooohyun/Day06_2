package com.soohyun.food;

import java.util.Scanner;

public class FoodOrder {
	//손님이 주문하는 곳
	public void order(Food [] foods) {
		Scanner sc = new Scanner(System.in);
		Food food = new Food();
		int sw=0;
		int i=0;
		FoodReceipt foodReceipt = new FoodReceipt();
		int num = 0;
		int sell=0;


		System.out.println("=====메뉴판=====");
		for(i=0; i<foods.length; i++) {
			System.out.println((i+1)+". "+foods[i].menu);	
		}
		System.out.println(foods.length+1 +". 주문완료");
		System.out.println("----주문하세요----");

		while(true) {

			num = sc.nextInt();

			for(i=0; i<foods.length; i++) {//2
				if(num == i+1)
				{

					System.out.println("수량은 몇 개?");
					sell = sc.nextInt();
					foods[i].sell = foods[i].sell + sell;
					System.out.println(foods[i].menu+"  "+foods[i].sell+"주문");
					foods[i].stack = foods[i].stack-sell;
					if(foods[i].stack>=sell) {
						System.out.println("수량이 없습니다.");
						break;
					}
				}
			}//for문 끝
			if(num == foods.length+1) {
				foodReceipt.receipt(foods);
				break;
			}

		}//주문받을 수 있는 무한반복

	}//order메서드 끝

}
