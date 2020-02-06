def call(jsondata){
def jsonString = jsondata
//println(jsonString)
def jsonObj = readJSON text: jsonString
//println(jsonObj.brm)

//String a=jsonObj.data.name
//String repoName=a.replaceAll("\\[", "").replaceAll("\\]","");
String a=jsonObj.brm.user.userId
String userid=a.replaceAll("\\[", "").replaceAll("\\]","");
String b=jsonObj.brm.repositories.repository.id
String repoid=b.replaceAll("\\[", "").replaceAll("\\]","");
String c=jsonObj.brm.password.id
String pid=c.replaceAll("\\[", "").replaceAll("\\]","");


sh "curl -X GET -i -H  -d  -u admin:admin123 http://3.15.18.214:8081/nexus/service/local/users/${userid} "
sh "curl -X GET -i -H  -d  -u admin:admin123 http://3.15.18.214:8081/nexus/service/local/repositories/${repoid}/status"
sh "curl -X GET -i -H  -d  -u admin:admin123 http://3.15.18.214:8081/nexus/service/local/repositories/${repoid} "
sh "curl -X GET -i -H  -d  -u admin:admin123 http://3.15.18.214:8081/nexus/service/local/repositories"
sh "curl -X GET -i -H  -d  -u admin:admin123 http://3.15.18.214:8081/nexus/service/local/privileges/${pid}"
}
