case class Student(name: String, roll: Int, marks: Map[String,Int])

object calculateMarks {
  def calculateTotal(student: Student): Int = {
    student.marks.values.sum
  }

  def calculateAverage(student: Student): Double = {
    val totalMarks = calculateTotal(student)
    val subjects = student.marks.size
    totalMarks.toDouble / subjects
  }

  def main(args: Array[String]): Unit = {

    val student1 = Student("AAA", 1,Map("Math" -> 80, "Science" -> 85, "English" -> 90))
    val student2 = Student("BBB", 2,Map("Math" -> 90, "Science" -> 95, "English" -> 100))

    println(s"Student '${student1.name}': Total marks->${calculateTotal(student1)}, Average marks->${calculateAverage(student1)}")
    println(s"Student '${student2.name}': Total marks->${calculateTotal(student2)}, Average marks->${calculateAverage(student2)}")
  }
}