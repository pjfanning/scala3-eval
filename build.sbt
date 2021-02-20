name := "scala3-eval"

organization := "com.github.pjfanning"

scalaVersion := "3.0.0-RC1"

scalacOptions in ThisBuild ++= Seq("-encoding", "UTF-8", "-deprecation", "-unchecked")

resolvers in ThisBuild ++= Seq(
  Resolver.mavenLocal,
  Resolver.sonatypeRepo("snapshots")
)

val jacksonVersion = "2.12.1"

libraryDependencies ++= Seq(
  "com.fasterxml.jackson.core" % "jackson-databind" % jacksonVersion
)

