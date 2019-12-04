pipeline {
  agent any 
  
  stages {
    stage ('Compile Stage') {
      
      steps {
        echo 'Setting environment'
        bat 'set PATH=%PATH%;C:\Product\Java\jdk-13.0.1\bin'
      }
      steps { 
        echo 'Running compile stage'
        bat 'javac HelloWorld.java'
      }
    }
    
   stage ('Test Stage') {
     steps { 
      echo 'Running Test stage'
      bat 'java HelloWorld'
     }
    }
  }
}
