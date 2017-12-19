// A comment

object MyModule {
    
    def factorial(n: Int): Int = {
        @annotation.tailrec
        def go(n: Int, acc: Int): Int =
            if(n <= 0)acc
            else go(n-1, n*acc)
        go(n, 1)
    }
    
    def formatResult(name: String, n: Int, f: Int=> Int) = {
        val msg = "The %s of %d is %d."
        msg.format(name, n, f(n))
    }
    
    def abs(n: Int): Int =
        if(n < 0) -n
        else n
        
    
    private def formatAbs(x: Int) = {
        val msg = "The absolute value f %d is %d"
        msg.format(x, abs(x))
        
    }
    
    def main(args: Array[String]): Unit =
        println(formatAbs(-42))
        println(formatResult("factorial", 7, factorial))
    
    
}