class A
{
	int i;
}
class B extends A
{
	int j;

	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
/*
What are the basic pillars of Object oriented programming?
What are the principles of Object oriented programming?

1. Inheritance
2. Abstraction
3. Encapsulation
4. Polymorphism

Inheritance
-----------
1. Aquiring the properties and behaviours of another class(Parent class).
2. Parent class ==> Base class | Child class ==> derived class(sub-class)

Types Inheritance
-------------------
1. Single Inheritance
2. Multiple Inheritance
3. Multi-level Inheritance
4. Hybrid Inheritance
5. Hierarchical Inheritance

Note: By using 'extends' keyword we can achieve inheritance through classes [represented by SOLID line]
Note: By using 'implements' keyword we can achieve inheritance through interfaces [represented by DOTTED Line]
*/