def call(jsondata){
def jsonString = jsondata
//println(jsonString)
def jsonObj = readJSON text: jsonString
println(jsonObj.scm)

String a=jsonObj.ci.deploy.name
String name=a.replaceAll("\\[", "").replaceAll("\\]","");
String b=jsonObj.ci.deploy.key
String key=b.replaceAll("\\[", "").replaceAll("\\]","");
println(name)
println(key)

httpRequest authentication: 'bamboo', contentType: 'APPLICATION_JSON', customHeaders: [[maskValue: false, name: 'Content-Type', value: 'application/json']], httpMode: 'POST', requestBody: """
{
    	
"name":"${name}",
"planKey":{
"key":"${key}"

}
    
}""", responseHandle: 'NONE', url:"http://18.220.143.53:8085/rest/api/latest/deploy/project/5767169"
  
  }
