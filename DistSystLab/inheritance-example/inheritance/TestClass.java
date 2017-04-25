package inheritance;

/* The scope of this activity is to understand how inheritance works in Java. ClassA and ClassB do exactly the same, 
 * but they are in different packages.
 */

import inheritance_other_package.ClassB;

public class TestClass {

	public static void main(String[] args) {
		
		ClassA myA = new ClassA();
		// Compile error: attribute1 is defined as private in ClassA, hence is visible only within ClassB
		// System.out.println(myB.attribute1);
		// No error: attribute2 is defined as protected in ClassA, hence is visible from TestClass because they belong to
		// the same package.
		System.out.println(myA.attribute2);
		// No error: attribute3 is defined as public in ClassA, hence is visible by everyone.
		System.out.println(myA.attribute3);
		
		ClassB myB = new ClassB();
		// Compile error: attribute1 is defined as private in ClassB, hence is visible only within ClassA
		// System.out.println(myB.attribute1);
		// Compile error: attribute2 is defined as protected in ClassB, hence is visible only within the same package
		// System.out.println(myB.attribute2);
		// No error: attribute3 is defined as public in ClassB, hence is visible by everyone.
		System.out.println(myB.attribute3);
	}

}
