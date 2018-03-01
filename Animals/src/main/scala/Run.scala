package animals

import net.liftweb.util.Helpers._
import net.liftweb.json._

object Run extends App {
  implicit val formats = DefaultFormats

  val myCat = new Cat("Pitufo", "Tabby")
  val myDog = new Dog("Firulais", "Puggle")

  println("I'm running really well! " + capify(myCat.speak) + " " + capify(myDog.speak))
  println("This is my cat and dog as JSON:")
  println(prettyRender(Extraction.decompose(myCat)))
  println(prettyRender(Extraction.decompose(myDog)))
}