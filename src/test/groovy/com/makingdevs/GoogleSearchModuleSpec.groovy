import geb.spock.GebReportingSpec

class GoogleSearchModuleSpec extends GebReportingSpec{
  
  def "Should show the results when I write my name in Google"(){
    when:
      to GoogleHomePage
    and: "I write my name"
      search.field.value("Gamaliel") 
      Thread.sleep(300)
    then:
      waitFor{ GoogleResultsPage } 
  }
}
