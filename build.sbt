lazy val macros = project.in(file("macros")).settings(
  libraryDependencies += "org.scala-lang" % "scala-reflect" % "2.11.4",
  scalaVersion := "2.11.4"
)

lazy val root = (project in file(".")).
  settings(
  name := "testtest",
  version := "1.0",
  scalaVersion := "2.11.4"
).dependsOn(macros)


