def call(){
sh "curl -X GET -i -H  -d  -u admin:admin123 http://3.15.18.214:8081/nexus/service/local/repositories/${repoid}/status"
}













