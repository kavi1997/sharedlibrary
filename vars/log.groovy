import jenkins.model.*
 
def call(String msg ="msg")
{
 sh 'echo "${msg}">>log.txt'
}
