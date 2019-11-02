package com.nonstaticmembers;

class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo2 x=new demo2();//x referance variable 
		demo2 y=x;
		System.out.println(x==y);
		System.out.println("x :" + x);//
		System.out.println("y :" + y);//

	}

}
