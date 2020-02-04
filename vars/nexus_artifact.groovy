def call()
{
sh 'curl -X GET -i -H  "Accept: application/json" -H "Content-Type: application/json" /*-d "@repo.json" */-u admin:admin123 "http://3.15.18.214:8081/nexus/service/local/artifact/maven/redirect?r=repo&g=Codekillers&a=dynamic_new&v=1.0"'
}
