package org.evertones.test

import org.scalatest.{FunSpec, Suites}

object SuiteWith8Tests {

    val suites: Seq[FunSpec] = Seq(
        new Selenium4Spec(),
        new Selenium4Spec(),
        new Selenium4Spec(),
        new Selenium4Spec(),
        new Selenium4Spec(),
        new Selenium4Spec(),
        new Selenium4Spec(),
        new Selenium4Spec(),
    )

}

class SuiteWith8Tests extends Suites(SuiteWith8Tests.suites: _*) {
}
