node('master') {
    // some block
    stage('build and push') {
    // some block\
    sh 'mvn clean install'
    //pushToCloudFoundry cloudSpace: 'test-space', credentialsId: 'cfapps.io', organization: 'test-org', target: 'api.run.pivotal.io'
    pushToCloudFoundry cloudSpace: 'test-space', credentialsId: 'c993fecc-87e1-4632-b1c1-35c8828cbf7e', organization: 'test-org', target: 'api.run.pivotal.io'
    
}
    
}
