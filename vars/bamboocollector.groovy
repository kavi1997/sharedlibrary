import groovy.json.JsonSlurper 

@NonCPS
detailplan(String data){
def jsonSlurper = new JsonSlurper() 
def resultJson = jsonSlurper.parseText(data)
def key= resultJson.key

httpRequest authentication: 'bamboo', contentType: "APPLICATION_JSON", 
    
    httpMode: 'GET', url: "http://3.15.18.214:8081/nexus/service/local/repositories/${key}.json"
}
	def call(){
def request = libraryResource 'bamboolist.json'
detailplan(request)
}
