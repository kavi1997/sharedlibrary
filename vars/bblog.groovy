def call(message,jsondata)
{
  
def jsonString = jsondata
def jsonObj = readJSON text: jsonString
println(jsonObj.ci)

String a=jsonObj.ci.projectplankey.key
String b=jsonObj.ci.id.deploymentProjectId
String c=jsonObj.ci.projectkey.key
String plankey=a.replaceAll("\\[", "").replaceAll("\\]","");
String deploymentprojectid=b.replaceAll("\\[", "").replaceAll("\\]","");
String deletedprojectname=c.replaceAll("\\[", "").replaceAll("\\]","");
  
 println(message)
  def mes=message
  Date date = new Date() 
  if(message.contains(deployment))
     {
      sh " echo '${date}' Bamboo  ${message} '${deploymentprojectid}' >>log.txt"
     }
  else if(message.contains(deleted)
          {
              sh " echo '${date}' Bamboo  ${message} '${deletedname}' >>log.txt"
          }
     else
     {
       sh " echo '${date}' Bamboo  ${message} '${plankey}' >>log.txt"
     }
