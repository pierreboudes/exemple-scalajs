

name := "ScalajsJQuery"
version := "0.1"

/* parce que nous avons un main à faire exécuter par JS */
scalaJSUseMainModuleInitializer := true

scalaVersion := "2.12.4"

enablePlugins(ScalaJSPlugin)

/* pour que Scalajs puisse utiliser JQuery */
libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.2"

/* www.webjars.org liste les webjars disponibles */
skip in packageJSDependencies := false
jsDependencies +=
// "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"
"org.webjars" % "jquery" % "3.3.1-1" / "3.3.1-1/jquery.js"


/* Pour que nodejs simule un DOM (installation: npm install jsdom) */
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

/**********************/
/* tests en utilisant */
/* utest de Li Haoyi **/
/**********************/

/* http://www.lihaoyi.com/post/uTesttheEssentialTestFrameworkforScala.html */
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.5.3" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")

/* si on veut faire tourner les tests sur la version optimisée */
// set scalaJSStage in Global := FullOptStage


/* Pour plus tard, on n'oublie pas =
lazy val akkaVersion = "2.5.9"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion
)
 */
