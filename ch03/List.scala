
//List data type, parameterized on a type A
sealed trait List[+A]

//A List data constructor representing the empty list
case object Nil extends List[Nothing]

//Another data constructor, representing nonempty lists. Note that tail is
//another List[A], which may be Nil or another Cons
case class Cons[+A] (head: A, tail: List[A]) extends List[A]

object List {
    
    def sum(ints: List[Int]): Int = ints match{
        case Nil => 0
        case Cons(x, xs) => x + sum(xs)
        
    }
        
    
}
