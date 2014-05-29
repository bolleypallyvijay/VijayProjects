//package Spec
//
//import Pages.GoogleHomePage
//import Pages.GoogleResultsPage
//import Pages.WikipediaPage
//import geb.spock.GebSpec
//import spock.lang.*
//import geb.spock.*
//
///**
//* Created by vijayb on 5/28/2014.
//*/
//class GoogleSpecs extends GebSpec {
//
//    def "run google spec"()
//    {
//        when:
//        to GoogleHomePage
//        assert at(GoogleHomePage)
//
//        and:
//        search.field.value("wikipedia")
//
//        then:
//        waitFor { at GoogleResultsPage }
//        assert firstResultLink.text() == "Wikipedia"
//
//        when:
//        firstResultLink.click()
//
//        then:
//        waitFor { at WikipediaPage } //No Wait Time Given Hence Error
//    }
//}
