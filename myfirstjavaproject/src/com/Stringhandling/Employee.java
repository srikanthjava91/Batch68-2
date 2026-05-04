package com.Stringhandling;

/*Let’s not just give rules, I’ll show you how and why.

🧊 What is Immutable Class?

An immutable class = once object is created, its state cannot be changed

👉 Example: String, Integer

✅ Rules to Create Immutable Class
1. Make class final

So no one can extend and modify behavior

final class Employee { }
2. Make fields private and final

So they can’t be modified directly

private final int id;
private final String name;
3. No setters ❌

Only getters allowed

4. Initialize via constructor
public Employee(int id, String name) {
    this.id = id;
    this.name = name;
}
5. Return copies for mutable objects ⚠️

This is where most people fail in interviews 👀

If you have mutable fields like:

Date

List

Array

👉 You must return defensive copies

🔥 Full Example (Perfect Interview Answer)
final class Employee {

    private final int id;
    private final String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
⚠️ Advanced Case (Mutable Field Example)
import java.util.Date;

final class Person {

    private final Date dob;

    public Person(Date dob) {
        this.dob = new Date(dob.getTime()); // defensive copy
    }

    public Date getDob() {
        return new Date(dob.getTime()); // return copy
    }
}

👉 Without this → object is NOT truly immutable

🧠 Why Immutable?

Thread-safe ✅

No synchronization needed

Safe for caching

Used in String pool

🔥 Interview One-Line Answer

👉 “To create immutable class: make class final, fields private & final, no setters, initialize via constructor, and use defensive copies for mutable objects.”
*/public final class Employee {

	private final int id;
	private final String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
