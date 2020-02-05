def call(JSON){
def jsonString = JSON
def jsonObj = readJSON text: jsonString
println(jsonObj.ci)

String a=jsonObj.ci.label.name
String name=a.replaceAll("\\[", "").replaceAll("\\]","");
String b=jsonObj.ci.projectplankey.key
String key=b.replaceAll("\\[", "").replaceAll("\\]","");
String c=jsonObj.ci.build.buildNumber
String bno=c.replaceAll("\\[", "").replaceAll("\\]","");

println(name)
println(key)
println(bno)


httpRequest authentication: 'bamboo', contentType: 'APPLICATION_JSON', customHeaders: [[maskValue: false, name: 'Content-Type', value: 'application/json']], httpMode: 'POST', requestBody: """
    {
	"name":"${name}"
}
}""", responseHandle: 'NONE', url:"http://18.220.143.53:8085/rest/api/latest/result/${key}-${bno}/label"
 }
