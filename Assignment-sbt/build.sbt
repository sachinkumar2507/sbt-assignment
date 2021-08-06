name := "Assignment-sbt"

version := "1.4.4"

scalaVersion := "2.12.12"



lazy val common = (project in file("common"))
  .settings(
    name := "common",
    libraryDependencies ++= Seq(
      "org.scalaz" %% "scalaz-core" % "7.3.4",
      "org.scalactic" %% "scalactic" % "3.3.0-SNAP3",
      "org.mockito" %% "mockito-scala" % "1.16.37" % Test,
      "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test

    )
  )
lazy val rest = (project in file("rest"))
  .settings(
    name := "rest",
    libraryDependencies ++= Seq(

      "com.typesafe.akka" %% "akka-stream" % "2.6.15",
      "com.typesafe.akka" %% "akka-actor" % "2.6.15",
      "org.json4s" %% "json4s-native" % "4.0.3",
      "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.15" % Test,
      "com.typesafe.akka" %% "akka-http-testkit" % "10.2.5" % Test,
      "com.typesafe.akka" %% "akka-testkit" % "2.6.15" % Test
    )
  )

lazy val root = (project in file(".")).aggregate(common,rest)