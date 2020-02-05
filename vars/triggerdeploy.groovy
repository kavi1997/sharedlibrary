def call(JSON){
def jsonString = JSON
//println(jsonString)
def jsonObj = readJSON text: jsonString
println(jsonObj.ci)

String a=jsonObj.ci.version.environmentId
String eid=a.replaceAll("\\[", "").replaceAll("\\]","");
String b=jsonObj.ci.version.versionId
String vid=b.replaceAll("\\[", "").replaceAll("\\]","");
println(eid)
println(vid)

httpRequest authentication: 'bamboo', contentType: 'APPLICATION_JSON', customHeaders: [[maskValue: false, name: 'Content-Type', value: 'application/json']], httpMode: 'POST', requestBody: """

    
}""", responseHandle: 'NONE', url:"http://18.220.143.53:8085/rest/api/latest/queue/deployment?environmentId=${eid}&versionId=${vid}"
  
  }
