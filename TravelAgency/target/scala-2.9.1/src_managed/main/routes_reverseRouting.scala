// @SOURCE:/Users/xiongkai/Documents/prog/play-2.0/samples/java/computer-database-jpa/conf/routes
// @HASH:d1cdc1d4ce3d781b8764d36cf739451962657af7
// @DATE:Fri Jan 30 23:25:33 EST 2015

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:14
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:14
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def list(p:Int = 0, s:String = "plane_id", o:String = "asc", f:String = "") = {
   Call("GET", "/planes" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "plane_id") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:14
def search(p:Int = 0, o:String = "asc") = {
   Call("GET", "/search" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)))))
}
                                                        

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:14
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:14
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def list = JavascriptReverseRoute(
   "controllers.Application.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"/planes" + _qS([(p == """ +  implicitly[JavascriptLitteral[Int]].to(0) + """ ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == """ +  implicitly[JavascriptLitteral[String]].to("plane_id") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == """ +  implicitly[JavascriptLitteral[String]].to("asc") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == """ +  implicitly[JavascriptLitteral[String]].to("") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:14
def search = JavascriptReverseRoute(
   "controllers.Application.search",
   """
      function(p,o) {
      return _wA({method:"GET", url:"/search" + _qS([(p == """ +  implicitly[JavascriptLitteral[Int]].to(0) + """ ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (o == """ +  implicitly[JavascriptLitteral[String]].to("asc") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o))])})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:14
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:14
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def list(p:Int, s:String, o:String, f:String) = new play.api.mvc.HandlerRef(
   controllers.Application.list(p, s, o, f), HandlerDef(this, "controllers.Application", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]))
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:14
def search(p:Int, o:String) = new play.api.mvc.HandlerRef(
   controllers.Application.search(p, o), HandlerDef(this, "controllers.Application", "search", Seq(classOf[Int], classOf[String]))
)
                              

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                