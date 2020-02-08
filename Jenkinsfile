pipeline{
    agent any
    stages{
        stage("Start the pipeline"){
            steps{
                sh 'echo Starting the fine pipeline'
                
            }
        }
        
        stage("Git "){
            steps{
                git 'https://github.com/ghabarid/cucumber.git'
                
            }
        }
      
        stage("Maven "){
            steps{
                withMaven(maven: 'maven') {
                    sh 'mvn clean test'
    // some block
            }
            }
        }
        

    }
    
}
