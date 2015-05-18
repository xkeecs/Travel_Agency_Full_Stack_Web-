
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<!DOCTYPE html>
<html>
    <head>
        <title>Computers database</title>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*7.119*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*8.70*/routes/*8.76*/.Assets.at("stylesheets/main.css"))),format.raw/*8.110*/(""""> 
    </head>
    <body>
        
        <header class="topbar">
            <h1 class="fill">
                <a href=""""),_display_(Seq[Any](/*14.27*/routes/*14.33*/.Application.index())),format.raw/*14.53*/("""">
                    Play 2.0 sample application &mdash; Computer database
                </a>
            </h1>
        </header>
        
        <section id="main">
            """),_display_(Seq[Any](/*21.14*/content)),format.raw/*21.21*/("""
        </section>
        
    </body>
</html>
"""))}
    }
    
    def render(content:Html): play.api.templates.Html = apply(content)
    
    def f:((Html) => play.api.templates.Html) = (content) => apply(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 20 23:21:17 PST 2015
                    SOURCE: C:/Users/shaofei/Desktop/play-2.1.4/samples/java/computer-database-jpa/app/views/main.scala.html
                    HASH: 6da78b864eb8add205e5d92d8539308a4a652fac
                    MATRIX: 720->1|812->16|994->163|1008->169|1073->212|1181->285|1195->291|1251->325|1411->449|1426->455|1468->475|1688->659|1717->666
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|49->21|49->21
                    -- GENERATED --
                */
            