:beginner: **Multithreading**  

Process
- An application which perfomrs a single task or multiple tasks.


Thread
- Single unit of work

Single Threaded Program
- A program (process) with a single task(thread)

Multi Threaded Program

- A program with multiple tasks.

:newspaper: **Java Context** ..  

-Single Threaded Program
```java

public class SingleThreadedProgram {
	// The Process has a single thread (Main Thread)
	public static void main(String[] args) {
		System.out.println("Is it a sunny day today!");
	}
	// The main thread ends, (dies) and the process dies.
}

```
:bell: Lab Exercise
Trainer, Participant, Coordinator
Coordinater (main thread)
Participants will be joining  
Order : Coordinater, Trainer, Participant
Leaving Order : Reverse

lecture()
practice()
startup()
end()

ezShop (Shopping)

Project Lab 2: Connected Lab (Later will be used in project)
We need to 
-  create courses
-  modify courses
-  delete courses
-  query courses

Use file/io of your choice.
Use collections of your choice.


Create Course Table
Create Course Class
Java App (crud) : in the database
User Input : Hard code it.
new Course("Java", 500, Sam);

------------------------
MySQL : DB
Course : 

:lock: be prepared to refactor your code.  

min : 5 variables
max : 10


DB : Courses (table) courseid, course_id.
Java :Course  (field) course_id, courseId. 

Phase 1 Creation
1. Create the course class
2. Create the Course collections
3. Save the course collections

Phase 2 Search
1. Enter course id and display details of the course.

Phase 3: delete
1. accept course  
2. delete course

Phase 4: update
1. enter course id 
2. fetch the course
3. modify the course 
4. save it.






