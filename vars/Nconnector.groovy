def call(jsondata){
def jsonString = jsondata
//println(jsonString)
def jsonObj = readJSON text: jsonString
//println(jsonObj.brm)

String a=jsonObj.name
String repoName=a.replaceAll("\\[", "").replaceAll("\\]","");
String b=jsonObj.id
String repoid=b.replaceAll("\\[", "").replaceAll("\\]","");

httpRequest authentication: 'nexus_cred', contentType: "APPLICATION_JSON", 
    
    httpMode: 'POST', requestBody: 
  """{
    	"data":
	{
		
        "id": ${repoid},
        "name": ${repoName}
        
	}
        
   }""", url: "http://3.15.18.214:8081/nexus/service/local/repositories"
}
