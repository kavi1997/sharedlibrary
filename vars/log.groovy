import jenkins.model.*
 jenkins = Jenkins.instance
def call(String msg ="msg")
{
  sh 'echo "${msg}">>log.txt'
}
