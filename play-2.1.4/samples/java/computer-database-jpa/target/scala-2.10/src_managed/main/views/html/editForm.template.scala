
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
object editForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Computer],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Long, computerForm: Form[Computer]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
    <h1>Edit 1</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.Application.update(id))/*11.41*/ {_display_(Seq[Any](format.raw/*11.43*/("""
        
        <fieldset>
        
            """),_display_(Seq[Any](/*15.14*/inputText(computerForm("name"), '_label -> "Computer name"))),format.raw/*15.73*/("""
            """),_display_(Seq[Any](/*16.14*/inputText(computerForm("introduced"), '_label -> "Introduced date"))),format.raw/*16.81*/("""
            """),_display_(Seq[Any](/*17.14*/inputText(computerForm("discontinued"), '_label -> "Discontinued date"))),format.raw/*17.85*/("""
            
            """),_display_(Seq[Any](/*19.14*/select(
                field = computerForm("company.id"), 
                options(Company.options), 
                '_label -> "Company", '_default -> "-- Choose a company --"
            ))),format.raw/*23.14*/("""
        
        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Save this computer" class="btn primary"> or 
            <a href=""""),_display_(Seq[Any](/*29.23*/routes/*29.29*/.Application.list())),format.raw/*29.48*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*32.6*/("""
    
    """),_display_(Seq[Any](/*34.6*/form(routes.Application.delete(id), 'class -> "topRight")/*34.63*/ {_display_(Seq[Any](format.raw/*34.65*/("""
        <input type="submit" value="Delete this computer" class="btn danger">
    """)))})),format.raw/*36.6*/("""
    
""")))})),format.raw/*38.2*/("""
"""))}
    }
    
    def render(id:Long,computerForm:Form[Computer]): play.api.templates.Html = apply(id,computerForm)
    
    def f:((Long,Form[Computer]) => play.api.templates.Html) = (id,computerForm) => apply(id,computerForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jan 21 00:26:42 PST 2015
                    SOURCE: C:/Users/shaofei/Desktop/play-2.1.4/samples/java/computer-database-jpa/app/views/editForm.scala.html
                    HASH: 7d406ac0d177e842e82f1673fbc23372075019ca
                    MATRIX: 739->1|864->62|896->86|980->41|1008->60|1036->140|1074->144|1085->148|1123->150|1194->186|1238->221|1278->223|1365->274|1446->333|1496->347|1585->414|1635->428|1728->499|1791->526|2006->719|2218->895|2233->901|2274->920|2360->975|2406->986|2472->1043|2512->1045|2627->1129|2665->1136
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|45->17|45->17|47->19|51->23|57->29|57->29|57->29|60->32|62->34|62->34|62->34|64->36|66->38
                    -- GENERATED --
                */
            