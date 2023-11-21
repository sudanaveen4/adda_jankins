pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn.bat clean install'
            }
        }

        // Add more stages for additional tasks (e.g., testing, deployment)
    }
}
