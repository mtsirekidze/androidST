import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*

import androidx.test.rule.ActivityTestRule
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Rule
    @JvmField
    val activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun exampleTest() {
        // Click the next button on the first page
        onView(withId(R.id.nextButton)).perform(click())

        // Check if the second page text is displayed on the screen
        onView(withText("Second page text")).check(matches(isDisplayed()))

        // Check if the back button is displayed on the screen
        onView(withId(R.id.backButton)).check(matches(isDisplayed()))
    }
}
