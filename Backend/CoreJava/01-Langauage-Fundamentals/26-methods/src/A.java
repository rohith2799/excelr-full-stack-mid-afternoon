class A
{
	public static void main(String[] args)
	{
		System.out.println("from main");
	}
	static void test()
	{
		System.out.println("from test");
	}
}

/*

- By using methods We can execute a set of statements any no. of times.
- each time we can able to supply diff value for a method.
- We can call a method any no. of times. and in each time all the statements which are in the method will be executed.
- main is also a method which is the starting point of a program.
- JVM will start the execution from the main method.
- JVM will be always searching for "public static void main(String[] args)"  declaration.
- main method is also called as an entry point of a java program.
- we can keep any no. of statements and any type of statments inside a method.
- we can develop any no. of methods inside a class.
- methods must be having a return type. at least 'void'
- void means nothing. if we keep void return type for any method that means the method returns nothing(no value).
- methods can takes any no. of arguments(parameters, signature) including no-argument or 0 no. of arguments.
- argument datatype can be anything.
- by using ',' as a seperator we can develop any no. of arguments.
- while JVM is calling the main method compulsary it has create one empty String array Object and should supply that object as an argument to the main method.
- method will be called by the JVM only once while the class is executing.
- method must be having '{' '}'. thats what we are calling body of that method.
- method can be static or non-static.
- methods compulsary has the access-specifiers or access modifiers.
  (public,protected,default,private)
- if we dont specify anything, the default access specifier will be 'default'(friedly)
- methods are going to be executed if and only if they are called. otherwise they will never execute.
- in case of main method that will be called implicitly by the JVM. but with the regular user created methods, compulsary we have to make a call to them, in order for them to be executed.
- to call the static methods we dont have to create object for that class.
- main method also a static method. that means there is no need for JVM to create an object in order to call the main method.
- if we dont keep any access specifier for a user created method, compiler only adding 'default' access specifier at time of compilation.
- method name must be a valid identifier.
- if method name is more than two words follow the camel case but first word first letter in the lower case.
*/
