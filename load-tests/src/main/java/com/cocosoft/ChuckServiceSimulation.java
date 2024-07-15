package com.cocosoft;

import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpDsl;
import io.gatling.javaapi.http.HttpProtocolBuilder;

public class ChuckServiceSimulation extends Simulation {
	HttpProtocolBuilder httpProtocol =
			HttpDsl.http.baseUrl("http://chuck-service.spring-k8s")
					.acceptHeader("application/json")
					.contentTypeHeader("application/json");


	ScenarioBuilder scenario = CoreDsl.scenario("Chuck-Service")
			.exec(HttpDsl.http("joke").get("/api/random"));

	{
		setUp(
				scenario.injectOpen(CoreDsl.constantUsersPerSec(300).during(120))
		).protocols(httpProtocol);
	}
}
