// @SOURCE:/Users/xiongkai/Documents/prog/play-2.0/samples/java/computer-database-jpa/conf/routes
// @HASH:d1cdc1d4ce3d781b8764d36cf739451962657af7
// @DATE:Fri Jan 30 23:25:33 EST 2015

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_Application_list1 = Route("GET", PathPattern(List(StaticPart("/planes"))))
                    

// @LINE:12
val controllers_Assets_at2 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    

// @LINE:14
val controllers_Application_search3 = Route("GET", PathPattern(List(StaticPart("/search"))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/planes""","""controllers.Application.list(p:Int ?= 0, s:String ?= "plane_id", o:String ?= "asc", f:String ?= "")"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""","""/search""","""controllers.Application.search(p:Int ?= 0, o:String ?= "asc")"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:9
case controllers_Application_list1(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("plane_id")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(_root_.controllers.Application.list(p, s, o, f), HandlerDef(this, "controllers.Application", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String])))
   }
}
                    

// @LINE:12
case controllers_Assets_at2(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:14
case controllers_Application_search3(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("o", Some("asc"))) { (p, o) =>
        invokeHandler(_root_.controllers.Application.search(p, o), HandlerDef(this, "controllers.Application", "search", Seq(classOf[Int], classOf[String])))
   }
}
                    
}
    
}
                