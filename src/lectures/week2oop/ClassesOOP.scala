package lectures.week2oop

object ClassesOOP extends App {
  class Student(val name: String)

  class Course(val title: String, val instructor: String) {
    val id = "cs_101"
    println(id)
  }

  val course = new Course("Scala", "Bob")
  val student = new Student("Sam")

  println(student.name)
  println(course.title)

  class Employee(val name: String, var salary: Double) {
    def this()=this("Jhon",0.0)
  }

  val employee = new Employee()
  println(s"${employee.name}'s salary is ${employee.salary}")
}
