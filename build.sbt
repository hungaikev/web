name := "web"

version := "1.0"

scalaVersion := "2.11.7"



scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots"),
  Resolver.jcenterRepo
)


libraryDependencies ++= {
  val akkaV       = "2.3.12"
  val akkaHttpV   = "10.0.9"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.akka" %% "akka-stream-experimental" % "1.0",
    "com.typesafe.akka" %% "akka-http-core-experimental" % "1.0",
    "com.typesafe.akka" %% "akka-http-experimental" % "1.0",
    "com.typesafe.akka" %% "akka-http-spray-json-experimental" % "1.0"

  )
}
        