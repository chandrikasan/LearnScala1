object smallestAmongThreeNum {
def main(arg:Array[String]) :Unit={
  val a=40
  val b=20
  val c=30
  println (s"a=${a} b:${b} c=${c}")
  if ((a > b) && (b > c)) {
    println("c is smallest")
  }
  else if ( (a<b) && (b<c)){
    println("a is smallest")
  }
  else if ((a>b) && (a>c)){
    println("b is smallest")
  }
}
}
