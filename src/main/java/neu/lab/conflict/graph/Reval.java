package neu.lab.conflict.graph;

import neu.lab.conflict.util.MavenUtil;

public class Reval {
	public static int revalClass(String project,String conflict) {
		MavenUtil.i().getLog().info("project:"+project);
		MavenUtil.i().getLog().info("pair-conflict:"+conflict);
		if("org.apache.beam:beam-sdks-java-core:2.2.0".equals(project)) {
			if("org.mockito:mockito-all:1.9.5:+org.hamcrest:hamcrest-all:1.3:".equals(conflict)) {
				return 2;
			}
			if("org.mockito:mockito-all:1.9.5:+org.hamcrest:hamcrest-core:1.3:".equals(conflict)) {
				return 2;
			}
		}
		return 0;
	}
	public static int revalJar(String project,String conflict) {
		MavenUtil.i().getLog().info("project:"+project);
		MavenUtil.i().getLog().info("jar-conflict:"+conflict);
		if("org.apache.beam:beam-sdks-java-core:2.2.0".equals(project)) {
			if("org.slf4j:slf4j-api".equals(conflict)) {
				return 1;
			}
		}
		return 0;
	}
}
