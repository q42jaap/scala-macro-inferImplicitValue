// models play json lib's Writes
trait Materializer[-T]

// models play json lib's OWrites
trait OMaterializer[T] extends Materializer[T]
