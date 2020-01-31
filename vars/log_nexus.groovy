import groovy.json.JsonSlurper 
@NonCPS

def call(message)
{
 println(message)
 def request = libraryResource 'nexus.json'
 def jsonSlurper = new JsonSlurper() 
 def resultJson = jsonSlurper.parseText(request)
 def rid = resultJson.id
  Date date = new Date() 
  sh " echo '${date}' Nexus project with the repoid '${rid}' ${message} >>log.txt"
}
