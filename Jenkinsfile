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
stage('sending mail')
{
    emailext body: '''<html> 
<body> 
<p>  BUILD NUMBER: ${BUILD_NUMBER}</p>
<p>  BUILD STATUS: ${BUILD_STATUS}</p>
<p> JOB IS WAITING FOR THE APPROVAL FROM ADMIN TO DEPLOY TO PRODUCTION </p>
<P>  <a href="${BUILD_URL}" style="padding: 5px 10px; background-color: #808080; color: white; text-decoration: none; border-radius: 5px;">CLICK TO APPROVE</a></P>
</body>
</html>''', replyTo: 'sreeram@tarkasoft.com', subject: 'SENT FROM JENKINS REGARDS JOBNAME: ${JOB_NAME}',  from:'jenkins@example.com', to: 'sreeram@tarkasoft.com'
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