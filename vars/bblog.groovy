def call(message,jsondata)
{
  
def jsonString = jsondata
def jsonObj = readJSON text: jsonString
println(jsonObj.alm)

String a=jsonObj.alm.projects.project.project_name
String projectName=a.replaceAll("\\[", "").replaceAll("\\]","");
  
 env.name = projectName
 println(message)
  Date date = new Date() 
  sh " echo '${date}' JIRA '${projectName}' ${message} >>log.txt"
}
