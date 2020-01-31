import groovy.json.JsonSlurper 
@NonCPS
/*createlog(String data, string message){
def jsonSlurper = new JsonSlurper() 
def resultJson = jsonSlurper.parseText(data)
def projectName = resultJson.key
sh "echo ${message} >log.txt"
/*def fileName = "log.txt"
def inputFile = new File(fileName)
if(inputFile.exists())
  {
    inputFile.append("${projectName}")
  }
  else
  {
     inputFile.write("${projectName}")
  }
}*/
//}
def call(message)
{
 println(message)
 def request = libraryResource 'data.json'
 def jsonSlurper = new JsonSlurper() 
 def resultJson = jsonSlurper.parseText(request)
 def rid = resultJson.id
  Date date = new Date() 
  sh " echo '${date}' JIRA project with the projectname '${rid}' ${message} >>log.txt"
}
