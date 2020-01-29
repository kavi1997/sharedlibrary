
def call(){
sh 'curl -X GET -v -u admin:admin123 -H "ContentType: application/json; charset=UTF-8" -d "@detail.json" "http://3.15.18.214:8081/nexus/service/local/repositories/${id}"'
  }

