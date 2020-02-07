def call(message)
{
  
/*def jsonString = jsondata
def jsonObj = readJSON text: jsonString
//println(jsonObj.alm)

String a=jsonObj.brm.repositories.repository.id
String rid=a.replaceAll("\\[", "").replaceAll("\\]","");
  
 env.name = rid
 //println(message)*/
  Date date = new Date() 
  sh " echo '${date}' NEXUS ${message} >>log.txt"
}
