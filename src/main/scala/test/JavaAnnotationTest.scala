package test

import com.fasterxml.jackson.annotation._

case class JacksonAnnotationTestCaseClass(@JsonProperty("foo") oof:String, bar: String)

object JavaAnnotationTest extends App {
  val cls = classOf[JacksonAnnotationTestCaseClass]

  val constructor = cls.getConstructors.head

  val param1 = constructor.getParameters.head

  val annotations = param1.getAnnotations.toSeq

  println(s"annotations $annotations")
}