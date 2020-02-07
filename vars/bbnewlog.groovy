def call(message,JSON)
{
  
def jsonString = JSON
def jsonObj = readJSON text: jsonString
println(jsonObj.ci)

String a=jsonObj.ci.projectplankey.key
String plankey=a.replaceAll("\\[", "").replaceAll("\\]","");
String b=jsonObj.ci.id.deploymentProjectId
String deploymentprojectid=b.replaceAll("\\[", "").replaceAll("\\]","");


String deletedprojectname=c.replaceAll("\\[", "").replaceAll("\\]","");
  
 println(message)
  def mes="deployment"
  Date date = new Date() 
  if ( message.toLowerCase().indexOf(mes.toLowerCase()) != -1 ) {

{
      sh " echo '${date}' Bamboo  ${message} '${deploymentprojectid}' >>log.txt"
     }
   /* else if(message.contains(deleted))
          {
              sh " echo '${date}' Bamboo  ${message} '${deletedname}' >>log.txt"
          } */
     else
     {
       sh " echo '${date}' Bamboo  ${message} '${plankey}' >>log.txt"
     }
}
