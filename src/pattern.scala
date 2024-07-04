object pattern{
  def main(args: Array[String]){
    val row = 5;

    for(i <- 1 to row){
      for (j<-1 to row -1){
        print(" ")
      }
      for(k<-1 to 2*i-1){
        print("*")
      }
      println()
    }
  }
}