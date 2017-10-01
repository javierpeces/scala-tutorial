object printargs 
{
  def main( args: Array[String] ) 
  {
    for ( argno <- 0 to args.length - 1 )
    {
      printf( "The argument %d contains %s\n", argno, args( argno ) )
    }
  }
}
