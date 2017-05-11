package com.mycompany.myapp.Sec2;

public class MainEntry implements MyGenInterface {

	public static void main(String[] args) {
		MyGenInterface<Integer, String> mg1 = new MyGenClass<Integer, String>(1, "Eyad");
		MyGenInterface<Integer, Integer> mg2 = new MyGenClass<Integer, Integer>(1, 2017);

		Integer i1 = MyRegularClass.getSum(10, 20);
		Float f1 = MyRegularClass.getSum(100f, 200f);

		System.out.println("mg1 Key " + mg1.getKey());
		System.out.println("mg1 Value " + mg1.getValue());
		System.out.println("mg2 Key " + mg2.getKey());
		System.out.println("mg2 Value " + mg2.getValue());
		
		System.out.println("Integer 1 " + i1);
		System.out.println("Float 1 " + f1);


	}
	

	@Override
	public Object getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
