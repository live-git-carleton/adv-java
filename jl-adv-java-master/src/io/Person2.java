package io;

//Lab : Read and write person data using DataInputStream and DataOutputStream.
//[Use the Person2 class]
class Person2 {
	@Override
	public String toString() {
		return "Person2 [personID=" + personID + ", age=" + age + ", salary=" + salary + "]";
	}

	// declare fields
	private int personID;
	private int age;
	private float salary;

	public int getPersonID() {
		return personID;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}