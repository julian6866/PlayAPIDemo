name := """my-first-app"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

PlayKeys.externalizeResources := false

libraryDependencies ++= Seq(
  javaJdbc,
  "mysql" % "mysql-connector-java" % "5.1.36",
  javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "5.1.0.Final",
  cache,
  javaWs
)
