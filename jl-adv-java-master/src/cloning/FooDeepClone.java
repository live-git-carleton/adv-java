package cloning;

import java.util.Arrays;

public class FooDeepClone implements Cloneable {
	public int[] nums;
	public String nameString = "Foo";
	public int age = 100;

	public FooDeepClone(int size) {
		nums = new int[size];
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		FooDeepClone f1 = new FooDeepClone(5);
		f1.nums[0] = 100;
		FooDeepClone f2 = (FooDeepClone) f1.clone();
		System.out.println("fl" + f1);
		System.out.println("f2" + f2);
		f2.nameString = "Bar";
		f2.nums[0] = 1000;
		f2.nums[2] = 2000;
		System.out.println("fl" + f1);
		System.out.println("f2" + f2);
//		f1.nums[1] = 700;
//		f2.age = 110;
//		System.out.println("f2" + f2);
//		System.out.println("fl" + f1);

	}

	@Override
	protected Object clone() {
		FooDeepClone fooDeepClone;
		try {
			fooDeepClone = (FooDeepClone) super.clone();
			fooDeepClone.nums = (int[]) nums.clone();
			return fooDeepClone;
		} catch (Exception e) {
			return null;
		}

	}

	@Override
	public String toString() {
		return "FooShallowClone [nums=" + Arrays.toString(nums) + ", nameString=" + nameString + ", age=" + age + "]";
	}

}
