import groovy.json.JsonSlurper 

@NonCPS
createProject(String data){
def jsonSlurper = new JsonSlurper() 
def resultJson = jsonSlurper.parseText(data)
def id = '"'+resultJson.id+'"'
def name= '"'+name+'"'
 
 httpRequest authentication: 'nexus', 
    customHeaders: [[maskValue: false, name: 'Content-Type', value: 'application/json'], 
                    [maskValue: false, name: 'Accept', value: 'application/json']], 
    httpMode: 'POST', requestBody: """{
       "repoType": "hosted",
        "id": ${id},
        "name": ${name},
        "repoPolicy": "RELEASE",
        "provider": "maven2",
        "providerRole": "org.sonatype.nexus.proxy.repository.Repository",
        "exposed": true,
        "format": "maven2"
    
}""", responseHandle: 'NONE', url: 'http://3.15.18.214:8081/nexus/service/local/repositories'

 
}
def call(){
 def request = libraryResource 'data.json'
 createProject(request)
}
