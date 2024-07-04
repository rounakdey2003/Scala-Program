object calculator{
  def main(args: Array[String]): Unit = {
    print("Enter first number: ")
    val num1 = scala.io.StdIn.readDouble()

    print("Enter second number: ")
    val num2 = scala.io.StdIn.readDouble()

    print("Enter operator(+,-,*,/): ")
    val operator = scala.io.StdIn.readLine()

    val result =  operator match {
      case "+" => num1+num2
      case "-" => num1-num2
      case "*" => num1*num2
      case "/" => num1/num2
      case _ => "Invalid operator"
    }
    println(s"Result: $result")
  }
}