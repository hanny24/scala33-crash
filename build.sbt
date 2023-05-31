val scala3Version = "3.3.0"

scalacOptions ++= Seq("-Xfatal-warnings", "-deprecation", "-Wunused:all")

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala33-compiler-crash",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "software.amazon.awssdk" % "s3" % "2.20.26"
  )
