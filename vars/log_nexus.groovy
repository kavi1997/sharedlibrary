import groovy.json.JsonSlurper 
@NonCPS

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
