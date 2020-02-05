def call(jsondata){
def jsonString = jsondata
//println(jsonString)
def jsonObj = readJSON text: jsonString
println(jsonObj.brm)

String a=jsonObj.brm.password.oldPassword
String oldpass=a.replaceAll("\\[", "").replaceAll("\\]","");
String b=jsonObj.brm.password.userId
String userid=b.replaceAll("\\[", "").replaceAll("\\]","");
String c=jsonObj.brm.password.newPassword
String newpass=c.replaceAll("\\[", "").replaceAll("\\]","");
	println(repoName)
	println(repoid)
	

httpRequest authentication: 'nexus_cred', contentType: "APPLICATION_JSON", 
    
    httpMode: 'POST', requestBody: 
  """{
    	"data":
	{
        "oldPassword":${oldpass},
"userId":${userid},
"newPassword":${newpass}
             
	}
        
   }""", url: "http://3.15.18.214:8081/nexus/service/local/users_setpw"
}
