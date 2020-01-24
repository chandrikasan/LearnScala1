object arith_operations {
def main(args:Array[String]) :Unit = {
  println("Hello")
  var a = 5
  var f = 3.5f
  val v1 = 10.5D
  var b = 10
  var c = sum(a,b)
  println("Sum of " + a + " and " +  b + " is " +  c )
  c = subtract(a,b)
  println(s"${a} - ${b} is ${c}")
  c = prod(a,b)
  println(s"Product of ${a} and ${b} is ${c}")
  c = div(a,b)
  println(s"${a} divided by ${b} is ${c}")
  c = remainder(a,b)
  println(s"Remainder of ${a} div by ${b} is ${c}")

}

  def sum(a : Int,b : Int):Int = {
    val c=a+b
    c
  }

  def subtract(a:Int, b:Int) :Int = {
    a-b
  }

  def prod(a:Int, b:Int) :Int = {
    a*b
  }

  def div(a:Int, b:Int) :Int = {
    a/b
  }

  def remainder(a:Int,b:Int) :Int = {
    val c = a%b
    c
  }
}
