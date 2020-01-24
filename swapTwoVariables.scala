object swapTwoVariables {
def main(args:Array [String]) :Unit = {
  var a:Int = 10
  var b:Int = 20
  var temp:Int = 0
  temp=a
  a=b
  b=temp
  println (s"a: ${a}  b: ${b}")
}
}
