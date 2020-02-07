def call(JSON){
def jsonString = JSON
def jsonObj = readJSON text: jsonString
println(jsonObj.ci)

String a=jsonObj.ci.projectkey.key
String key=a.replaceAll("\\[", "").replaceAll("\\]","");

println(key)


httpRequest authentication: 'bamboo', contentType: 'APPLICATION_JSON', customHeaders: [[maskValue: false, name: 'Content-Type', value: 'application/json']], httpMode: 'DELETE', requestBody: """
    
}""", responseHandle: 'NONE', url:"http://18.220.143.53:8085/rest/api/latest/project/${key}"
  
  }
