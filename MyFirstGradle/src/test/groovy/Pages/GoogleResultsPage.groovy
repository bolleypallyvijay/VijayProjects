package Pages

import geb.Page
import Modules.GoogleSearchModule

/**
 * Created by vijayb on 5/27/2014.
 */
class GoogleResultsPage extends Page{

    static at = { title.endsWith "Google Search" }
    static content = {
        // reuse our previously defined module
        search { module GoogleSearchModule, buttonValue: "Search" }

        // content definitions can compose and build from other definitions
        results { $("li.g") }
        result { i -> results[i] }
        resultLink { i -> result(i).find("a.l") }
        firstResultLink { resultLink(0) }
    }
}
