def call(JSON){
def jsonString = JSON
//println(jsonString)
def jsonObj = readJSON text: jsonString
println(jsonObj.ci)

String a=jsonObj.ci.deploy.name
String name=a.replaceAll("\\[", "").replaceAll("\\]","");
String b=jsonObj.ci.projectplankey.key
String key=b.replaceAll("\\[", "").replaceAll("\\]","");
String c=jsonObj.ci.id.deploymentProjectId
String did=c.replaceAll("\\[", "").replaceAll("\\]","");
println(name)
println(key)
println(did)

httpRequest authentication: 'bamboo', contentType: 'APPLICATION_JSON', customHeaders: [[maskValue: false, name: 'Content-Type', value: 'application/json']], httpMode: 'POST', requestBody: """
{
    	
"name":"${name}",
"planKey":{
"key":"${key}"

}
    
}""", responseHandle: 'NONE', url:"http://18.220.143.53:8085/rest/api/latest/deploy/project/${did}"
  
  }
