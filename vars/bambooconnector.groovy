import groovy.json.JsonSlurper 

/*@NonCPS
createRepo(String data){
def jsonSlurper = new JsonSlurper() 
def resultJson = jsonSlurper.parseText(data)
def name = resultJson.stage*/
//def projUrl = resultJson.url
def call()
{
httpRequest authentication: 'bamboo', contentType: 'APPLICATION_JSON', customHeaders: [[maskValue: false, name: 'Content-Type', value: 'application/json']], httpMode: 'POST', requestBody: """
{
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

}""", responseHandle: 'NONE', url: "http://18.220.143.53:8085/rest/api/latest/queue/LAT-WEB"
}
}
/*def call(){
def request = libraryResource 'data.json'
createRepo(request)
}*/
