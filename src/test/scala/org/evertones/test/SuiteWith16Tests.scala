package org.evertones.test

import org.scalatest.{FunSpec, Suites}

object SuiteWith16Tests {

    val suites: Seq[FunSpec] = Seq(
        new Selenium4Spec(),
        new Selenium4Spec(),
        new Selenium4Spec(),
        new Selenium4Spec(),
        new Selenium4Spec(),
        new Selenium4Spec(),
        new Selenium4Spec(),
        new Selenium4Spec(),
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

class SuiteWith16Tests extends Suites(SuiteWith16Tests.suites: _*) {

}
