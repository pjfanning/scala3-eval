package test

case class TestCaseClass(oof: String, bar: String)

object JavaAnnotationTest extends App {

  val cls = classOf[TestCaseClass]

  val constructor = cls.getConstructors.head

  val param1 = constructor.getParameters.head

  println(s"constructor params ${constructor.getParameters.map(_.getName).toSeq}")
}