trait T
case class X() extends T

object TestTest {
  // The OMaterializer trait here is the second part of the problem
  implicit val xm = new OMaterializer[X] {}

  // the explicit `tm: Materializer[T]` type declaration here is first part of the problem
  implicit val tm: Materializer[T] = Macro.genMaterializer[T, X]
}

//object ThisDoesntWorkToo {
//  implicit val xm = new OMaterializer[X] {}
//
//  implicit val tm: Materializer[T] = withoutMacro[T, X]
//
//  def withoutMacro[A, B](implicit m: Materializer[B]): Materializer[A] = new Materializer[A] {}
//}

object ThisWorks {
  implicit val xm: Materializer[X] = new OMaterializer[X] {}
  implicit val tm: Materializer[T] = withoutMacro[T, X]
  def withoutMacro[A, B](implicit m: Materializer[B]): Materializer[A] = new Materializer[A] {}
}