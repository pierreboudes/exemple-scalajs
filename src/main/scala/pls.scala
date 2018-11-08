package fr.mipn.scalajs

import org.scalajs.jquery.jQuery

object TutoApp {

  def addClickedMessage(): Unit = {
    jQuery("#interactive-zone").append("""<p class="you-clicked">Vous avez cliqué sur <em>Click-me!</em> !</p>""")
  }

  def rien() {
    println("tu as cliqué sur Rien mais ça ne fait rien.")
  }


  def setupUI(): Unit = {
    jQuery("body").append("<h1>Here comes Scalajs</h1>")
    jQuery("body").append("""<div id="interactive-zone"><button id="click-me-button" type="button">Click me!</button></div>""")
    jQuery("#click-me-button").click(() => addClickedMessage())
    jQuery("body").append("""<button id="rien" type="button">Rien</button>""")
    jQuery("#rien").click(()=>rien())
  }


  def main(args: Array[String]): Unit = {
    println("*--------------------*")
    println("| Hello JavaScript!  |")
    println("| Here comes Scalajs |")
    println("*--------------------*")

    jQuery(() => setupUI())
  }
}
