#!/var/lib/jenkins/groovy-2.4.10/bin/groovy
user = hudson.model.user.get('username')
prop = user.getProperty(jenkins.security.ApiTokenProperty.class)
println(prop.getApiToken())
