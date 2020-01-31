import groovy.json.JsonSlurper 
@NonCPS
def call(message)
{
 def request = libraryResource 'bamboo.json'
 def jsonSlurper = new JsonSlurper() 
 def resultJson = jsonSlurper.parseText(request)
 def key = resultJson.bambookey
  Date date = new Date() 
 sh " echo '${date}' ${message} '${bambookey}'>>log.txt"
}
