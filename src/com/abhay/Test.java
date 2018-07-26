package com.abhay;

interface Baba {
	default void msg() {
		
	}
}

interface Babi {
	default void msg() {
		
	}
}

class Fooo implements Babi, Baba{
	
	public void msg() {
		
	}
	
	protected void show (int...a) {
		System.out.println("i");
	}
	
	void show (int a, int...b) {
		System.out.println("d");
	}
}

class Barr extends Fooo {
	void show (int a, Integer b) {
		
	}
}

public class Test
{
<<<<<<< HEAD
    public static void main (String args[]) {
		System.out.println(System.getProperties());
	
	}
}

// class Ttest {
	// public static Ttest test = new Ttest();
	// public int i=0;
	// {
		// System.out.println(i);
	// }
	// static {
		// System.out.println(j);
	// }
	// public static int j=5;
	// static void msg() {}
// }
=======
    static int x = 11;
    private int y;
    public void method1(Test a, int x)
    {
        this.y = x;
        a.y = x+2;
    	System.out.println(a.y + " " + this.y);
    }
 
    public static void main(String args[])
    {
        Fooo a = new Fooo();
        a.show();
    }
    
    void msg() {
    	
    }
}
>>>>>>> a421753e8c8069541db9b0869c4cdade7bde9944
