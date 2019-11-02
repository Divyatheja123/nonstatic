package com.nonstaticmembers;

class mainClass2 {
	int xyz;
	String abc;
	double a;
	char ch;
	void initialization(int xyz ,String abc, double t, char z)
	{
		this.xyz =xyz;
		this.abc=abc;
		this.ch=ch;
		this.a=a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 ob =new A1();
		ob.initialization(19,"hello",12.0,'s');
		System.out.println(ob.i);

	}

}
