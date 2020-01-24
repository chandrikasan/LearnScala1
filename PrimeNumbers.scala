object PrimeNumbers {
def main(args:Array[String]) :Unit= {
  var a=2

  var i=2
  var rem=0
  var count=0
  for (a <- 1 to 100) {
    count=0
    for (i <- 2 to a) {
      rem = a % i
      if (rem == 0) {
        count = count + 1
      }
    }
    if (count == 1) {
      println(s"${a} is prime")
    }
  }
}
}
