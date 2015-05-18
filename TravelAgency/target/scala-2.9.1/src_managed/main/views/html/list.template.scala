
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
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[plane.Page,String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(currentPage: plane.Page, currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.Html = {
        _display_ {
def /*32.2*/header/*32.8*/(key:String, title:String):play.api.templates.Html = {_display_(

Seq(format.raw/*32.38*/("""
    <th class=""""),_display_(Seq(/*33.17*/key/*33.20*/.replace(".","_"))),format.raw/*33.37*/(""" header """),_display_(Seq(/*33.46*/if(currentSortBy == key){/*33.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*33.136*/("""">
        <a href=""""),_display_(Seq(/*34.19*/link(0, key))),format.raw/*34.31*/("""">"""),_display_(Seq(/*34.34*/title)),format.raw/*34.39*/("""</a>
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
Seq(format.raw/*1.95*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq(/*38.2*/main/*38.6*/ {_display_(Seq(format.raw/*38.8*/("""
    
    """),_display_(Seq(/*40.6*/if(flash.containsKey("success"))/*40.38*/ {_display_(Seq(format.raw/*40.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq(/*42.37*/flash/*42.42*/.get("success"))),format.raw/*42.57*/("""
        </div>
    """)))})),format.raw/*44.6*/(""" 
    
    """),_display_(Seq(/*46.6*/if(currentPage.getTotalRowCount == 0)/*46.43*/ {_display_(Seq(format.raw/*46.45*/("""
        
        <div class="well">
            <em>No records found</em>
        </div>
        
    """)))}/*52.7*/else/*52.12*/{_display_(Seq(format.raw/*52.13*/("""
        
        <table class="planes zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq(/*57.22*/header("airline", "Airline name"))),format.raw/*57.55*/("""
                    """),_display_(Seq(/*58.22*/header("departure_date", "Departure Date"))),format.raw/*58.64*/("""
                    """),_display_(Seq(/*59.22*/header("dep_id", "Dep ID"))),format.raw/*59.48*/("""
                    """),_display_(Seq(/*60.22*/header("dest_id", "Destination"))),format.raw/*60.54*/("""
                    """),_display_(Seq(/*61.22*/header("flight_number", "Flight Number"))),format.raw/*61.62*/("""
                    """),_display_(Seq(/*62.22*/header("plane_id", "plane_id"))),format.raw/*62.52*/("""
                    """),_display_(Seq(/*63.22*/header("flight_price", "Price"))),format.raw/*63.53*/("""
                </tr>
            </thead>
            
            <tbody>
                """),_display_(Seq(/*68.18*/for(air <- currentPage.getList) yield /*68.49*/ {_display_(Seq(format.raw/*68.51*/("""
                    <tr>
                        <td>
                            """),_display_(Seq(/*71.30*/if(air.airline == null)/*71.53*/ {_display_(Seq(format.raw/*71.55*/("""
                                <em>-</em>
                            """)))}/*73.31*/else/*73.36*/{_display_(Seq(format.raw/*73.37*/("""
                                """),_display_(Seq(/*74.34*/air/*74.37*/.airline)),format.raw/*74.45*/("""
                            """)))})),format.raw/*75.30*/("""
                        </td>
                        
                        
                        <td>
                            """),_display_(Seq(/*80.30*/if(air.departure_date == null)/*80.60*/ {_display_(Seq(format.raw/*80.62*/("""
                                <em>-</em>
                            """)))}/*82.31*/else/*82.36*/{_display_(Seq(format.raw/*82.37*/("""
                                """),_display_(Seq(/*83.34*/air/*83.37*/.departure_date.format("dd MMM yyyy"))),format.raw/*83.74*/("""
                            """)))})),format.raw/*84.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq(/*87.30*/if(air.dep_id == 0)/*87.49*/{_display_(Seq(format.raw/*87.50*/("""
                            	<em>-</em>
                            """)))}/*89.31*/else/*89.35*/{_display_(Seq(format.raw/*89.36*/("""
                            	"""),_display_(Seq(/*90.31*/air/*90.34*/.dep_id)),format.raw/*90.41*/("""
                            """)))})),format.raw/*91.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq(/*94.30*/if(air.dest_id == 0)/*94.50*/{_display_(Seq(format.raw/*94.51*/("""
                            	<em>-</em>
                            """)))}/*96.31*/else/*96.35*/{_display_(Seq(format.raw/*96.36*/("""
                            	"""),_display_(Seq(/*97.31*/air/*97.34*/.dest_id)),format.raw/*97.42*/("""
                            """)))})),format.raw/*98.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq(/*101.30*/if(air.flight_number == 0)/*101.56*/ {_display_(Seq(format.raw/*101.58*/("""
                                <em>-</em>
                            """)))}/*103.31*/else/*103.36*/{_display_(Seq(format.raw/*103.37*/("""
                                """),_display_(Seq(/*104.34*/air/*104.37*/.flight_number)),format.raw/*104.51*/("""
                            """)))})),format.raw/*105.30*/("""
                        </td>
                        <td>
                        	"""),_display_(Seq(/*108.27*/if(air.plane_id == 0)/*108.48*/{_display_(Seq(format.raw/*108.49*/("""
                        	
                        	""")))}/*110.28*/else/*110.32*/{_display_(Seq(format.raw/*110.33*/("""
                        		"""),_display_(Seq(/*111.28*/air/*111.31*/.plane_id)),format.raw/*111.40*/("""	
                        	""")))})),format.raw/*112.27*/("""
                        <td>
                            """),_display_(Seq(/*114.30*/if(air.flight_price == 0)/*114.55*/ {_display_(Seq(format.raw/*114.57*/("""
                                <em>-</em>
                            """)))}/*116.31*/else/*116.36*/{_display_(Seq(format.raw/*116.37*/("""
                                """),_display_(Seq(/*117.34*/air/*117.37*/.flight_price)),format.raw/*117.50*/("""
                            """)))})),format.raw/*118.30*/("""
                        </td>
                   
                    </tr>
                """)))})),format.raw/*122.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination pagination-centered"">
            <ul>
                """),_display_(Seq(/*129.18*/if(currentPage.hasPrev)/*129.41*/ {_display_(Seq(format.raw/*129.43*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq(/*131.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*131.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*133.19*/else/*133.24*/{_display_(Seq(format.raw/*133.25*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*137.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq(/*139.36*/currentPage/*139.47*/.getDisplayXtoYofZ)),format.raw/*139.65*/("""</a>
                </li>
                """),_display_(Seq(/*141.18*/if(currentPage.hasNext)/*141.41*/ {_display_(Seq(format.raw/*141.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq(/*143.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*143.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*145.19*/else/*145.24*/{_display_(Seq(format.raw/*145.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*149.18*/("""
            </ul>
        </div>
    """)))})),format.raw/*152.6*/("""
""")))})),format.raw/*153.2*/("""

            """))}
    }
    
    def render(currentPage:plane.Page,currentSortBy:String,currentOrder:String,currentFilter:String) = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((plane.Page,String,String,String) => play.api.templates.Html) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jan 30 23:25:34 EST 2015
                    SOURCE: /Users/xiongkai/Documents/prog/play-2.0/samples/java/computer-database-jpa/app/views/list.scala.html
                    HASH: e706b3ce51e4487f7fa6550adf2ee621d41fd9f7
                    MATRIX: 779->1|933->840|947->846|1036->876|1084->893|1096->896|1135->913|1175->922|1209->948|1297->1012|1349->1033|1383->1045|1417->1048|1444->1053|1482->223|1493->227|2019->94|2048->221|2076->728|2106->838|2134->1069|2167->1072|2179->1076|2213->1078|2254->1089|2295->1121|2330->1123|2442->1204|2456->1209|2493->1224|2545->1245|2587->1257|2633->1294|2668->1296|2790->1401|2803->1406|2837->1407|2985->1524|3040->1557|3093->1579|3157->1621|3210->1643|3258->1669|3311->1691|3365->1723|3418->1745|3480->1785|3533->1807|3585->1837|3638->1859|3691->1890|3816->1984|3863->2015|3898->2017|4013->2101|4045->2124|4080->2126|4172->2200|4185->2205|4219->2206|4284->2240|4296->2243|4326->2251|4388->2281|4558->2420|4597->2450|4632->2452|4724->2526|4737->2531|4771->2532|4836->2566|4848->2569|4907->2606|4969->2636|5089->2725|5117->2744|5151->2745|5240->2816|5253->2820|5287->2821|5349->2852|5361->2855|5390->2862|5452->2892|5572->2981|5601->3001|5635->3002|5724->3073|5737->3077|5771->3078|5833->3109|5845->3112|5875->3120|5937->3150|6058->3239|6094->3265|6130->3267|6223->3341|6237->3346|6272->3347|6338->3381|6351->3384|6388->3398|6451->3428|6569->3514|6600->3535|6635->3536|6708->3590|6722->3594|6757->3595|6817->3623|6830->3626|6862->3635|6923->3663|7014->3722|7049->3747|7085->3749|7178->3823|7192->3828|7227->3829|7293->3863|7306->3866|7342->3879|7405->3909|7532->4003|7709->4148|7742->4171|7778->4173|7883->4246|7946->4286|8031->4352|8045->4357|8080->4358|8251->4496|8356->4569|8377->4580|8418->4598|8494->4642|8527->4665|8563->4667|8668->4740|8731->4780|8812->4842|8826->4847|8861->4848|9028->4982|9099->5021|9133->5023
                    LINES: 27->1|29->32|29->32|31->32|32->33|32->33|32->33|32->33|32->33|32->33|33->34|33->34|33->34|33->34|35->6|35->6|57->1|59->5|60->27|62->31|63->36|65->38|65->38|65->38|67->40|67->40|67->40|69->42|69->42|69->42|71->44|73->46|73->46|73->46|79->52|79->52|79->52|84->57|84->57|85->58|85->58|86->59|86->59|87->60|87->60|88->61|88->61|89->62|89->62|90->63|90->63|95->68|95->68|95->68|98->71|98->71|98->71|100->73|100->73|100->73|101->74|101->74|101->74|102->75|107->80|107->80|107->80|109->82|109->82|109->82|110->83|110->83|110->83|111->84|114->87|114->87|114->87|116->89|116->89|116->89|117->90|117->90|117->90|118->91|121->94|121->94|121->94|123->96|123->96|123->96|124->97|124->97|124->97|125->98|128->101|128->101|128->101|130->103|130->103|130->103|131->104|131->104|131->104|132->105|135->108|135->108|135->108|137->110|137->110|137->110|138->111|138->111|138->111|139->112|141->114|141->114|141->114|143->116|143->116|143->116|144->117|144->117|144->117|145->118|149->122|156->129|156->129|156->129|158->131|158->131|160->133|160->133|160->133|164->137|166->139|166->139|166->139|168->141|168->141|168->141|170->143|170->143|172->145|172->145|172->145|176->149|179->152|180->153
                    -- GENERATED --
                */
            