package fr.mipn.scalajs

import utest._
import org.scalajs.jquery.jQuery


object TutoTest extends TestSuite {

  // Initialize App
  TutoApp.setupUI()

  def tests = TestSuite {
    'HereComes {
      assert(jQuery("p:contains('Here comes Scalajs')").length == 1)
    }


    'ButtonClick {
      def messageCount =
        jQuery(".you-clicked").length

      val button = jQuery("#click-me-button:contains('Click me!')")
      assert(button.length == 1)
      assert(messageCount == 0)

      for (c <- 1 to 5) {
        button.click()
        assert(messageCount == c)
      }
    }
  } // fin testsuite
}
