def call(jsondata){
def jsonString = jsondata
//println(jsonString)
def jsonObj = readJSON text: jsonString
println(jsonObj.brm)

String a=jsonObj.brm.user.userId
String userid=a.replaceAll("\\[", "").replaceAll("\\]","");
String b=jsonObj.brm.user.email
String emailid=b.replaceAll("\\[", "").replaceAll("\\]","");
String c=jsonObj.brm.user.status
String statuss=c.replaceAll("\\[", "").replaceAll("\\]","");
String d=jsonObj.brm.user.roles.role
String rolee=d.replaceAll("\\[", "").replaceAll("\\]","");
String e=jsonObj.brm.user.lastName
String ln=e.replaceAll("\\[", "").replaceAll("\\]","");
String g=jsonObj.brm.user.password
String pwd=g.replaceAll("\\[", "").replaceAll("\\]","");
String f=jsonObj.brm.user.firstname
String fn=f.replaceAll("\\[", "").replaceAll("\\]","");
	println(userid)
	println()
	

httpRequest authentication: 'nexus_cred', contentType: "APPLICATION_JSON", 
    
    httpMode: 'POST', requestBody: 
  """{
    	{
	"data":
	{
		"userId":${userid},
		"email":&{emailid},
		"status":${statuss},
		"firstName":${fn},
		"roles":{
			"role":${rolee}
		},
		"lastName":${ln},
		"password":${pwd}
		
		
	}
	}
        
   }""", url: "http://3.15.18.214:8081/nexus/service/local/users"
}
