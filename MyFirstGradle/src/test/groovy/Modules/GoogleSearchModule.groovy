package Modules

import Pages.GoogleResultsPage
import geb.Module
/**
 * Created by vijayb on 5/27/2014.
 */


class GoogleSearchModule extends Module{

    // a paramaterised value set when the module is included
    def buttonValue

    // the content DSL
    static content = {

        // name the search input control “field”, defining it with the jQuery like navigator
        field { $("input", name: "q") }

        // the search button declares that it takes us to the results page, and uses the
        // parameterised buttonValue to define itself
        button(to: GoogleResultsPage) {
            $("input", value: buttonValue)
        }
    }
}
