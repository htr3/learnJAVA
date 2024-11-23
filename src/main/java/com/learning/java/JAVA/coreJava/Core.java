package com.learning.java.JAVA.coreJava;

public class Core {

   public void Constructors() {
       /*
       * a Constructor is a block of codes similar to the method.
       *  It is called when an instance of the class is created.
       * At the time of calling the constructor, memory for the object
       * is allocated in the memory. It is a special type of method that is used to
       * initialize the object. Every time an object is created using the new() keyword,
       *  at least one constructor is called.
       * */



   }

   public void thisKeyword() {
        /*
        * In Java, ‘this’ is a reference variable that refers to the current object,
        * or can be said “this” in Java is a keyword that refers to the current object
        *  instance. It can be used to call current class methods and fields, to pass an
        * instance of the current class as a parameter, and to differentiate between the
        *  local and instance variables. Using “this” reference can improve code readability
        * and reduce naming conflicts.


         * */
   }

   public void superKeyword() {
        /*
        * super is used to call a superclass constructor: When a subclass is created,
        * its constructor must call the constructor of its parent class. This is done
        * using the super() keyword, which calls the constructor of the parent class.
            super is used to call a superclass method: A subclass can call a method defined in
            *  its parent class using the super keyword. This is useful when the subclass wants
            * to invoke the parent class’s implementation of the method in addition to its own.
            super is used to access a superclass field: A subclass can access a
            * field defined in its parent class using the super keyword. This is useful when the
            * subclass wants to reference the parent class’s version of a field.
            super must be the first statement in a constructor: When calling a superclass constructor,
            *  the super() statement must be the first statement in the constructor of the subclass.
            super cannot be used in a static context: The super keyword cannot be
            * used in a static context, such as in a static method or a static variable initializer.
            super is not required to call a superclass method: While it is possible to use the
            *  super keyword to call a method in the parent class, it is not required. If a method is
            * not overridden in the subclass, then calling it without the super keyword will invoke
            * the parent class’s implementation.
        * */
   }

   public void StaticKeyword() {
         /*
         * The static keyword in Java is mainly used for memory management.
         *  The static keyword in Java is used to share the same variable or method of
         * a given class. The users can apply static keywords with variables, methods,
         * blocks, and nested classes. The static keyword belongs to the class rather
         * than an instance of the class. The static keyword is used for a constant
         * variable or a method that is the same for every instance of a class.
         *
         * Shared memory allocation:
         * Accessible without object instantiation:
         * Associated with class, not objects:
         * Cannot access non-static members:
         * Can be overloaded, but not overridden:
          * */

      // Java program to demonstrate use of static blocks

      class Test
      {
         // static variable
         static int a = 10;
         static int b;

         // static block
         static {
            System.out.println("Static block initialized.");
            b = a * 4;
         }

         public static void main(String[] args)
         {
            System.out.println("from main");
            System.out.println("Value of a : "+a);
            System.out.println("Value of b : "+b);
         }
      }

      /*
      * Static Classes
A class can be made static only if it is a nested class.
*  We cannot declare a top-level class with a static modifier but can declare
* nested classes as static. Such types of classes are called Nested static classes.
* Nested static class doesn’t need a reference of Outer class. In this case, a static
*  class cannot access non-static members of the Outer class.
      *
      * */

      /*
      * Memory efficiency:
      * Improved performance:
      * Global accessibility:
      * Encapsulation of utility methods:
      * Constants:
      * Class-level functionality:
      * */


   }

   public void finalKeyword() {
      /*
      * The final method in Java is used as a non-access modifier applicable only to
      * a variable, a method, or a class. It is used to restrict a user in Java.
      *
      * 1. Final variable --> to create constant variable
      * 2. Final Methods  --> Prevent Method Orriding
      * 3. Final Classes  --> Prevent Inheritance
      *
      *
      *


       *
      * */
   }

   public void accessModifirs() {
      /*
      * public --> it's public u can use anywhere
      * protected --> only enclosing class and subclass can use
      * private --> only enclosing class
      * */
   }





}
