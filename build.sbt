sbtPlugin := true

name := "sbt-structure"

organization := "org.jetbrains"

version := "1.0.2"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.2" % "test"

publishTo := Some(Resolver.url("sbt-plugin-releases", new URL("http://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns))

publishMavenStyle := false

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
