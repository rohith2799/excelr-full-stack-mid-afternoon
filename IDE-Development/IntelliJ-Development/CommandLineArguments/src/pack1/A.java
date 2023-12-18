package pack1;

public class A
{
    public static void main(String[] args)
    {
        System.out.println("done: " + args);
    }
}

//commandLine arguments
//if you are printing the reference you will get object's memory location like classname@hascode in the form of hexadecimal
//At the time of running a program, we can pass some arguments to the program, that is what we can command line arguments.
//while running a program even JVM also supply a default empty array object as argument to main method of a class.
//we can supply some command line arguments that would be converted into string object.