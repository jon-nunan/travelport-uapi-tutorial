import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "lesson7"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      // Add your project dependencies here,
      "org.json" % "json" % "20080701",
      "com.restfb" % "restfb" % "1.6.9"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here      
    )

}