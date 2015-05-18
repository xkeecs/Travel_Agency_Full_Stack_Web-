
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object createForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Computer],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(computerForm: Form[Computer]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
    <h1>Add a computer</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.Application.save())/*11.37*/ {_display_(Seq[Any](format.raw/*11.39*/("""
        
        <fieldset>
        
            """),_display_(Seq[Any](/*15.14*/inputText(computerForm("name"), '_label -> "Computer name"))),format.raw/*15.73*/("""
            """),_display_(Seq[Any](/*16.14*/inputText(computerForm("introduced"), '_label -> "Introduced date"))),format.raw/*16.81*/("""
            """),_display_(Seq[Any](/*17.14*/inputText(computerForm("discontinued"), '_label -> "Discontinued date"))),format.raw/*17.85*/("""

            """),_display_(Seq[Any](/*19.14*/select(
                computerForm("company.id"), 
                options(Company.options), 
                '_label -> "Company", '_default -> "-- Choose a company --"
            ))),format.raw/*23.14*/("""
            

        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Create this computer" class="btn primary"> or 
            <a href=""""),_display_(Seq[Any](/*30.23*/routes/*30.29*/.Application.list())),format.raw/*30.48*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*33.6*/("""
    
""")))})))}
    }
    
    def render(computerForm:Form[Computer]): play.api.templates.Html = apply(computerForm)
    
    def f:((Form[Computer]) => play.api.templates.Html) = (computerForm) => apply(computerForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 24 17:25:31 PST 2015
                    SOURCE: C:/Users/shaofei/Desktop/play-2.1.4/samples/java/computer-database-jpa/app/views/createForm.scala.html
                    HASH: 3aa082b848218f8122cb5cc7c4bca8dd6ea46d25
                    MATRIX: 736->1|851->52|883->76|967->31|995->50|1023->130|1061->134|1072->138|1110->140|1189->184|1229->215|1269->217|1356->268|1437->327|1487->341|1576->408|1626->422|1719->493|1770->508|1977->693|2196->876|2211->882|2252->901|2338->956
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|45->17|45->17|47->19|51->23|58->30|58->30|58->30|61->33
                    -- GENERATED --
                */
            