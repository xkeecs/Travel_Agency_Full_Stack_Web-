
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(content: Html):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.17*/("""

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
     """),_display_(Seq(/*127.7*/content)),format.raw/*127.14*/("""
      
     <!-- ==================== Hotel, Flights ================ -->
      <div class="row">
        <div class="col-lg-4">
          <img class="img-circle" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image" style="width: 140px; height: 140px;">
          <h2>Flight Recommendation</h2>
          <p>Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna.</p>
          <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image" style="width: 140px; height: 140px;">
          <h2>Hotel Search</h2>
          <p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh.</p>
          <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image" style="width: 140px; height: 140px;">
          <h2>Details</h2>
          <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
          <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
      </div>
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
    
    def render(content:Html) = apply(content)
    
    def f:((Html) => play.api.templates.Html) = (content) => apply(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 31 00:52:58 EST 2015
                    SOURCE: /Users/xiongkai/Documents/prog/play-2.0/samples/java/computer-database-jpa/app/views/main.scala.html
                    HASH: 9f861d9e452564a427ed533d652d5a50714e2d2d
                    MATRIX: 752->1|839->16|1013->160|1027->166|1092->209|1198->285|1212->291|1281->338|1390->416|1405->422|1462->456|1566->529|1581->535|1653->584|1757->657|1772->663|1845->713|1946->783|1961->789|2024->829|2110->884|2125->890|2187->930|2272->984|2287->990|2353->1034|2439->1089|2454->1095|2506->1125|2581->1169|2596->1175|2658->1215|2750->1276|2765->1282|2831->1326|4068->2533|4083->2539|4133->2580|4167->2581|6686->5068|6812->5163|6842->5170
                    LINES: 27->1|30->1|36->7|36->7|36->7|37->8|37->8|37->8|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|44->15|44->15|44->15|45->16|45->16|45->16|47->18|47->18|47->18|49->20|49->20|49->20|50->21|50->21|50->21|84->55|84->55|84->55|84->55|151->122|156->127|156->127
                    -- GENERATED --
                */
            