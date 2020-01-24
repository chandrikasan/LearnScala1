object convertSecToHoursMinsSec {
def main(arg:Array[String]) :Unit={
  var sec:Int=3750
  var min:Int=0
  var hour:Int=0

  hour=sec/3600
  var hour_rem=sec%3600
  min=hour_rem/60
  var min_rem = hour_rem%60

  println(s"${sec} seconds = ${hour} hour ${min} min ${min_rem} sec")
}
}
