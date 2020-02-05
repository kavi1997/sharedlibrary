def call()
{
sh "wget --user=admin --password=admin123 'http://3.15.18.214:8081/nexus/service/local/artifact/maven/content?g=Codekillers&a=dynamic_new&v=1.0&r=repo' "
 
}
