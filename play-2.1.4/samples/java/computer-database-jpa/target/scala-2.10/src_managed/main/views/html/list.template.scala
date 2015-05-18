
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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Computer.Page,String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(currentPage: Computer.Page, currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.Html = {
        _display_ {
def /*32.2*/header/*32.8*/(key:String, title:String):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*32.38*/("""
    <th class=""""),_display_(Seq[Any](/*33.17*/key/*33.20*/.replace(".","_"))),format.raw/*33.37*/(""" header """),_display_(Seq[Any](/*33.46*/if(currentSortBy == key){/*33.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*33.136*/("""">
        <a href=""""),_display_(Seq[Any](/*34.19*/link(0, key))),format.raw/*34.31*/("""">"""),_display_(Seq[Any](/*34.34*/title)),format.raw/*34.39*/("""</a>
    </th>
""")))};def /*6.2*/link/*6.6*/(newPage:Int, newSortBy:String) = {{
    
    var sortBy = currentSortBy
    var order = currentOrder
    
    if(newSortBy != null) {
        sortBy = newSortBy
        if(currentSortBy == newSortBy) {
            if(currentOrder == "asc") {
                order = "desc"
            } else {
                order = "asc"
            }
        } else {
            order = "asc"
        }
    }
    
    // Generate the link
    routes.Application.list(newPage, sortBy, order, currentFilter)
    
}};
Seq[Any](format.raw/*1.98*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""
    
    <h1 id="homeTitle">"""),_display_(Seq[Any](/*40.25*/Messages("computers.list.title", currentPage.getTotalRowCount))),format.raw/*40.87*/("""</h1>

    """),_display_(Seq[Any](/*42.6*/if(flash.containsKey("success"))/*42.38*/ {_display_(Seq[Any](format.raw/*42.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*44.37*/flash/*44.42*/.get("success"))),format.raw/*44.57*/("""
        </div>
    """)))})),format.raw/*46.6*/(""" 

    <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*50.24*/link(0, "name"))),format.raw/*50.39*/("""" method="GET">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*51.66*/currentFilter)),format.raw/*51.79*/("""" placeholder="Filter by computer name...">
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn primary">
        </form>
        
        <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*55.48*/routes/*55.54*/.Application.create())),format.raw/*55.75*/("""">Add a new computer</a>
        
    </div>
    
    """),_display_(Seq[Any](/*59.6*/if(currentPage.getTotalRowCount == 0)/*59.43*/ {_display_(Seq[Any](format.raw/*59.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*65.7*/else/*65.12*/{_display_(Seq[Any](format.raw/*65.13*/("""
        
        <table class="computers zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*70.22*/header("name", "Computer name"))),format.raw/*70.53*/("""
                    """),_display_(Seq[Any](/*71.22*/header("introduced", "Introduced"))),format.raw/*71.56*/("""
                    """),_display_(Seq[Any](/*72.22*/header("discontinued", "Discontinued"))),format.raw/*72.60*/("""
                    """),_display_(Seq[Any](/*73.22*/header("company.name", "Company"))),format.raw/*73.55*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*78.18*/for(computer <- currentPage.getList) yield /*78.54*/ {_display_(Seq[Any](format.raw/*78.56*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*80.39*/routes/*80.45*/.Application.edit(computer.id))),format.raw/*80.75*/("""">"""),_display_(Seq[Any](/*80.78*/computer/*80.86*/.name)),format.raw/*80.91*/("""</a></td>
                        <td>
                            """),_display_(Seq[Any](/*82.30*/if(computer.introduced == null)/*82.61*/ {_display_(Seq[Any](format.raw/*82.63*/("""
                                <em>-</em>
                            """)))}/*84.31*/else/*84.36*/{_display_(Seq[Any](format.raw/*84.37*/("""
                                """),_display_(Seq[Any](/*85.34*/computer/*85.42*/.introduced.format("dd MMM yyyy"))),format.raw/*85.75*/("""
                            """)))})),format.raw/*86.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*89.30*/if(computer.discontinued == null)/*89.63*/ {_display_(Seq[Any](format.raw/*89.65*/("""
                                <em>-</em>
                            """)))}/*91.31*/else/*91.36*/{_display_(Seq[Any](format.raw/*91.37*/("""
                                """),_display_(Seq[Any](/*92.34*/computer/*92.42*/.discontinued.format("dd MMM yyyy"))),format.raw/*92.77*/("""
                            """)))})),format.raw/*93.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*96.30*/if(computer.company == null)/*96.58*/ {_display_(Seq[Any](format.raw/*96.60*/("""
                                <em>-</em>
                            """)))}/*98.31*/else/*98.36*/{_display_(Seq[Any](format.raw/*98.37*/("""
                                """),_display_(Seq[Any](/*99.34*/computer/*99.42*/.company.name)),format.raw/*99.55*/("""
                            """)))})),format.raw/*100.30*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*103.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(Seq[Any](/*110.18*/if(currentPage.hasPrev)/*110.41*/ {_display_(Seq[Any](format.raw/*110.43*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq[Any](/*112.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*112.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*114.19*/else/*114.24*/{_display_(Seq[Any](format.raw/*114.25*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*118.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*120.36*/currentPage/*120.47*/.getDisplayXtoYofZ)),format.raw/*120.65*/("""</a>
                </li>
                """),_display_(Seq[Any](/*122.18*/if(currentPage.hasNext)/*122.41*/ {_display_(Seq[Any](format.raw/*122.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*124.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*124.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*126.19*/else/*126.24*/{_display_(Seq[Any](format.raw/*126.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*130.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*134.6*/("""
        
""")))})),format.raw/*136.2*/("""

            """))}
    }
    
    def render(currentPage:Computer.Page,currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.Html = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((Computer.Page,String,String,String) => play.api.templates.Html) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 20 23:21:17 PST 2015
                    SOURCE: C:/Users/shaofei/Desktop/play-2.1.4/samples/java/computer-database-jpa/app/views/list.scala.html
                    HASH: 12f967916af42aa5ab7db1c28d2a255d1d7437ac
                    MATRIX: 750->1|907->843|921->849|1015->879|1068->896|1080->899|1119->916|1164->925|1198->951|1286->1015|1343->1036|1377->1048|1416->1051|1443->1056|1481->226|1492->230|2023->97|2052->224|2080->731|2110->841|2138->1072|2176->1075|2188->1079|2227->1081|2293->1111|2377->1173|2424->1185|2465->1217|2505->1219|2622->1300|2636->1305|2673->1320|2725->1341|2819->1399|2856->1414|2973->1495|3008->1508|3255->1719|3270->1725|3313->1746|3403->1801|3449->1838|3489->1840|3613->1947|3626->1952|3665->1953|3821->2073|3874->2104|3932->2126|3988->2160|4046->2182|4106->2220|4164->2242|4219->2275|4337->2357|4389->2393|4429->2395|4529->2459|4544->2465|4596->2495|4635->2498|4652->2506|4679->2511|4783->2579|4823->2610|4863->2612|4955->2686|4968->2691|5007->2692|5077->2726|5094->2734|5149->2767|5211->2797|5336->2886|5378->2919|5418->2921|5510->2995|5523->3000|5562->3001|5632->3035|5649->3043|5706->3078|5768->3108|5893->3197|5930->3225|5970->3227|6062->3301|6075->3306|6114->3307|6184->3341|6201->3349|6236->3362|6299->3392|6406->3466|6567->3590|6600->3613|6641->3615|6751->3688|6814->3728|6899->3794|6913->3799|6953->3800|7124->3938|7234->4011|7255->4022|7296->4040|7377->4084|7410->4107|7451->4109|7561->4182|7624->4222|7705->4284|7719->4289|7759->4290|7926->4424|8006->4472|8049->4483
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|76->50|76->50|77->51|77->51|81->55|81->55|81->55|85->59|85->59|85->59|91->65|91->65|91->65|96->70|96->70|97->71|97->71|98->72|98->72|99->73|99->73|104->78|104->78|104->78|106->80|106->80|106->80|106->80|106->80|106->80|108->82|108->82|108->82|110->84|110->84|110->84|111->85|111->85|111->85|112->86|115->89|115->89|115->89|117->91|117->91|117->91|118->92|118->92|118->92|119->93|122->96|122->96|122->96|124->98|124->98|124->98|125->99|125->99|125->99|126->100|129->103|136->110|136->110|136->110|138->112|138->112|140->114|140->114|140->114|144->118|146->120|146->120|146->120|148->122|148->122|148->122|150->124|150->124|152->126|152->126|152->126|156->130|160->134|162->136
                    -- GENERATED --
                */
            