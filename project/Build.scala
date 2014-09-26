import sbt._
import Keys._
import play.Play.autoImport._
import PlayKeys._

object ApplicationBuild extends Build {
  
    val appName         = "lobid"
    val appVersion      = com.typesafe.config.ConfigFactory.parseFile(new File("conf/application.conf")).resolve().getString("application.version")
    val appDependencies = Seq(
      javaCore,
      cache,
      "com.typesafe.play" % "play-test_2.11" % "2.3.4",
      "org.elasticsearch" % "elasticsearch" % "1.3.2" withSources(),
      "org.lobid" % "lodmill-ld" % "2.0.1",
      "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
      "com.google.gdata" % "core" % "1.47.1"
    )
    
    val main = Project(appName, file(".")).enablePlugins(play.PlayJava).settings(
      scalaVersion := "2.11.2",
      parallelExecution in Test := false,
      resolvers := Seq(
          "codehaus" at "http://repository.codehaus.org/org/codehaus", 
          "typesafe" at "http://repo.typesafe.com/typesafe/repo", 
          "jena-dev" at "https://repository.apache.org/content/repositories/snapshots",
          Resolver.mavenLocal),
      version := appVersion,
      libraryDependencies ++= appDependencies
    )

    val javacOptions = Seq("-source", "1.8", "-target", "1.8")
}
