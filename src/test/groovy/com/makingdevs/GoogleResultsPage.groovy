import geb.Browser
import geb.Page

class GoogleResultsPage extends Page{

  static content = {
    search {  module GoogleSearchModule, buttonValue: "Search"}

    results{ $("li.g") }
  }
}
