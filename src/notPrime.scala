object notPrime{
  def isPrime(n:Int):Boolean={
    if(n<=1)false
    else if(n<=3)true
    else if(n%2==0 || n%3==0)false
    else (2 to math.sqrt(n).toInt).forall((n% _ != 0))
  }
  def range(lower:Int, upper: Int): List[Int]={
    val range = lower to upper
    range.filter(isPrime).toList
  }
  def main(args:Array[String]):Unit={

    print("Enter starting number: ")
    val lower = scala.io.StdIn.readInt()
    print("Enter ending number: ")
    val upper = scala.io.StdIn.readInt()

    println(s"Non Prime between $lower to $upper")
    for (i<- lower to upper){
      if(!isPrime(i)){
        print(i+" ")
      }
    }
    println()
    }
}