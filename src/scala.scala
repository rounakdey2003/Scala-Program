object main{
  def main(args: Array[String]): Unit = {

    var cont = true
    while (cont) {
      println("-----------------------------")
      println("Press 1 to see the questions")
      println("Press 0 to continue")
      print("----> ")

      val ques = scala.io.StdIn.readLine()
      if (ques == "1") {
        println("---------------------------------------------------------")
        println("Questions are given below with their unique (token code)")
        println("-------------------------------------------------------------")
        println("Find the length of a string. (1)")
        println("Copy a string from one variable to another. (2)")
        println("Concatenation of two strings. (3)")
        println("Searching a pattern matches in a string. (4)")
        println("Remove of a pattern within a string if pattern is found. (5)")
        println("-------------------------------------------------------------")
      } else {
        println("----------------------")
        println("Press Enter to reset.")
        println("Press 0 to cont..")
        print("----> ")

        val reset = scala.io.StdIn.readLine()
        if (reset == "0") {
          println("----------------------------")
          print("Please enter the token code: ")
          val token = scala.io.StdIn.readLine()

          token match {

            case "1" =>
              print("Enter a String: ")
              val string = scala.io.StdIn.readLine()
              val len = string.length
              println("Length of the string: " + len)

            case "2" =>
              print("Enter a String: ")
              val string = scala.io.StdIn.readLine()
              var cpyStr = ""
              for (char <- string) {
                cpyStr += char
              }
              println("String in the original variable: " + string)
              println("String in the new variable: " + cpyStr)

            case "3" =>
              print("Enter 1st String: ")
              val string = scala.io.StdIn.readLine()
              print("Enter 2nd String: ")
              val string2 = scala.io.StdIn.readLine()
              val concatStr = string + string2
              println("Concatanation of 1st string to 2nd string : " + concatStr)

            case "4" =>
              print("Enter a String: ")
              val string = scala.io.StdIn.readLine()
              print("Enter the searched string: ")
              val string2 = scala.io.StdIn.readLine()
              var posMatch = string.indexOf(string2)
              posMatch = posMatch + 1
              if (posMatch != -1) {
                println(s"Position of '$string2' is in index '$posMatch' of '$string'")
              } else {
                println(s" '$string2' not found in any position")
              }

            case "5" =>
              def remStr(original: String, substring: String): String = {
                val index = original.indexOf(substring)
                if (index != -1) {
                  val before = original.substring(0, index)
                  val after = original.substring(index + substring.length)
                  before + after
                } else {
                  original
                }
              }

              print("Enter a String: ")
              val string = scala.io.StdIn.readLine()
              print("Enter the string to be removed:  ")
              val string2 = scala.io.StdIn.readLine()
              val result = remStr(string, string2)
              println(s"After removing matched string '$string2' from '$string': " + result)

            case _ => println("Invalid Token")
          }
        }
        else {
          if (cont) {
            println("---------------------")
            println("Press 1 to Continue.")
            println("Press 0 to Exit.")
            print("----> ")
            val choise = scala.io.StdIn.readLine()
            if (choise != "1") {
              cont = false
            }
          }
        }
      }
    }
  }
}