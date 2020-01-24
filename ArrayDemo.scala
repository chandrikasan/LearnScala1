object ArrayDemo {
  def main(args: Array[String]): Unit = {
    var array1 : Array[Int] = new Array[Int](10)

    for ( i <- 0 to array1.length - 1) {
      println( array1(i))
    }

    array1=Array(1,2,3,4,5,6,7,8,9,10)

    for ( i <- 0 to array1.length - 1) {
      println( array1(i))
    }

  }

}
