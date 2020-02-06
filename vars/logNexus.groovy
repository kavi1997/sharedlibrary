def call(message,jsondata)
{
  
def jsonString = jsondata
def jsonObj = readJSON text: jsonString
println(jsonObj.alm)

String a=jsonObj.brm.repositories.repository.name
String projectName=a.replaceAll("\\[", "").replaceAll("\\]","");
  
 env.name = projectName
 println(message)
  Date date = new Date() 
  sh " echo '${date}' NEXUS '${projectName}' ${message} >>log.txt"
}
