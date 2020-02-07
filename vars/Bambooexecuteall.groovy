def call(JSON){
def jsonString = JSON
def jsonObj = readJSON text: jsonString
println(jsonObj.ci)

String a=jsonObj.ci.Stages.name
String sname=a.replaceAll("\\[", "").replaceAll("\\]","");
String b=jsonObj.ci.projectplankey.key
String key=b.replaceAll("\\[", "").replaceAll("\\]","");
String c=jsonObj.ci.Stages.jobs.name
String jname=c.replaceAll("\\[", "").replaceAll("\\]","");

println(sname)
println(key)
println(jname)


httpRequest authentication: 'bamboo', contentType: 'APPLICATION_JSON', customHeaders: [[maskValue: false, name: 'Content-Type', value: 'application/json']], httpMode: 'POST', requestBody: """
    {
"stage":[
{
"name":"${sname}",
"Job":"${jname}"
}
]
}""", responseHandle: 'NONE', url:"http://18.220.143.53:8085/rest/api/latest/queue/${key}"
 }
