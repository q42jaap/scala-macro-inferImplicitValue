# scala-macro-inferImplicitValue

This repo DOES NOT COMPILE, it shows an issue with inferImplicitValue and a real-life type hierarchy (play's `json.Writes[-T]`)

    [info] Compiling 1 Scala source to C:\projects\testtest\target\scala-2.11\classes...
    [error] ambiguous implicit values:
    [error]  both value xm in object TestTest of type => OMaterializer[X]
    [error]  and value tm in object TestTest of type => Materializer[T]
    [error]  match expected type Materializer[X]
    [error] one error found
    [error] (root/compile:compile) Compilation failed
