object notFibinacci{
  def isFibo(n:Int):Int= {
    if (n <= 1) n
    else isFibo(n - 1) + isFibo(n - 2)
  }

  def range(lower: Int, upper: Int): Unit = {
    for (i <- lower to upper) {
      val fibo = isFibo(i)
      println(fibo)
    }
  }
  def main(args:Array[String]):Unit={

    print("Enter starting number: ")
    val lower = scala.io.StdIn.readInt()
    print("Enter ending number: ")
    val upper = scala.io.StdIn.readInt()

    println(s"Non Fibonacci between $lower to $upper")
    range(lower,upper)
  }
}