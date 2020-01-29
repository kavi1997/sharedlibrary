import groovy.json.JsonSlurper 

@NonCPS
createRepo(String data){
def jsonSlurper = new JsonSlurper() 
def resultJson = jsonSlurper.parseText(data)
def repoName = resultJson.name
//def rid = resultJson.id
//def projUrl = resultJson.url
httpRequest authentication: 'bitbucket', contentType: 'APPLICATION_JSON', customHeaders: [[maskValue: false, name: 'Content-Type', value: 'application/json']], httpMode: 'POST', requestBody: """
{
    "name": "${repoName}",
    "scmId": "git",
    "forkable": true
}""", responseHandle: 'NONE', url: "http://3.15.18.214:8081/nexus/service/local/repositories"
}
def call(){
def request = libraryResource 'data.json'
createRepo(request)
}
