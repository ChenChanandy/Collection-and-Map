package cn.cc.collection;

/**
 * 测试泛型
 * @author chenc
 *
 */
public class TestGeneric {
	public static void main(String[] args) {
		MyCollection<String> mc = new MyCollection<String>();
		mc.set("dddd", 1);
		
		String a = mc.get(1); 
				
	}
}

class MyCollection<E>{
	Object[] objs = new Object[5];
	
	public void set(E e,int index) {
		objs[index] = e;
	}
	public E get(int index) {
		return (E)objs[index];
	}
}