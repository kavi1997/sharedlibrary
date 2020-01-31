import groovy.json.JsonSlurper 
@NonCPS
def call(message)
{
 def request = libraryResource 'bamboo1.json'
 def jsonSlurper = new JsonSlurper() 
 def resultJson = jsonSlurper.parseText(request)
 def key = resultJson.key
  Date date = new Date() 
 sh " echo '${date}' ${message} '${key}'>>log.txt"
}
