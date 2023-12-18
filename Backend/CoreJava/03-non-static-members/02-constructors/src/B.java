class B 
{
	B()
	{
	}

	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("done");
	}
}
//We can also create the constructor
//constructors should be within a class and outside of any method
//if you are keeping at least one explicite constructor then, compiler will not be keeping no-arg default constructor.
//construtors treated as a special type of methods internally, but they are not normal methods. there is a difference b/w constructors and methods
//constructors are going to be invoked while we are creating the object
//complusory there should be an object creation to invoke the constructor. in the beggining
// methods are going to be invoked whenever we call them.
   //Rules for constructors
//1.Complusary constructors name should be same as class name.(case-sensitive)
//2.There is no return type for a constructor.
//3.Complusary constructors should be concrere, or defined,are implemented, it should be having at {} i,e body.

//What are all the similarities between constructors and methods
//parameter(can be any nos., can be any type)
//concrete, defined, implemented
//access specifier both constructors and methods.
//we can create any no. of constructors and methods in a class but arguments must be different(fpr a group of constructors, for a group of methods)







