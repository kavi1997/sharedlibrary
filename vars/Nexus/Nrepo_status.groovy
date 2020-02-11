def call(JSON){
def jsonString = JSON
//println(jsonString)
def jsonObj = readJSON text: jsonString
//println(jsonObj.brm)

//String a=jsonObj.data.name
//String repoName=a.replaceAll("\\[", "").replaceAll("\\]","");
String b=jsonObj.brm.repositories.repository.id
String repoid=b.replaceAll("\\[", "").replaceAll("\\]","");
    withCredentials([usernamePassword(credentialsId: 'nexus_cred', passwordVariable: 'password', usernameVariable:'username')]) {
sh "curl -X GET -i -H  -d  -u $username:$password http://3.15.18.214:8081/nexus/service/local/repositories/${repoid}/status"
//httpRequest authentication: 'nexus_cred', contentType: "APPLICATION_JSON", 
    
    //httpMode: 'GET', url: "http://3.15.18.214:8081/nexus/service/local/repositories/${repoid}/status"
    
}
