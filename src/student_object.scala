class student_object(name: String, roll: Int, marks: Map[String, Int]) {
  def heading():Unit = {
    println(s"Student Marks System"+ s"\n---------------------")
    println(s"Name \tRoll \tSubject1 \tSubject2 \tSubject3 \tTotal \tAvg")
    println(s"---------------------------------------------------------------")
  }
  def display(): Unit = {
    print(s"$name \t$roll")
    marks.foreach { case (subject, mark) =>
      print (s"\t\t\t$mark")
    }
    val total = marks.values.sum
    print(s"\t\t$total")

    val avg = total/3
    print(s"\t\t$avg")
  }
}
  object student_object {
    def main(args: Array[String]): Unit = {
      val student1 = new student_object("AAA", 10, Map("marks1"->90,"marks2"->80,"marks3"->70))
      val student2 = new student_object("BBB", 20, Map("marks1"->30,"marks2"->40,"marks3"->50))

      student1.heading()
      student1.display()
      println()
      student2.display()
    }
  }