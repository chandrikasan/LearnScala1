object CurryingDemo {
  def main(args: Array[String]): Unit = {

    val res = mul(3,5)
    println(res)
    val res2 = currMul(3)(_)
    println(res2)
    val res3 = res2(5)
    println(res3)
  }

  def mul ( a:Int, b:Int) :Int = {
    a * b
  }

  def currMul ( a:Int) (b:Int) :Int = {
    a * b
  }

}
