name := "test_use_lib"
version := "1.0"
scalaVersion := "3.5.1"

libraryDependencies ++= Seq(
  "xyz.test" % "example_lib" % "0.1.0",   // Java Lib
  "org.slf4j" % "slf4j-simple" % "1.7.9"  // Java Lib
)
