object armstrong{
  def isArmstrong(n: Long): Boolean = {
    val digit = n.toString.length
    var sum = n
    var number = n

    while(number>0){
      val rev = number%10
      sum=sum-Math.pow(rev,digit).longValue()
      if (sum<0){
        return false
      }
      number=number/10
    }
    sum==0
  }
  def main(args: Array[String]): Unit={

    print("Enter number: ")
    val num = scala.io.StdIn.readInt()

    if(isArmstrong(num)){
      println(s"$num is Armstrong number")
    } else{
      println(s"$num is Non Armstrong number")
    }
  }
}