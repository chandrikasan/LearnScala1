object printPattern {
def main(args:Array[String]) :Unit={
  var a=5;

  var i=1
  var j=1
  for (i<- 1 to 10)
    {
      for (j<- 1 to i)
        {
          print(a)
        }
      println()
    }
}
}
