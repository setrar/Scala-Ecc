libraryDependencies ++= Seq("org.specs2" %% "specs2" % "1.11" % "test")

libraryDependencies += "net.iharder" % "base64" % "2.3.8"

resolvers ++= Seq("snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                    "releases"  at "http://oss.sonatype.org/content/repositories/releases")

name := "Scala-Ecc"
