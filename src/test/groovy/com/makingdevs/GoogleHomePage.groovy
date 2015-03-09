import geb.Browser
import geb.Page

class GoogleHomePage extends Page{

  static at = { title == "Google" }
  static content = {
    search{ module GoogleSearchModule, buttonValue: "Buscar con Google" }
  }

}
