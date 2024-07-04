sealed trait subject
case object Math extends subject
case object Science extends subject
case object English extends subject

case class student(name: String, subject: subject, marks: Int)

object calculate {
  def calculateTotal(studentMarks: Seq[student], name: String): Int = {
    studentMarks.filter(_.name == name).map(_.marks).sum
  }

  def main(args: Array[String]): Unit = {
    val studentMarks = Seq(
      student("AAA", Math, 85),
      student("AAA", Science, 90),
      student("AAA", English, 75),
      student("BBB", Math, 70),
      student("BBB", Science, 80),
      student("BBB", English, 65)
    )

    val Student1 = calculateTotal(studentMarks, "AAA")
    val Student2 = calculateTotal(studentMarks, "BBB")

    println(s"Total marks for Student 1: $Student1")
    println(s"Total marks for Student 2: $Student2")
  }
}