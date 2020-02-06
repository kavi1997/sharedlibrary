def call(jsondata){
def jsonString = jsondata
//println(jsonString)
def jsonObj = readJSON text: jsonString
//println(jsonObj.brm)

//String a=jsonObj.data.name
//String repoName=a.replaceAll("\\[", "").replaceAll("\\]","");
String b=jsonObj.data.id
String repoid=b.replaceAll("\\[", "").replaceAll("\\]","");


httpRequest authentication: 'nexus_cred', contentType: "APPLICATION_JSON", 
   
    wget --user=admin --password=admin123 'http://3.15.18.214:8081/nexus/service/local/repositories/repo/content/dynamic_new-1.0.war'
    // httpMode: 'GET', wget --user=admin --password=admin123 "http://3.15.18.214:8081/nexus/service/local/repositories/repo/content/dynamic_new-1.0.war"
    
   // httpMode: 'GET', url: "http://3.15.18.214:8081/nexus/service/local/repositories/repo/content/dynamic_new-1.0.war" 
    
}
