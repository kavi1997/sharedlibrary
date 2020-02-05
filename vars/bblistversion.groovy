def call(JSON){
def jsonString = JSON
def jsonObj = readJSON text: jsonString

String a=jsonObj.ci.id.deploymentProjectId
String id=a.replaceAll("\\[", "").replaceAll("\\]","");
println(id)
sh "curl -X GET -i -H  "Accept: application/json" -H "Content-Type: application/json" -d  -u rig:rigaDapt@devOps "http://18.220.143.53:8085/rest/api/latest/deploy/project/"$id"/versions" "
 }
