object printargs2
{ 
  def main( args: Array[String] )
  { 
    var i = 0
    args foreach { arg => 
      println( i + ": '" + arg + "'" )    
      i += 1
    }
  }
}
