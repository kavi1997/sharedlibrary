def call(jsondata){
def jsonString = jsondata
//println(jsonString)
def jsonObj = readJSON text: jsonString
//println(jsonObj.brm)

//String a=jsonObj.data.name
//String repoName=a.replaceAll("\\[", "").replaceAll("\\]","");
String b=jsonObj.brm.repositories.repository.id
String repoid=b.replaceAll("\\[", "").replaceAll("\\]","");
sh "curl -X GET -i -H  -d  -u admin:admin123 http://3.15.18.214:8081/nexus/service/local/repositories/${repoid}/status "| json_reformat
//httpRequest authentication: 'nexus_cred', contentType: "APPLICATION_JSON", 
    
    //httpMode: 'GET', url: "http://3.15.18.214:8081/nexus/service/local/repositories/${repoid}/status"
    
}
