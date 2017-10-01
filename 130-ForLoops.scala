object LoopFor
{
        def main( args: Array[String] )
        {
                var mapa = Map( 
                  "A" -> "Amelie Blanchart", 
                  "B" -> "Bonita Monamour", 
                  "AS" -> "Anna Simon", 
                  "C" -> "Charlize Theron" 
                )
                val tab = "\t"

                println( "The map in a loop" )

                for( ( k, v ) <- mapa )
                {
                        printf( "%sThe key %s contains the value %s\n", tab, k, v )
                }

                println( "For each key" )
                mapa.keys.foreach( k => println( tab + k ) )

                println( "For each value" )
                mapa.values.foreach( v => println( tab + v ) )
                                
                println( "For each member" )
                mapa.foreach( item => println( tab + item._1 + " > " + item._2 ) )

                println( "For each case" )
                mapa.foreach { case( k, v ) => println( tab + k + " > " + v ) }

                println( "Map members one by one" )
                println( tab + mapa.get("A").toString() )
                println( tab + mapa.get("B").get )            // risky: "mapa.get("NO-EXISTE").get" es un estacazo brutal
                println( tab + mapa.get("C") )

                println( "Map the rizzo" )
                mapa.get("A").foreach( v => println( tab + v ) )

                println( "The map in a loop... revisited" )
                var i: Int = 0
                           for( v <- mapa.get( "A" ) )
                {
                        i += 1
                        printf( "%sThe value # %d is %s\n", tab, i, v )
                }

                printf( "Left loop with %d value(s)\n", i )

                println( "The map get to a string" )
                var item: String = ""
                mapa.get("A").foreach( v => item = v )
                println( tab + item )

                println( "The map get to a string with default" )
                var item2: String = ""
                mapa.get("A") match
                {
                        case Some( v ) => item2 = v
                        case None      => item2 = "NADA"
                }
                
                println( tab + item2 )
                println( "Finished!" )
        }
}

                
