val scalaTesting = Seq(
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)
val sonatype = "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"


lazy val commonSettings = Seq(
  organization := "angelortega.io",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.12.4"
)

lazy val root = (project in file("."))
  .settings(
    name := "InterviewCake",
    commonSettings,
    libraryDependencies ++= scalaTesting,
    resolvers += sonatype
  )