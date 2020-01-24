object convertDecToBinary {

  def main(arg:Array[String]) :Unit = {
    val a = 15
    convert_to_bin(a)
    println(s"Decimal : ${a}")
  }

  def convert_to_bin(i: Int) :Unit = {
    var quo:Int=i
    var rem:Int=0
    var bin:Array[Int]= new Array[Int](10)
    var count=0
    while (quo != 0){
      bin(count)=quo%2
      quo=quo/2
      count=count+1;
    }
    println("Binary:")

    for (count <- count-1 to 0 by -1)
      {print(bin(count))}
    println()
  }
}
