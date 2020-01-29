import groovy.json.JsonSlurper 

/*@NonCPS
createRepo(String data){
def jsonSlurper = new JsonSlurper() 
def resultJson = jsonSlurper.parseText(data)
def name = resultJson.stage*/
//def projUrl = resultJson.url
def call()
{
httpRequest authentication: 'nexus_cred', contentType: "APPLICATION_JSON", 
    
    httpMode: 'POST', requestBody: 
  """{
"stage":[
{
"stage"	:"TestStage",
"Job":"new"
},
{
"stage"	:"TestStage",
"Job":"one"
}
]

}""" ,url: "http://18.220.143.53:8085/rest/api/latest/queue/LAT-WEB"
}
/*def call(){
def request = libraryResource 'data.json'
createRepo(request)
}*/
