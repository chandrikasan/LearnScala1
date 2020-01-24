object factorsOfNum {
def main(args:Array[String]) :Unit= {
  var a:Int=45

  var i:Int=1
  var rem=0
  var fac:Array[Int] = new Array[Int](50)
  var count=0
  for(i <- 1 to a){
    rem = a%i
    if ( rem == 0) {
      fac(count)=i
      count=count+1
    }
  }

  for (i <- count-1 to 0 by -1){
    println(fac(i))
  }
}
}
