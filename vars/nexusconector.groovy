//import groovy.json.JsonSlurper 

/*@NonCPS
createRepo(String data){
def jsonSlurper = new JsonSlurper() 
def resultJson = jsonSlurper.parseText(data)
def repoName = resultJson.name
def rid = resultJson.id
//def projUrl = resultJson.url*/
def  call(){
httpRequest authentication: 'nexus_cred', contentType: "APPLICATION_JSON", 
    
    httpMode: 'POST', requestBody: 
  {
    	"data":
	{
		"repoType": "hosted",
        "id": "id7",
        "name": "repo7",
        "repoPolicy": "RELEASE",
        "provider": "maven2",
        "providerRole": "org.sonatype.nexus.proxy.repository.Repository",
        "exposed": true,
        "format": "maven2"
	}
        
   }
        
   , responseHandle: 'NONE', url: "http://3.15.18.214:8081/nexus/service/local/repositories"
}
/*def call(){
def request = libraryResource 'data.json'
createRepo(request)
}*/
