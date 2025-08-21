
# Spring Boot Basic Project
This is a very simple Spring Boot project to help beginners understand how Spring Boot automatically creates and manages objects (beans) and how we can connect one class with another using `@Autowired`.

# What’s inside this project?
* A Student class → which represents a student who can code.
* A Laptop class → which represents a laptop that can compile code.
* A main application → which starts Spring Boot and runs the program.
  
#  Spring Boot creates objects for us

Normally in Java, we create objects using `new` keyword, like
Student s = new Student();
Laptop l = new Laptop();

But in Spring Boot, we don’t create objects ourselves.
Instead, Spring Boot automatically creates objects (beans) for all classes marked with `@Component`.

In this project:

* `Student` bean is created automatically.
* `Laptop` bean is created automatically.

# Connecting one class with another (`@Autowired`)

The `Student` class needs a `Laptop` to code.
Instead of creating `Laptop` inside `Student`, we use `@Autowired`.
This tells Spring Boot:
*“Please give me a Laptop object whenever I need it.”*
So Spring Boot automatically injects Laptop inside Student.

#  Running the project
When we run the application, these steps happen:
1. Spring Boot starts.
2. It creates `Laptop` bean.
3. It creates `Student` bean and automatically gives it a `Laptop`.
4. We call `student.code()`.
5. This calls `laptop.compile()` and then prints `Coding`.
   
# Example Output

When you run the project, you will see something like this:

Laptop bean created
Bean created
Compiling
Coding

