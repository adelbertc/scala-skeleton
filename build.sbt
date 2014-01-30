name := "scala-skeleton"

organization := "com.adelbertc"

description := "cool stuff.. hopefully"

version := "0.0.1"

scalaVersion := "2.10.3"

licenses += ("BSD-3-Clause", url("http://www.opensource.org/licenses/BSD-3-Clause"))

resolvers += Resolver.sonatypeRepo("releases")

addCompilerPlugin("org.brianmckenna" %% "wartremover" % "0.7")

libraryDependencies ++= Seq(
  "org.scalaz"  %% "scalaz-core"    % "7.0.5",
  "org.scalaz"  %% "scalaz-effect"  % "7.0.5"
)

scalacOptions in (Compile, compile) += "-P:wartremover:traverser:org.brianmckenna.wartremover.warts.Unsafe"

scalacOptions ++= Seq(
  "-deprecation", 
  "-encoding", "UTF-8",
  "-feature", 
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Xlog-reflective-calls",
  "-Yno-adapted-args",
  "-Ywarn-all",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard"
)
