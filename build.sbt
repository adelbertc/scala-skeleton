name := "scala-skeleton"

organization := "com.adelbertc"

description := "cool stuff.. hopefully"

version := "0.0.1"

scalaVersion := "2.10.4"

licenses += ("BSD-2-Clause", url("http://www.opensource.org/licenses/BSD-2-Clause"))

val scalazVersion = "7.1.0"

libraryDependencies ++= Seq(
  "org.scalaz"  %% "scalaz-concurrent"  % scalazVersion,
  "org.scalaz"  %% "scalaz-core"        % scalazVersion,
  "org.scalaz"  %% "scalaz-effect"      % scalazVersion
)

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard"
)
