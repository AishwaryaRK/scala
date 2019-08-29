package funsets

object Main extends App {
  import FunSets._
  val s1 = singletonSet(1)
  val s2 = singletonSet(2)
  val s3 = singletonSet(3)
  println("-----------------")
  println("contains", contains(singletonSet(1), 1))
  val s4 = union(union(s1, s2), s3)
  println("union", s4(1)) //s1={1}, s2={2}, s3={3}, s4={1,2,3}
  println(s4)
  val s5 = intersect(s1, s4) //s5={1}
  println("intersect", s5(3))
  println("intersect", s5(1))
  val s6 = diff(s4, s2)   //s4={1,2,3} s2={2}
  println("diff", s6(1))
  println("diff", s6(3))
  println("diff", s6(2))
  val s7 = map(s4, (x:Int) => x+1)  //s4={1,2,3}, s7={2,3,4}
  println("map", s7(1))
  println("map", s7(2))
  println("map", s7(3))
  println("map", s7(4))
}
