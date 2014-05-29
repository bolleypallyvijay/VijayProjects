package Tests

import Pages.GoogleHomePage
import Pages.GoogleResultsPage
import Pages.WikipediaPage
import geb.testng.GebTest
import org.testng.annotations.Test
import geb.*

/**
 * Created by vijayb on 5/27/2014.
 */
class GoogleTests extends GebTest {

    @Test
    void myTestNGMethod()
    {
        to GoogleHomePage
        assert at(GoogleHomePage)
        search.field.value("wikipedia")
        waitFor { at GoogleResultsPage }
        assert firstResultLink.text() == "Wikipedia"
        firstResultLink.click()
        waitFor { at WikipediaPage } //No Wait Time Given Hence Error
    }
}
