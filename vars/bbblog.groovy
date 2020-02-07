def call(message,JSON)
{
  
def jsonString = JSON
def jsonObj = readJSON text: jsonString
println(jsonObj.ci)


String a=jsonObj.ci.id.deploymentProjectId
String deploymentprojectid=a.replaceAll("\\[", "").replaceAll("\\]","");
  
 println(message)
 
  Date date = new Date() 
 
      sh " echo '${date}' Bamboo  ${message} '${deploymentprojectid}' >>log.txt"
    
     
}
