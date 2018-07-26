package com.strings;

public class TryStringBuffer {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();
		System.out.println(s.capacity());
		s.append(" yadav");
		System.out.println(s.capacity());
		s.append("12345678901234567890123456789");
		s.ensureCapacity(50);
		System.out.println(s.capacity());
	}
}
