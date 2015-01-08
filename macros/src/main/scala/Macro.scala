import scala.language.experimental.macros

object Macro {
  def genMaterializer[T, M]: Materializer[T] = macro MacroImpl.genMaterializer[T, M]
}
