pipeline {
  agent {
    label '!windows'
  }
  
  environment {
    JAVA_HOME = 'C:\Product\Java\jdk-13.0.1'
    PATH = '%PATH%:C:\Product\Java\jdk-13.0.1\bin'
  }
  stages {
    stage ('Compile Stage') {
      
      steps { 
        echo 'Running compile stage'
        bat 'set'
         }
    }
    
   stage ('Test Stage') {
     steps { 
      echo 'Running Test stage'
     
     }
    }
  }
}
