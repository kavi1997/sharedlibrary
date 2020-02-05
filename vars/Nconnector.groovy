def call(jsondata){
def jsonString = jsondata
//println(jsonString)
def jsonObj = readJSON text: jsonString
//println(jsonObj.brm)

String a=jsonObj.data.name
String repoName=a.replaceAll("\\[", "").replaceAll("\\]","");
String b=jsonObj.data.id
String repoid=b.replaceAll("\\[", "").replaceAll("\\]","");

httpRequest authentication: 'nexus_cred', contentType: "APPLICATION_JSON", 
    
    httpMode: 'POST', requestBody: 
  """{
    	"data":
	{
		
        "id": ${repoid},
        "name": ${repoName}
        "repoType": "hosted",
        "repoPolicy": "RELEASE",
        "provider": "maven2",
        "providerRole": "org.sonatype.nexus.proxy.repository.Repository",
        "exposed": true,
        "format": "maven2"
}
}
        
	}
        
   }""", url: "http://3.15.18.214:8081/nexus/service/local/repositories"
}
