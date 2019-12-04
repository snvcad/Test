pipeline {
  agent any
  
  stages {
    stage ('Compile Stage') {
      
      steps { 
        echo 'Running compile stage'
        echo "${env.JAVA_HOME}"
        bat "${env.JAVA_HOME}\\bin\\javac HelloWorld.java"
      }
    }
    
   stage ('Test Stage') {
     steps { 
      echo 'Running Test stage'
       bat "${env.JAVA_HOME}\\bin\\java HelloWorld"
     
     }
    }
  }
}
