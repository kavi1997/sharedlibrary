def call(jsondata){
def jsonString = jsondata
//println(jsonString)
def jsonObj = readJSON text: jsonString
println(jsonObj.brm)

String a=jsonObj.brm.repositories.repository.name
String repoName=a.replaceAll("\\[", "").replaceAll("\\]","");
String b=jsonObj.brm.repositories.repository.id
String repoid=b.replaceAll("\\[", "").replaceAll("\\]","");

httpRequest authentication: 'nexus_cred', contentType: "APPLICATION_JSON", 
    
    httpMode: 'POST', requestBody: 
  """{
    	"data":
	{
		"repoType": "hosted",
        "id": ${repoid},
        "name": ${repoName},
        
	}
        
   }""", url: "http://3.15.18.214:8081/nexus/service/local/repositories"
}
