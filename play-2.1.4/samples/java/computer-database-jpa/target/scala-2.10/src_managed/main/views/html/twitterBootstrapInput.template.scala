
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
object twitterBootstrapInput extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[helper.FieldElements,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(elements: helper.FieldElements):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*5.52*/("""
<div class="clearfix """),_display_(Seq[Any](/*6.23*/if(elements.hasErrors)/*6.45*/ {_display_(Seq[Any](format.raw/*6.47*/("""error""")))})),format.raw/*6.53*/("""">
    <label for=""""),_display_(Seq[Any](/*7.18*/elements/*7.26*/.id)),format.raw/*7.29*/("""">"""),_display_(Seq[Any](/*7.32*/elements/*7.40*/.label)),format.raw/*7.46*/("""</label>
    <div class="input">
        """),_display_(Seq[Any](/*9.10*/elements/*9.18*/.input)),format.raw/*9.24*/("""
        <span class="help-inline">"""),_display_(Seq[Any](/*10.36*/elements/*10.44*/.infos.mkString(", "))),format.raw/*10.65*/("""</span> 
    </div>
</div>
"""))}
    }
    
    def render(elements:helper.FieldElements): play.api.templates.Html = apply(elements)
    
    def f:((helper.FieldElements) => play.api.templates.Html) = (elements) => apply(elements)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 20 23:21:17 PST 2015
                    SOURCE: C:/Users/shaofei/Desktop/play-2.1.4/samples/java/computer-database-jpa/app/views/twitterBootstrapInput.scala.html
                    HASH: 69ac1da3a5c9505436ae5a8eb5dc1c480cf7a34a
                    MATRIX: 753->1|862->33|891->190|949->213|979->235|1018->237|1055->243|1110->263|1126->271|1150->274|1188->277|1204->285|1231->291|1308->333|1324->341|1351->347|1423->383|1440->391|1483->412
                    LINES: 26->1|29->1|31->5|32->6|32->6|32->6|32->6|33->7|33->7|33->7|33->7|33->7|33->7|35->9|35->9|35->9|36->10|36->10|36->10
                    -- GENERATED --
                */
            