node('master')
{
stage('Download') 
{
    git 'https://github.com/Sreeramvr/Tarka.git'
} 
stage('Build') 
{
    sh 'mvn package'
} 
stage('Waiting for approval') 
{
   input 'NEED APPROVAL FROM THE ADMIN TO DEPLOY TO PRODUCTION '
}
stage('Deployment') 
{
    sh 'scp /home/ubuntu/.jenkins/workspace/development/target/Tarka.war ubuntu@172.31.44.23:/var/lib/tomcat9/webapps/demo.war'
}
}