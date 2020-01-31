import groovy.json.JsonSlurper 

@NonCPS
detailplan(String data){
def jsonSlurper = new JsonSlurper() 
def resultJson = jsonSlurper.parseText(data)
def key= resultJson.key

httpRequest authentication: 'bamboo', contentType: "APPLICATION_JSON", 
    
    httpMode: 'GET', url: "http://18.220.143.53:8085/rest/api/latest/plan/${key}.json"
}
	def call(){
def request = libraryResource 'bamboo.json'
detailplan(request)
}
