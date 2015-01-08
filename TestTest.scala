trait T
case class X() extends T

object TestTest {
  implicit val xm = new OMaterializer[X] {} // The OMaterializer trait here is the second part of the problem

  // the explicit `tm: Materializer[T]` type declaration here is first part of the problem
  implicit val tm: Materializer[T] = Macro.genMaterializer[T, X]
}