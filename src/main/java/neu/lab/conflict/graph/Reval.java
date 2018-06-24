package neu.lab.conflict.graph;

import neu.lab.conflict.util.MavenUtil;

public class Reval {

	public static int revalClass(String project, String conflict) {
		MavenUtil.i().getLog().info("project:" + project);
		MavenUtil.i().getLog().info("pair-conflict:" + conflict);
		if (conflict == null) {
			return 0;
		}
		if ("org.apache.beam:beam-sdks-java-core:2.2.0".equals(project)) {
			if ("org.mockito:mockito-all:1.9.5:+org.hamcrest:hamcrest-all:1.3:".equals(conflict)) {
				return 2;
			}
			if ("org.mockito:mockito-all:1.9.5:+org.hamcrest:hamcrest-core:1.3:".equals(conflict)) {
				return 2;
			}
		}
		if ("org.wicketstuff:wicketstuff-closure-compiler:8.0.0-M8".equals(project)) {
			if ("com.google.code.gson:gson:2.8.2:+com.google.javascript:closure-compiler:v20170910:".equals(conflict)) {
				return 2;
			}
		}
		if ("io.dashbase.clue:clue:6.6.2-1.0.0".equals(project)) {
			if ("commons-beanutils:commons-beanutils-core:1.8.0:+commons-beanutils:commons-beanutils:1.7.0:"
					.equals(conflict)) {
				return 2;
			}
		}
		if ("com.orientechnologies:orientdb-community-tp2:3.0.0".equals(project)) {
			if ("com.orientechnologies:orientdb-graphdb:3.0.0:+com.orientechnologies:orientdb-server:3.0.0:"
					.equals(conflict)) {
				return 4;
			}
		}
		if ("org.apache.brooklyn:brooklyn-rest-client:1.0.0-SNAPSHOT".equals(project)) {
			if ("org.jboss.spec.javax.ws.rs:jboss-jaxrs-api_2.0_spec:1.0.0.Final:+javax.ws.rs:javax.ws.rs-api:2.0.1:"
					.equals(conflict)) {
				return 3;
			}
		}
		if ("org.springframework.data:spring-data-solr:3.0.0.RELEASE".equals(project)) {
			if ("javax.servlet:servlet-api:3.0-alpha-1:+javax.servlet:javax.servlet-api:3.1.0:".equals(conflict)) {
				return 2;
			}
		}
		if ("nl.nlighten:tomcat_exporter_client:0.0.7-SNAPSHOT".equals(project)) {
			if ("org.apache.tomcat:tomcat-util-scan:8.5.24:+org.apache.tomcat.embed:tomcat-embed-core:8.5.11:"
					.equals(conflict)) {
				return 2;
			}
			if ("org.apache.tomcat.embed:tomcat-embed-core:8.5.11:+org.apache.tomcat:tomcat-catalina:8.5.24:"
					.equals(conflict)) {
				return 2;
			}
		}
		if ("com.facebook.presto.hive:hive-apache:1.2.2-1".equals(project)) {
			if (conflict.contains("org.apache.hive:hive-exec:1.2.2:")) {
				if (conflict.contains("org.apache.thrift:libthrift:0.9.1:")) {
					return 2;
				}
				if (conflict.contains("com.google.guava:guava:14.0.1")) {
					return 1;
				}
				if (conflict.contains("org.apache.hive:hive-common:1.2.2:")) {
					return 1;
				}
				return -1;
			}
		}
		if ("org.apache.accumulo:accumulo-core:1.9.1".equals(project)) {
			if (conflict.contains("commons-beanutils:commons-beanutils-core:1.8.0:")
					&& conflict.contains("commons-beanutils:commons-beanutils:1.7.0:")) {
				return 2;
			}
		}
		if ("org.apache.oozie:oozie-core:5.0.0-beta1".equals(project)) {
			return -1;
		}
		if ("com.horizon:cm:0.0.1-SNAPSHOT".equals(project)) {
			if (conflict.contains("javax.websocket:javax.websocket-api:1.1:")
					&& conflict.contains("org.apache.tomcat:tomcat-websocket-api:7.0.47:")) {
				return 4;
			}
		}
		return 0;
	}

	public static int revalJar(String project, String conflict) {
		MavenUtil.i().getLog().info("project:" + project);
		MavenUtil.i().getLog().info("jar-conflict:" + conflict);
		if (conflict == null) {
			return 0;
		}
		if ("org.apache.beam:beam-sdks-java-core:2.2.0".equals(project)) {
			if ("org.slf4j:slf4j-api".equals(conflict)) {
				return 1;
			}
		}
		if ("org.apache.spark:spark-core_2.11:2.3.1".equals(project)) {
			if ("commons-net:commons-net".equals(conflict)) {
				return 2;
			}
		}
		if ("org.apache.ignite:ignite-aws:2.5.0".equals(project)) {
			if ("com.fasterxml.jackson.core:jackson-databind".equals(conflict)) {
				return 1;
			}
			if ("com.fasterxml.jackson.core:jackson-core".equals(conflict)) {
				return 1;
			}
		}
		if ("org.wicketstuff:wicketstuff-closure-compiler:8.0.0-M8".equals(project)) {
			if ("com.google.code.gson:gson".equals(conflict)) {
				return 1;
			}
			if ("com.google.protobuf:protobuf-java".equals(conflict)) {
				return 1;
			}
			if ("commons-io:commons-io".equals(conflict)) {
				return 1;
			}
			if ("org.hamcrest:hamcrest-core".equals(conflict)) {
				return 1;
			}
		}
		if ("io.dashbase.clue:clue:6.6.2-1.0.0".equals(project)) {
			if ("commons-lang:commons-lang".equals(conflict)) {
				return 1;
			}
			if ("org.apache.commons:commons-math3".equals(conflict)) {
				return 1;
			}
			if ("commons-collections:commons-collections".equals(conflict)) {
				return 1;
			}
		}
		if ("org.apache.activemq:artemis-cdi-client:2.5.0".equals(project)) {
			if ("commons-logging:commons-logging".equals(conflict)) {
				return 1;
			}
			if ("io.netty:netty-common".equals(conflict)) {
				return 1;
			}
			if ("commons-beanutils:commons-beanutils".equals(conflict)) {
				return 1;
			}
			if ("io.netty:netty-codec".equals(conflict)) {
				return 1;
			}
			if ("commons-collections:commons-collections".equals(conflict)) {
				return 1;
			}
		}
		if ("org.apache.apex:apex-engine:3.6.0".equals(project)) {
			if ("commons-io:commons-io".equals(conflict)) {
				return 1;
			}
			if ("commons-lang:commons-lang".equals(conflict)) {
				return 1;
			}
		}
		if ("com.google.javascript:closure-compiler-unshaded:1.0-SNAPSHOT".equals(project)) {
			if ("commons-codec:commons-codec".equals(conflict)) {
				return 1;
			}
			if ("com.google.code.gson:gson".equals(conflict)) {
				return 2;
			}
		}
		if ("org.apache.brooklyn:brooklyn-rest-client:1.0.0-SNAPSHOT".equals(project)) {
			if ("com.fasterxml.jackson.core:jackson-core".equals(conflict)) {
				return 1;
			}
		}
		if ("org.springframework.data:spring-data-solr:3.0.0.RELEASE".equals(project)) {
			if ("commons-lang:commons-lang".equals(conflict)) {
				return 1;
			}
			if ("org.slf4j:slf4j-api".equals(conflict)) {
				return 1;
			}
		}
		if ("org.apache.hadoop:hadoop-minikdc:3.0.0".equals(project)) {
			if ("commons-io:commons-io".equals(conflict)) {
				return 4;
			}
		}
		if ("org.apache.accumulo:accumulo-core:1.9.1".equals(project)) {
			if ("commons-lang:commons-lang".equals(conflict)) {
				return 1;
			}
			if ("com.google.code.gson:gson".equals(conflict)) {
				return 1;
			}
			if ("commons-io:commons-io".equals(conflict)) {
				return 1;
			}
			if ("commons-collections:commons-collections".equals(conflict)) {
				return 1;
			}
		}
		if ("com.facebook.presto.hive:hive-apache:1.2.2-1".equals(project)) {
			if ("org.codehaus.jackson:jackson-mapper-asl".equals(conflict)) {
				return 1;
			}
		}
		if ("com.horizon:cm:0.0.1-SNAPSHOT".equals(project)) {
			if ("com.fasterxml.jackson.core:jackson-core".equals(conflict)) {
				return 1;
			}
			if ("commons-logging:commons-logging".equals(conflict)) {
				return 1;
			}
		}
		if ("org.eclipse.jetty:jetty-jspc-maven-plugin:9.2.23.v20171218".equals(project)) {
			if ("org.apache.maven:maven-project".equals(conflict)) {
				return 2;
			}
			if ("org.apache.maven:maven-model".equals(conflict)) {
				return 2;
			}
		}
		return 0;
	}
}
