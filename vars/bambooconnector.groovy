import groovy.json.JsonSlurper 

@NonCPS
exeStage(String data){
def jsonSlurper = new JsonSlurper() 
def resultJson = jsonSlurper.parseText(data)
def name = resultJson.stage

httpRequest authentication: 'bamboo', contentType: "APPLICATION_JSON", 
    
    httpMode: 'POST', requestBody: 
  """{
"stage":[
{
"stage"	:"${name}",
"Job":"new"
},
{
"stage"	:"${name}",
"Job":"one"
}
]

}""" ,url: "http://18.220.143.53:8085/rest/api/latest/queue/LAT-WEB"
}
def call(){
def request = libraryResource 'bamboo.json'
exeStage(request)
}
