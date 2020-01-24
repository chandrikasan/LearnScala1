object checkPrime {
  def main(args: Array[String]): Unit = {
    println("Enter a number: ")
    var a = scala.io.StdIn.readInt()
    var result = isPrime(a)

    if ( result == true)
      println(s"$a is prime number")
    else
      println (s"$a is not a prime number")
  }

  def isPrime(i: Int): Boolean = {
    if ( i<= 1 )
        false
    else if ( i == 2 )
      true
    else !( ( 2 to (i-1)).exists(x => (i%x == 0 )))
  }
}
