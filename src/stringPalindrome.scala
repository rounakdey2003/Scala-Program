object stringPalindrome{
  def main(args: Array[String]): Unit = {

    print("Enter a string: ")
    val inputStr = scala.io.StdIn.readLine()

    val palindrome = isPalindrome(inputStr)
    if (palindrome)
      print("This is a Palindrome")
    else {
      print("This is not a Palindrome")
    }
  }
  def isPalindrome(str: String): Boolean= {
    val replaceString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()
      replaceString == replaceString.reverse
  }
}