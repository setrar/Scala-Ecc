libraryDependencies ++= Seq("org.specs2" %% "specs2" % "1.11" % "test")

libraryDependencies += "net.iharder" % "base64" % "2.3.8"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1" % "test"

libraryDependencies += "junit" % "junit" % "4.10" % "test"

resolvers ++= Seq("snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                    "releases"  at "http://oss.sonatype.org/content/repositories/releases")

name := "Scala-Ecc"
