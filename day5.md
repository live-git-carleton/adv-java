:lock: Even and Odd Thread
- Create EvenThread that prints event numbers 2 to 10  
- create OddThread that prints odd numbers from 1 to 9
- Make both the threads sleep for 1 second in the run method. 

1. create the even thread in the main method.
2. create the odd thread in the even thread's run method.
:bulb: Analyze what happens?  

The run methods in even thread and odd thread class will sleep for 1 second.

------

:lock: The Oven problem for Malik and Colette

1. Identify the resource (oven) `object`
2. Identify the action (person1 and person2)  `threads`
3. Action is cook `method inside the resource`
4. Pizza, Coffee.

:newspaper_roll: _results_ 
- PizaaCoffee
- Pizza and Coffee

:key: Identify the classes
1. Oven class has a method call cook(food);
2. Person class is the Thread (Malik, Colette)
3. Application : Cafetaria

Lab : Add popcorn to the above problem.

:key: coding unsynchronized

```java
package multithreading;

public class Synchronization_Cafetaria {
	public static void main(String[] args) {
//The brand new LG Oven for the cafetaria.
		Oven lgOven = new Oven();
		// Getting access to the oven.
		Person colette = new Person(lgOven);
		colette.food = "Pizaa";
		Person malik = new Person(lgOven);
		malik.food = "Coffee";
		// start cooking food at the same time
		colette.start();
		malik.start();
	}
}

//Resource (any object that is used by the thread (threads)
class Oven {
	public void cook(String food) {
		for (int i = 1; i < 100; i++) {
			System.out.println("Cooking : " + food + " Timer : " + i);
		}
	}
}

//Action : Two people, Colette & Malik
class Person extends Thread {
//The person has to access the cook button
	Oven oven = null;
	String food = null;

	public Person(Oven ovenParameter) {
		this.oven = ovenParameter;
	}

// The person hits the cook button.
	public void run() {
		oven.cook(food);
	}
}

```

:key: synchronizing the code


:page_with_curl: _Functional programming_ ...  
1. writing pure functions

:lock: using functional interfaces
An interface with only one method.
- Runnable  

:lock: Functional Programming Lambda Expressions
```java
package functional_programming;

public class RunnableLambda {
	public static void main(String[] args) {
		// runnable with anonymous instance
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable with anonymous class");
			}
		};
		new Thread(runnable).start();

		// Functional Interface : Runnable
		// In oops you need a class to create an object
		// In fp you need a functional interface
		// Writing a lambda expression () -> {}
		Runnable runnable2 = () -> System.out.println("Running with lambda!");
		new Thread(runnable2).start();

		new Thread(() -> System.out.println("Wow, this is awesome")).start();

		new Thread(() -> {
			for (int i = 0; i < 5; i++)
				System.out.println(i);
		}).start();

	}
//	public static void main(String[] args) {
//		// method 1
////		MyRunnable myRunnable = new MyRunnable();
////		Thread thread = new Thread(myRunnable);
////		thread.start();
//
//		// method 2
////		new Thread(new MyRunnable()).start();
//
//		// method 3
//		// anonymous class
//		Thread thread = new Thread(new Runnable() {
//			public void run() {
//				System.out.println("Child Thread!");
//			}
//		});
//		thread.start();
//
//		// method 4
//		new Thread(new Runnable() {
//			public void run() {
//				System.out.println("Child Thread!");
//			}
//		}).start();
//	}
}

//class MyRunnable implements Runnable {
//	public void run() {
//		System.out.println("Child Thread!");
//	}
//}

```
