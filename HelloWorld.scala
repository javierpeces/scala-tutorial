object HelloWorld 
{
   def main( args: Array[ String ] ) 
   {
      println( "Hello, world!" )

      for( str <- args ) 
      {
         println( str )
      }

      println( "Bye, world!" )
   }
}
