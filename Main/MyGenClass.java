package com.mycompany.myapp.Sec2;

public class MyGenClass<K, V> implements MyGenInterface<K, V>{

	K key;
	V value;
	
	
	public MyGenClass(K _key, V _value){
		key = _key;
		value = _value;
	}


	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}


	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}

}





