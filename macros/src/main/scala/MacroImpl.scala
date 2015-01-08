import scala.reflect.macros.blackbox

object MacroImpl {

  def genMaterializer[T: c.WeakTypeTag, M: c.WeakTypeTag](c: blackbox.Context): c.Expr[Materializer[T]] = {

    val tMaterializerTpe = c.universe.appliedType(c.typeOf[Materializer[_]], c.weakTypeOf[M])
    c.inferImplicitValue(tMaterializerTpe)

    c.universe.reify {
      new Materializer[T] {}
    }
  }
}
