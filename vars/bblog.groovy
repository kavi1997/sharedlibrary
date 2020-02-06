def call(message,jsondata)
{
  
def jsonString = jsondata
def jsonObj = readJSON text: jsonString
println(jsonObj.ci)

String a=jsonObj.ci.projectplankey.key
String plankey=a.replaceAll("\\[", "").replaceAll("\\]","");
  
 env.name = projectName
 println(message)
  Date date = new Date() 
  sh " echo '${date}' Bamboo  ${message} '${plankey}' >>log.txt"
}
