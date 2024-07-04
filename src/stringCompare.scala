class stringCompare(string1: String, string2: String){
  def compare(): Boolean = {
    string1.equals(string2)
  }
}

object string{
  def main(args: Array[String]): Unit = {

    print("Enter first string: ")
    val firstInput = scala.io.StdIn.readLine()

    print("Enter second string: ")
    val secondInput = scala.io.StdIn.readLine()

    val stringObj = new stringCompare(firstInput,secondInput)

    val equalCheck = stringObj.compare()

    if(equalCheck){
      print("The string are equal")
    }
    else {
      print("The string are not equal")
    }
  }
}