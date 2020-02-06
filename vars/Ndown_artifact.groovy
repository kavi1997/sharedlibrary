def call(jsondata){
def jsonString = jsondata
//println(jsonString)
def jsonObj = readJSON text: jsonString
//println(jsonObj.brm)

//String a=jsonObj.brm.password.fileName
//String repoName=a.replaceAll("\\[", "").replaceAll("\\]","");
String b=jsonObj.brm.password.fileName
String fn=b.replaceAll("\\[", "").replaceAll("\\]","");


httpRequest authentication: 'nexus_cred', contentType: "APPLICATION_JSON", 
   
  sh "wget --user=admin --password=admin123 'http://3.15.18.214:8081/nexus/service/local/repositories/repo/content/${fn}' "
    // httpMode: 'GET', wget --user=admin --password=admin123 "http://3.15.18.214:8081/nexus/service/local/repositories/repo/content/dynamic_new-1.0.war"
    
   // httpMode: 'GET', url: "http://3.15.18.214:8081/nexus/service/local/repositories/repo/content/dynamic_new-1.0.war" 
    
}
