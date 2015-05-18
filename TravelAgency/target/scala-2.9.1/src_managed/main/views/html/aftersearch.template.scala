
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
object aftersearch extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[plane.Page,hotels.Page,Details.Page,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(planePage : plane.Page, hotelPage: hotels.Page, detailsPage : Details.Page, currentOrder: String):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.100*/("""

<!DOCTYPE html>
<html>
    <head>
        <title>Nakisa Travel Agency</title>
 		<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*7.65*/routes/*7.71*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*7.114*/(""""> 	        
		<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*8.64*/routes/*8.70*/.Assets.at("stylesheets/new.bootstrap.min.css"))),format.raw/*8.117*/(""""> 
	   
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*10.70*/routes/*10.76*/.Assets.at("stylesheets/main.css"))),format.raw/*10.110*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*11.70*/routes/*11.76*/.Assets.at("stylesheets/bootstrap-theme.min.css"))),format.raw/*11.125*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*12.70*/routes/*12.76*/.Assets.at("stylesheets/bootstrap-responsive.css"))),format.raw/*12.126*/(""""> 
    	<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*13.67*/routes/*13.73*/.Assets.at("stylesheets/datepicker.css"))),format.raw/*13.113*/(""""> 
        
    	<script type="text/javascript" src=""""),_display_(Seq(/*15.43*/routes/*15.49*/.Assets.at("jquery/jquery-2.1.3.min.js"))),format.raw/*15.89*/(""""></script>
    	<script type="text/javascript" src=""""),_display_(Seq(/*16.43*/routes/*16.49*/.Assets.at("jquery/jquery-tablepage-1.0.js"))),format.raw/*16.93*/(""""></script>

    	<script type="text/javascript" src=""""),_display_(Seq(/*18.43*/routes/*18.49*/.Assets.at("jquery/jquery.js"))),format.raw/*18.79*/(""""></script>

		<link type="text/css" href=""""),_display_(Seq(/*20.32*/routes/*20.38*/.Assets.at("stylesheets/datepicker.css"))),format.raw/*20.78*/(""" rel="stylesheet">
    	<script type="text/javascript" src=""""),_display_(Seq(/*21.43*/routes/*21.49*/.Assets.at("jquery/bootstrap-datepicker.js"))),format.raw/*21.93*/(""""></script>
    </head>
    <body>

  <div class="container">
  <nav id="myNavbar" class="navbar navbar-default navbar-inverse navbar-fixed-top" role="navigation">
<!-- Brand and toggle get grouped for better mobile display -->
<div class="container">
<div class="navbar-header">
<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbarCollapse">
<span class="sr-only">Toggle navigation</span>
<span class="icon-bar"></span>
<span class="icon-bar"></span>
<span class="icon-bar"></span>
</button>
<a class="navbar-brand" href="#">Nakisa</a>
</div>
<!-- Collect the nav links, forms, and other content for toggling -->
<div class="collapse navbar-collapse" id="navbarCollapse">
<ul class="nav navbar-nav">
<li class="active"><a href="" target="_self">Home</a></li>
<li><a href="" target="_self">About</a></li>
<li><a href="" target="_self">Contact</a></li>
</ul>
</div>
</div>
</nav>

<div class="jumbotron">
<h1 align="middle">Nakisa Travel Agency</h1>
</div>

   <!-- ===================== Search Form =====================  --> 
     <div class="container-fluid" style="text-align:center" >      
      """),_display_(Seq(/*55.8*/helper/*55.14*/.form(action=routes.Application.search())/*55.55*/{_display_(Seq(format.raw/*55.56*/("""
      <div class="row-fluid" >
        <div class="span12">
            
          <div class="row-fluid" style="text-align: center">   
            
            <div class="span6 lightblue">
              <label>Depart From</label>
              <select name="dep_id" class="span12" align="right">
              	<option value="1" selected="Montreal">Montreal</option>
  				<option value="2">Quebec City</option>
  				<option value="3">Ottawa</option>
  				<option value="4">Toronto</option>
  				<option value="5" >Los Angeles</option> 
              </select>  
            
            </div><!--/span-->
            
            <div class="span6 lightblue">
              <label>Destination</label>
              <select name="destination" class="span12" align="center">
              	<option value="1">Montreal</option>
  				<option value="2">Quebec City</option>
  				<option value="3">Ottawa</option>
  				<option value="4">Toronto</option>
  				<option value="5" selected="Los Angeles"> Los Angeles
  				 </option> 
              </select>  
            </div><!--/span-->
          </div><!--/row-->
      
          <div class="row-fluid">
          
            <div class="span6 bgcolor">
              <label>Departure Date</label>
              <input type="text" id="dp1" name="date" class="span12" data-date-format="yyyy-mm-dd" placeholder="yyyy-MM-dd" align="center">    
            </div><!--/span-->
            
			<script type="text/javascript">
				$('#dp1').datepicker();
			</script>
			
             <div class="span6 bgcolor">
              <label>Duration</label>
              <input type="text" data-provide="datepicker" name="duration" class="span12 input-mini" placeholder="In weeks" align="center">   
            </div><!--/span-->
          </div><!--/row-->
      
          <div class="row-fluid">
           
            <div class="span6 bgcolor">
              <label>Number of People </label>
              <input type="text" name="numPeople" class="span12 ">    
            </div><!--/span-->
            
            <div class="span6 bgcolor">
              <label>Category </label>
              <input type="text" name="category" class="span12 ">    
            </div><!--/span-->
          </div><!--/row-->           
        
        <input type="submit" id="searchsubmit" value="Search" class="btn primary pull-right">
        
        <div class="span4">

        </div><!--/span-->       
      </div><!--/row-->
      """)))})),format.raw/*122.8*/("""
    </div>
    
     <!-- ==================== Display Flights DB ================ -->
    <h1> Results: </h1>
        """),_display_(Seq(/*127.10*/if(planePage.getTotalRowCount == 0)/*127.45*/ {_display_(Seq(format.raw/*127.47*/("""
        
        <div class="well">
            <em>No records found</em>
        </div>
        
    """)))}/*133.7*/else/*133.12*/{_display_(Seq(format.raw/*133.13*/("""
        
        <table class="planes zebra-striped">
            <thead>
			  <tr >
   				<th class="header" align="center" >Airline name</th>
   				<th class="header" align="center" >Departure Date</th>
   				<th class="header" align="center" >Dep ID</th>
   				<th class="header" align="center" >Destination</th>
   				<th class="header" align="center" >Flight Number</th>
   				<th class="header" align="center" >plane_id</th>
   				<th class="header" align="center" >Price</th>
			  </tr>
		    </thead>

            <tbody>
                """),_display_(Seq(/*149.18*/for(air <- planePage.getList) yield /*149.47*/ {_display_(Seq(format.raw/*149.49*/("""
                    <tr>
                        <td>
                            """),_display_(Seq(/*152.30*/if(air.airline == null)/*152.53*/ {_display_(Seq(format.raw/*152.55*/("""
                                <em>-</em>
                            """)))}/*154.31*/else/*154.36*/{_display_(Seq(format.raw/*154.37*/("""
                                """),_display_(Seq(/*155.34*/air/*155.37*/.airline)),format.raw/*155.45*/("""
                            """)))})),format.raw/*156.30*/("""
                        </td>
                        
                        
                        <td>
                            """),_display_(Seq(/*161.30*/if(air.departure_date == null)/*161.60*/ {_display_(Seq(format.raw/*161.62*/("""
                                <em>-</em>
                            """)))}/*163.31*/else/*163.36*/{_display_(Seq(format.raw/*163.37*/("""
                                """),_display_(Seq(/*164.34*/air/*164.37*/.departure_date.format("dd MMM yyyy"))),format.raw/*164.74*/("""
                            """)))})),format.raw/*165.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq(/*168.30*/if(air.dep_id == 0)/*168.49*/{_display_(Seq(format.raw/*168.50*/("""
                            <em>-</em>
                            """)))}/*170.31*/else/*170.35*/{_display_(Seq(format.raw/*170.36*/("""
                            """),_display_(Seq(/*171.30*/air/*171.33*/.dep_id)),format.raw/*171.40*/("""
                            """)))})),format.raw/*172.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq(/*175.30*/if(air.dest_id == 0)/*175.50*/{_display_(Seq(format.raw/*175.51*/("""
                            <em>-</em>
                            """)))}/*177.31*/else/*177.35*/{_display_(Seq(format.raw/*177.36*/("""
                            """),_display_(Seq(/*178.30*/air/*178.33*/.dest_id)),format.raw/*178.41*/("""
                            """)))})),format.raw/*179.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq(/*182.30*/if(air.flight_number == 0)/*182.56*/ {_display_(Seq(format.raw/*182.58*/("""
                                <em>-</em>
                            """)))}/*184.31*/else/*184.36*/{_display_(Seq(format.raw/*184.37*/("""
                                """),_display_(Seq(/*185.34*/air/*185.37*/.flight_number)),format.raw/*185.51*/("""
                            """)))})),format.raw/*186.30*/("""
                        </td>
                        <td>
                        """),_display_(Seq(/*189.26*/if(air.plane_id == 0)/*189.47*/{_display_(Seq(format.raw/*189.48*/("""
                        
                        """)))}/*191.27*/else/*191.31*/{_display_(Seq(format.raw/*191.32*/("""
                        """),_display_(Seq(/*192.26*/air/*192.29*/.plane_id)),format.raw/*192.38*/("""
                        """)))})),format.raw/*193.26*/("""
                        <td>
                            """),_display_(Seq(/*195.30*/if(air.flight_price == 0)/*195.55*/ {_display_(Seq(format.raw/*195.57*/("""
                                <em>-</em>
                            """)))}/*197.31*/else/*197.36*/{_display_(Seq(format.raw/*197.37*/("""
                                """),_display_(Seq(/*198.34*/air/*198.37*/.flight_price)),format.raw/*198.50*/("""
                            """)))})),format.raw/*199.30*/("""
                        </td>
                   
                    </tr>
                """)))})),format.raw/*203.18*/("""	
            </tbody>
        </table>

		<span id='table_plane' class="glyphicon" aria-hidden="true"></span>

		<script>$("#tbl").tablepage($("#table_plane"), 10);</script>
     """)))})),format.raw/*210.7*/("""
     <!-- ==================== Hotel, Flights ================ -->
     <h1> Recommended Hotels </h1>
       """),_display_(Seq(/*213.9*/if(hotelPage.getTotalRowCount == 0)/*213.44*/ {_display_(Seq(format.raw/*213.46*/("""
        
        <div class="well">
            <em>No records found</em>
        </div>
        
    """)))}/*219.7*/else/*219.12*/{_display_(Seq(format.raw/*219.13*/("""
        
        <table id="tbhotels" class="planes zebra-striped">
            <thead>
			  <tr >
   				<th class="header" align="center" >hotel_id</th>
   				<th class="header" align="center" >dest_id</th>
   				<th class="header" align="center" >Category</th>
   				<th class="header" align="center" >Price</th>
			  </tr>
		    </thead>

            <tbody>
                """),_display_(Seq(/*232.18*/for(hotels <- hotelPage.getList) yield /*232.50*/ {_display_(Seq(format.raw/*232.52*/("""
                    <tr>
                        <td>
                            """),_display_(Seq(/*235.30*/if(hotels.hotel_id == 0)/*235.54*/ {_display_(Seq(format.raw/*235.56*/("""
                                <em>-</em>
                            """)))}/*237.31*/else/*237.36*/{_display_(Seq(format.raw/*237.37*/("""
                                """),_display_(Seq(/*238.34*/hotels/*238.40*/.hotel_id)),format.raw/*238.49*/("""
                            """)))})),format.raw/*239.30*/("""
                        </td>
                        
                        
                        <td>
                            """),_display_(Seq(/*244.30*/if(hotels.dest_id == 0)/*244.53*/ {_display_(Seq(format.raw/*244.55*/("""
                                <em>-</em>
                            """)))}/*246.31*/else/*246.36*/{_display_(Seq(format.raw/*246.37*/("""
                                """),_display_(Seq(/*247.34*/hotels/*247.40*/.dest_id)),format.raw/*247.48*/("""
                            """)))})),format.raw/*248.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq(/*251.30*/if(hotels.category == 0)/*251.54*/{_display_(Seq(format.raw/*251.55*/("""
                            <em>-</em>
                            """)))}/*253.31*/else/*253.35*/{_display_(Seq(format.raw/*253.36*/("""
                            """),_display_(Seq(/*254.30*/hotels/*254.36*/.category)),format.raw/*254.45*/("""
                            """)))})),format.raw/*255.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq(/*258.30*/if(hotels.price_per_week == 0)/*258.60*/{_display_(Seq(format.raw/*258.61*/("""
                            <em>-</em>
                            """)))}/*260.31*/else/*260.35*/{_display_(Seq(format.raw/*260.36*/("""
                            """),_display_(Seq(/*261.30*/hotels/*261.36*/.price_per_week)),format.raw/*261.51*/("""
                            """)))})),format.raw/*262.30*/("""
                        </td>
                   
                    </tr>
                """)))})),format.raw/*266.18*/("""	
            </tbody>
        </table>

		<span id='table_hotels' class="glyphicon" aria-hidden="true"></span>

		<script>$("#tbhotels").tablepage($("#table_hotels"), 10);</script>
     """)))})),format.raw/*273.7*/("""
     
     
     <!-- ======================== Details ========================== -->
     
     <h1> Details </h1>
       """),_display_(Seq(/*279.9*/if(detailsPage.getTotalRowCount == 0)/*279.46*/ {_display_(Seq(format.raw/*279.48*/("""
        
        <div class="well">
            <em>No records found</em>
        </div>
        
    """)))}/*285.7*/else/*285.12*/{_display_(Seq(format.raw/*285.13*/("""
        
        <table id="tbdetails" class="planes zebra-striped">
            <thead>
			  <tr >
   				<th class="header" align="center" >plane_id</th>
   				<th class="header" align="center" >Price</th>
   				<th class="header" align="center" >Taxes</th>
   				<th class="header" align="center" >Total Price</th>
			  </tr>
		    </thead>

            <tbody>
                """),_display_(Seq(/*298.18*/for(detail <- detailsPage.getList) yield /*298.52*/ {_display_(Seq(format.raw/*298.54*/("""
                    <tr>
                        <td>
                            """),_display_(Seq(/*301.30*/if(detail.plane_id == 0)/*301.54*/ {_display_(Seq(format.raw/*301.56*/("""
                                <em>-</em>
                            """)))}/*303.31*/else/*303.36*/{_display_(Seq(format.raw/*303.37*/("""
                                """),_display_(Seq(/*304.34*/detail/*304.40*/.plane_id)),format.raw/*304.49*/("""
                            """)))})),format.raw/*305.30*/("""
                        </td>
                        
                        
                        <td>
                            """),_display_(Seq(/*310.30*/if(detail.price == 0)/*310.51*/ {_display_(Seq(format.raw/*310.53*/("""
                                <em>-</em>
                            """)))}/*312.31*/else/*312.36*/{_display_(Seq(format.raw/*312.37*/("""
                                """),_display_(Seq(/*313.34*/detail/*313.40*/.price)),format.raw/*313.46*/("""
                            """)))})),format.raw/*314.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq(/*317.30*/if(detail.taxes == 0)/*317.51*/{_display_(Seq(format.raw/*317.52*/("""
                            <em>-</em>
                            """)))}/*319.31*/else/*319.35*/{_display_(Seq(format.raw/*319.36*/("""
                            """),_display_(Seq(/*320.30*/detail/*320.36*/.taxes)),format.raw/*320.42*/("""
                            """)))})),format.raw/*321.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq(/*324.30*/if(detail.totalPrice == 0)/*324.56*/{_display_(Seq(format.raw/*324.57*/("""
                            <em>-</em>
                            """)))}/*326.31*/else/*326.35*/{_display_(Seq(format.raw/*326.36*/("""
                            """),_display_(Seq(/*327.30*/detail/*327.36*/.totalPrice)),format.raw/*327.47*/("""
                            """)))})),format.raw/*328.30*/("""
                        </td>
                   
                    </tr>
                """)))})),format.raw/*332.18*/("""	
            </tbody>
        </table>

		<span id='table_details' class="glyphicon" aria-hidden="true"></span>

		<script>$("#tbdetails").tablepage($("#table_details"), 10);</script>
     """)))})),format.raw/*339.7*/("""
<hr>
<div class="row">
<div class="col-xs-12">
<footer>
<p>&copy; Copyright 2015 Nakisa</p>
</footer>
</div>
</div>
</div>
        
    </body>
</html>
"""))}
    }
    
    def render(planePage:plane.Page,hotelPage:hotels.Page,detailsPage:Details.Page,currentOrder:String) = apply(planePage,hotelPage,detailsPage,currentOrder)
    
    def f:((plane.Page,hotels.Page,Details.Page,String) => play.api.templates.Html) = (planePage,hotelPage,detailsPage,currentOrder) => apply(planePage,hotelPage,detailsPage,currentOrder)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 31 00:57:49 EST 2015
                    SOURCE: /Users/xiongkai/Documents/prog/play-2.0/samples/java/computer-database-jpa/app/views/aftersearch.scala.html
                    HASH: 032c5c339aa5036a4f15eb7f50c8a6e702685b1c
                    MATRIX: 797->1|968->99|1142->243|1156->249|1221->292|1327->368|1341->374|1410->421|1519->499|1534->505|1591->539|1695->612|1710->618|1782->667|1886->740|1901->746|1974->796|2075->866|2090->872|2153->912|2239->967|2254->973|2316->1013|2401->1067|2416->1073|2482->1117|2568->1172|2583->1178|2635->1208|2710->1252|2725->1258|2787->1298|2879->1359|2894->1365|2960->1409|4127->2546|4142->2552|4192->2593|4226->2594|6745->5081|6898->5202|6943->5237|6979->5239|7102->5344|7116->5349|7151->5350|7738->5905|7784->5934|7820->5936|7936->6020|7969->6043|8005->6045|8098->6119|8112->6124|8147->6125|8213->6159|8226->6162|8257->6170|8320->6200|8491->6339|8531->6369|8567->6371|8660->6445|8674->6450|8709->6451|8775->6485|8788->6488|8848->6525|8911->6555|9032->6644|9061->6663|9096->6664|9185->6734|9199->6738|9234->6739|9296->6769|9309->6772|9339->6779|9402->6809|9523->6898|9553->6918|9588->6919|9677->6989|9691->6993|9726->6994|9788->7024|9801->7027|9832->7035|9895->7065|10016->7154|10052->7180|10088->7182|10181->7256|10195->7261|10230->7262|10296->7296|10309->7299|10346->7313|10409->7343|10526->7428|10557->7449|10592->7450|10663->7502|10677->7506|10712->7507|10770->7533|10783->7536|10815->7545|10874->7571|10965->7630|11000->7655|11036->7657|11129->7731|11143->7736|11178->7737|11244->7771|11257->7774|11293->7787|11356->7817|11483->7911|11696->8092|11838->8203|11883->8238|11919->8240|12042->8345|12056->8350|12091->8351|12507->8735|12556->8767|12592->8769|12708->8853|12742->8877|12778->8879|12871->8953|12885->8958|12920->8959|12986->8993|13002->8999|13034->9008|13097->9038|13268->9177|13301->9200|13337->9202|13430->9276|13444->9281|13479->9282|13545->9316|13561->9322|13592->9330|13655->9360|13776->9449|13810->9473|13845->9474|13934->9544|13948->9548|13983->9549|14045->9579|14061->9585|14093->9594|14156->9624|14277->9713|14317->9743|14352->9744|14441->9814|14455->9818|14490->9819|14552->9849|14568->9855|14606->9870|14669->9900|14796->9994|15016->10182|15172->10307|15219->10344|15255->10346|15378->10451|15392->10456|15427->10457|15845->10843|15896->10877|15932->10879|16048->10963|16082->10987|16118->10989|16211->11063|16225->11068|16260->11069|16326->11103|16342->11109|16374->11118|16437->11148|16608->11287|16639->11308|16675->11310|16768->11384|16782->11389|16817->11390|16883->11424|16899->11430|16928->11436|16991->11466|17112->11555|17143->11576|17178->11577|17267->11647|17281->11651|17316->11652|17378->11682|17394->11688|17423->11694|17486->11724|17607->11813|17643->11839|17678->11840|17767->11910|17781->11914|17816->11915|17878->11945|17894->11951|17928->11962|17991->11992|18118->12086|18341->12277
                    LINES: 27->1|30->1|36->7|36->7|36->7|37->8|37->8|37->8|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|44->15|44->15|44->15|45->16|45->16|45->16|47->18|47->18|47->18|49->20|49->20|49->20|50->21|50->21|50->21|84->55|84->55|84->55|84->55|151->122|156->127|156->127|156->127|162->133|162->133|162->133|178->149|178->149|178->149|181->152|181->152|181->152|183->154|183->154|183->154|184->155|184->155|184->155|185->156|190->161|190->161|190->161|192->163|192->163|192->163|193->164|193->164|193->164|194->165|197->168|197->168|197->168|199->170|199->170|199->170|200->171|200->171|200->171|201->172|204->175|204->175|204->175|206->177|206->177|206->177|207->178|207->178|207->178|208->179|211->182|211->182|211->182|213->184|213->184|213->184|214->185|214->185|214->185|215->186|218->189|218->189|218->189|220->191|220->191|220->191|221->192|221->192|221->192|222->193|224->195|224->195|224->195|226->197|226->197|226->197|227->198|227->198|227->198|228->199|232->203|239->210|242->213|242->213|242->213|248->219|248->219|248->219|261->232|261->232|261->232|264->235|264->235|264->235|266->237|266->237|266->237|267->238|267->238|267->238|268->239|273->244|273->244|273->244|275->246|275->246|275->246|276->247|276->247|276->247|277->248|280->251|280->251|280->251|282->253|282->253|282->253|283->254|283->254|283->254|284->255|287->258|287->258|287->258|289->260|289->260|289->260|290->261|290->261|290->261|291->262|295->266|302->273|308->279|308->279|308->279|314->285|314->285|314->285|327->298|327->298|327->298|330->301|330->301|330->301|332->303|332->303|332->303|333->304|333->304|333->304|334->305|339->310|339->310|339->310|341->312|341->312|341->312|342->313|342->313|342->313|343->314|346->317|346->317|346->317|348->319|348->319|348->319|349->320|349->320|349->320|350->321|353->324|353->324|353->324|355->326|355->326|355->326|356->327|356->327|356->327|357->328|361->332|368->339
                    -- GENERATED --
                */
            